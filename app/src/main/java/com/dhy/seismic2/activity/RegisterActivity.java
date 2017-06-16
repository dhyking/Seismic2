package com.dhy.seismic2.activity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.dhy.seismic2.BaseApplication;
import com.dhy.seismic2.R;
import com.dhy.seismic2.base.BaseActivity;
import com.dhy.seismic2.daos.bean.KeyValueModel;
import com.dhy.seismic2.daos.bean.UserInfoModel;
import com.dhy.seismic2.daos.dao.UserInfoModelDao;
import com.dhy.seismic2.utils.AccountValidatorUtil;
import com.dhy.seismic2.utils.DateTimeUtil;
import com.dhy.seismic2.utils.LoginUserUtil;
import com.dhy.seismic2.utils.StringUtils;
import com.dhy.seismic2.utils.SyncDataSaveUtil;
import com.dhy.seismic2.utils.ToastUtil;
import com.dhy.seismic2.widget.dialog.DialogList;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity {


    @BindView(R.id.user_add_name_et)
    EditText mUserAddNameEt;
    @BindView(R.id.user_add_pwd_et)
    EditText mUserAddPwdEt;
    @BindView(R.id.user_add_pwd_et_again)
    EditText mUserAddPwdEtAgain;
    @BindView(R.id.user_add_unit_et)
    TextView mUserAddUnitEt;
    @BindView(R.id.user_add_major_et)
    EditText mUserAddMajorEt;
    @BindView(R.id.user_add_number_et)
    EditText mUserAddNumberEt;
    @BindView(R.id.user_add_role_et)
    EditText mUserAddRoleEt;
    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.user_add_sex_rg)
    RadioGroup mUserAddSexRg;
    @BindView(R.id.user_add_type_rg)
    RadioGroup mUserAddTypeRg;
    @BindView(R.id.ll_password)
    LinearLayout mLlPassword;

    private UserInfoModel userInfo;
    private boolean isUpdate;
    private boolean register = false;
    private boolean isRepeat = false;
    private KeyValueModel selectedRole;
    private KeyValueModel selectedCompany;


    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_register;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {
        try {

            mUserAddRoleEt.setFocusable(false);
            Intent intent = this.getIntent();
            if (intent.hasExtra("UserInfo")) {
                mTvTitle.setText("编辑");
                mLlPassword.setVisibility(View.GONE);
                isUpdate = true;
                register = false;
                userInfo = (UserInfoModel) intent.getSerializableExtra("UserInfo");
                this.mUserAddUnitEt.setText(userInfo.getCOMPANY());
                this.mUserAddNameEt.setText(userInfo.getUSERNAME());
                this.mUserAddNumberEt.setText(userInfo.getMOBILE());
                this.mUserAddMajorEt.setText(userInfo.getDEPT());
                this.mUserAddSexRg.check(userInfo.getSEX().equals("男") ? R.id.user_add_man_rb : R.id.user_add_woman_rb);
                this.mUserAddTypeRg.check(userInfo.getCLASSIFY() == 0 ? R.id.user_add_outside_rb : R.id.user_add_inside_rb);

                try {

                    Cursor cursor = BaseApplication.getInstance().daoSession.getDatabase().rawQuery(String.format("SELECT rl.* FROM USERROLE as ur LEFT JOIN ROLE as rl ON ur.RoleId=rl.id WHERE UserId='%s'",
                            userInfo.getID()),null);
                    String roleNames = "";
                    while (cursor.moveToNext()) {
                        roleNames += cursor.getString(cursor.getColumnIndex("RoleName")) + "、";
                    }
                    cursor.close();
                    if (roleNames.length() > 0)
                        roleNames = roleNames.substring(0, roleNames.length() - 1);
                    this.mUserAddRoleEt.setText(roleNames);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                if (intent.hasExtra("register")) {
                    mTvTitle.setText("注册");
                    mUserAddRoleEt.setFocusable(false);
                    mLlPassword.setVisibility(View.VISIBLE);
                    register = true;
                } else {
                    register = false;
                }
                isUpdate = false;
                userInfo = new UserInfoModel();
                userInfo.setID(UUID.randomUUID().toString());
            }

            if (mTvTitle.getText().toString().equals("添加")) {
                mLlPassword.setVisibility(View.GONE);
                isUpdate = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void operate() {
        mUserAddUnitEt.setOnClickListener(v -> {
            DialogList mDialogList = new DialogList(this);
            List mList = new ArrayList();
            for (int i = 0; i < 20; i++) {
                mList.add("测试"+i);
            }
            mDialogList.setData(mList);
            mDialogList.setOnSelectListener(data -> {
                mUserAddUnitEt.setText(data);
            });
            mDialogList.show();
        });
    }

    @OnClick({R.id.dialog_close_iv, R.id.user_add_reset_btn, R.id.user_add_submit_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.dialog_close_iv:
                finish();
                break;
            case R.id.user_add_reset_btn:
                if (mTvTitle.getText().toString().trim().equals("注册")) {
                    mUserAddPwdEt.setText("");
                    mUserAddPwdEtAgain.setText("");
                }
                mUserAddNameEt.setText("");
                mUserAddUnitEt.setText("");
                mUserAddNumberEt.setText("");
                mUserAddMajorEt.setText("");
//                rgSex.clearCheck();
//                rgType.clearCheck();
                break;
            case R.id.user_add_submit_btn:
                String name = this.mUserAddNameEt.getText().toString().trim();
                RadioButton sex = (RadioButton) findViewById(this.mUserAddSexRg.getCheckedRadioButtonId());
                String company = this.mUserAddUnitEt.getText().toString().trim();
                String skill = this.mUserAddMajorEt.getText().toString().trim();
                String number = this.mUserAddNumberEt.getText().toString().trim();
                RadioButton state = (RadioButton) findViewById(this.mUserAddTypeRg.getCheckedRadioButtonId());
                String password = mUserAddPwdEt.getText().toString().trim();
                String passwordAgain = mUserAddPwdEtAgain.getText().toString().trim();

                if (mTvTitle.getText().toString().equals("注册")) {

                    if (name.length() == 0 || company.length() == 0 || skill.length() == 0 || sex == null || state == null
                            || password.length() == 0) {
                        ToastUtil.getInstance().showToast(R.string.toast_content_incomplete);
                        return;
                    }

                    if (!password.equals(passwordAgain)) {
                        ToastUtil.getInstance().showToast(R.string.toast_password_diff);
                        return;
                    }

                    if (!TextUtils.isEmpty(number)) {
                        if (!AccountValidatorUtil.isMobile(number)) {
                            ToastUtil.getInstance().showToast( R.string.toast_phone_invalid);
                            return;
                        }
                    }
                } else {
                    if (name.length() == 0 || company.length() == 0 || skill.length() == 0 || sex == null || state == null) {
                        ToastUtil.getInstance().showToast(R.string.toast_content_incomplete);
                        return;
                    }
                }

                isRepeat = false;
                List<UserInfoModel> userInfoModels = new ArrayList<>();
                UserInfoModelDao mUserInfoModelDao = BaseApplication.getInstance().daoSession.getUserInfoModelDao();
                try {
                    userInfoModels = mUserInfoModelDao.loadAll();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < userInfoModels.size(); i++) {
                    if (userInfoModels.get(i).getUSERNAME().equals(name)) {
                        isRepeat = true;
                    }
                }

                if (isRepeat && !isUpdate ) {
                    ToastUtil.getInstance().showToast(R.string.toast_account_exist);
                } else {
                    try {
                        userInfo.setSEX(sex.getText().toString());
                        userInfo.setSTATE(1);
                        userInfo.setCLASSIFY(state.getText().toString().equals(getString(R.string.user_type_inside)) ? 1 : 0);
                        userInfo.setUSERNAME(name);
                        userInfo.setACCOUNT(name);
                        userInfo.setCOMPANY(company);
                        userInfo.setDEPT(skill);
                        userInfo.setMOBILE(number);
                        UserInfoModel mUserInfoModel = LoginUserUtil.loadCurrentUser();
                        if (isUpdate) {
                            userInfo.setMODIFIER(mUserInfoModel.getMODIFIER());
                            userInfo.setMODIFIEDID(mUserInfoModel.getMODIFIEDID());
                            userInfo.setMODIFIEDTIME(DateTimeUtil.getCurrentTime());
                            mUserInfoModelDao.update(userInfo);

                            //生成同步记录
                            SyncDataSaveUtil.SyncDataSaveUtil(BaseApplication.getInstance().daoSession, "update",
                                    userInfo.getMODIFIEDTIME(), userInfo.getMODIFIEDID(),

                                    userInfo.getMODIFIER(), userInfo.getID(), "BASEUSER", StringUtils.objectToStr(userInfo));//gson.toJson(userInfo)
                        } else {
                            if (mTvTitle.getText().toString().equals("添加")) {
                                userInfo.setPASSWORD(StringUtils.MD5("123456"));
                            } else {
                                userInfo.setPASSWORD(StringUtils.MD5(password));
                            }
                            userInfo.setCREATEDTIME(DateTimeUtil.getCurrentTime());
                            if (register) {
                                userInfo.setCREATOR(name);
                                userInfo.setCREATEID(userInfo.getCREATEID());
                            } else {
                                userInfo.setCREATOR(mUserInfoModel.getUSERNAME());
                                userInfo.setCREATEID(mUserInfoModel.getID());
                            }
                            mUserInfoModelDao.save(userInfo);

                            //生成同步记录
                            SyncDataSaveUtil.SyncDataSaveUtil(BaseApplication.getInstance().daoSession, "insert",
                                    userInfo.getCREATEDTIME(), userInfo.getCREATEID(),
                                    userInfo.getCREATOR(), userInfo.getID(), "BASEUSER", StringUtils.objectToStr(userInfo));//gson.toJson(userInfo)
                        }
                        ToastUtil.getInstance().showToast(R.string.toast_account_create_success);
                        this.finish();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
        }
    }
}
