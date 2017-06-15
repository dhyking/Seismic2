package com.dhy.seismic2.activity;

import android.Manifest;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.dhy.seismic2.BaseApplication;
import com.dhy.seismic2.Constants;
import com.dhy.seismic2.R;
import com.dhy.seismic2.base.BaseActivity;
import com.dhy.seismic2.daos.bean.RoleInfoModel;
import com.dhy.seismic2.daos.bean.UserInfoModel;
import com.dhy.seismic2.daos.bean.UserRoleModel;
import com.dhy.seismic2.daos.dao.DaoSession;
import com.dhy.seismic2.daos.dao.RoleInfoModelDao;
import com.dhy.seismic2.daos.dao.UserInfoModelDao;
import com.dhy.seismic2.daos.dao.UserRoleModelDao;
import com.dhy.seismic2.utils.ACache;
import com.dhy.seismic2.utils.AssetOrRawHelper;
import com.dhy.seismic2.utils.SpUtil;
import com.dhy.seismic2.utils.StringUtils;
import com.dhy.seismic2.utils.ToastUtil;
import com.orhanobut.logger.Logger;
import com.tbruyelle.rxpermissions.RxPermissions;

import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.functions.Action1;

public class LoginActivity extends BaseActivity {
    private final static String[] PERMISSIONS_STR = {Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
    };
    @BindView(R.id.iv_login_bg)
    ImageView mIvLoginBg;
    @BindView(R.id.et_name)
    EditText mEtName;
    @BindView(R.id.et_pwd)
    EditText mEtPwd;
    @BindView(R.id.btn_datasync)
    Button btnDataSync;
    private boolean isCheck = true;
    private Bitmap mBitmap;
    private UserInfoModel userInfoModel;
    private Intent dataSync;

    @Override
    protected void initViews() {
        initPermissions();
        initBgDrawable();
    }

    @Override
    protected void initData() {
        checkSyncStart();
    }

    /**
     * 判断数据同步服务是否开启
     */
    private void checkSyncStart() {
        if (isServiceWork()) {
            btnDataSync.setText(Constants.CLOSE_SYNC_SERVICE);
        } else {
            btnDataSync.setText(Constants.OPEN_SYNC_SERVICE);
        }
    }

    @Override
    protected void operate() {
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_login;
    }

    /**
     * 设置图片
     */
    private void initBgDrawable() {
        mBitmap = getBitmap(R.drawable.icon_bg_login);
        mIvLoginBg.setImageBitmap(mBitmap);
    }

    /**
     * 获取bitmap图片
     *
     * @param resId
     * @return
     */
    private Bitmap getBitmap(int resId) {
        BitmapFactory.Options mOptions = new BitmapFactory.Options();
        mOptions.inPreferredConfig = Bitmap.Config.RGB_565;
        InputStream is = getResources().openRawResource(resId);
        return BitmapFactory.decodeStream(is, null, mOptions);
    }


    private void createDbFile() {
        //创建应用存储目录
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            File fileDir1 = new File(Constants.Path_Voice);
            if (!fileDir1.exists()) {
                fileDir1.mkdirs();
            }

            File fileDir2 = new File(Constants.Path_Media);
            if (!fileDir2.exists()) {
                fileDir2.mkdirs();
            }

            File fileDir3 = new File(Constants.Path_Photo);
            if (!fileDir3.exists()) {
                fileDir3.mkdirs();
            }

            File fileDir4 = new File(Constants.Path_Data);
            if (!fileDir4.exists()) {
                fileDir4.mkdirs();
            }
            File fileDir5 = new File(Constants.Path_Chat);
            if (!fileDir5.exists()) {
                fileDir5.mkdirs();
            }
            File fileDir6 = new File(Constants.Path_12322File);
            if (!fileDir6.exists()) {
                fileDir6.mkdirs();
            }
            File fileDir7 = new File(Constants.Path_E0File);
            if (!fileDir7.exists()) {
                fileDir7.mkdirs();
            }
            File fileDir8 = new File(Constants.Path_Crash);
            if (!fileDir8.exists()) {
                fileDir8.mkdirs();
            }
        }
        try {
            String dbFile = Constants.Path_Data + "eds.db";
            boolean isExisted = (boolean) SpUtil.getInstance(BaseApplication.getInstance().
                    getContext(), SpUtil.PREFERENCE_LOGIN)
                    .get(SpUtil.DB_EXIST_STATE, false);
            if (!(new File(dbFile).exists()) || !isExisted) {
                //判断数据库文件是否存在，若不存在则执行导入，否则直接打开数据库
                if (isExisted) {
                    SpUtil.getInstance(BaseApplication.getInstance())
                            .edit()
                            .put(SpUtil.DB_EXIST_STATE, true)
                            .commit();
                }
                AssetOrRawHelper.getInstance(BaseApplication.getInstance().getContext())
                        .CopyData(R.raw.eds, dbFile);
            }
        } catch (Exception e) {
            Logger.e("-------------->数据读写异常：" + e.getMessage().toString());
            e.printStackTrace();
        }
    }

    /**
     * 动态权限
     */
    private void initPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (isCheck) {
                RxPermissions mRxPermissions = new RxPermissions(this);
                mRxPermissions.requestEach(PERMISSIONS_STR)
                        .subscribe(mPermission -> {
                            if (mPermission.granted) {
                                Log.d("LoginActivity", mPermission.name + " granted");

                            } else if (mPermission.shouldShowRequestPermissionRationale) {
                                Log.d("LoginActivity", mPermission.name + " shouldShowRequestPermissionRationale");
                            } else {
                                Log.d("LoginActivity", mPermission.name + " denied");
                            }
                        });
            }
        } else {
            createDbFile();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mBitmap != null && !mBitmap.isRecycled()) {
            mBitmap.recycle();
            mBitmap = null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_login, R.id.btn_datasync, R.id.btn_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                validAccount();
                break;
            case R.id.btn_datasync:
                if (isServiceWork()) {
                    stopService(dataSync);
                    btnDataSync.setText(Constants.OPEN_SYNC_SERVICE);
                } else {
                    startService(dataSync);
                    btnDataSync.setText(Constants.CLOSE_SYNC_SERVICE);
                }
                break;
            case R.id.btn_register:
                break;
        }
    }

    /**
     * 判断用户是否正常
     */
    private void validAccount() {
        String name = mEtName.getText().toString().trim();
        String password = mEtPwd.getText().toString().trim();
        UserInfoModelDao mUserInfoModelDao = BaseApplication.getInstance().daoSession.getUserInfoModelDao();
        mUserInfoModelDao.queryBuilder()
                .where(UserInfoModelDao.Properties.USERNAME.eq(name), UserInfoModelDao.Properties.PASSWORD.eq(StringUtils.md5(password)))
                .rx()
                .unique()
                .subscribe(mUserInfoModel -> {
                    Log.d("LoginActivity", "mUserInfoModel == null:" + (mUserInfoModel == null));
                    if (mUserInfoModel != null) {
                        userInfoModel = mUserInfoModel;
                    }
                });
        if (userInfoModel == null) {
            if (userInfoModel.getSTATE() == 1) {
                UserRoleModelDao mUserRoleModelDao = BaseApplication.getInstance().daoSession.getUserRoleModelDao();
                UserRoleModel mUserRoleModel = mUserRoleModelDao.queryBuilder().where(UserRoleModelDao.Properties.USERID.eq(userInfoModel.getID())).unique();
                ACache mACache = ACache.get(this);
                mACache.put(Constants.SAVE_NAME, name);
                mACache.put(Constants.SAVE_PASSWORD, password);
                if (mUserRoleModel != null) {
                    String roleId = mUserRoleModel.getROLEID();
                    RoleInfoModelDao mRoleInfoModelDao = BaseApplication.getInstance().daoSession.getRoleInfoModelDao();
                    RoleInfoModel mRoleInfoModel = mRoleInfoModelDao.queryBuilder().where(RoleInfoModelDao.Properties.ID.eq(roleId)).unique();
                    if (mRoleInfoModel != null) {
                        SpUtil.getInstance(BaseApplication.getInstance().getContext(), SpUtil.PREFERENCE_LOGIN)
                                .put(SpUtil.ROLE_TYPE, mRoleInfoModel.getROLENAME())
                                .edit()
                                .commit();
                    }
                } else {
                    SpUtil.getInstance(BaseApplication.getInstance().getContext(), SpUtil.PREFERENCE_LOGIN)
                            .put(SpUtil.ROLE_TYPE, Constants.COMMON_ROLE)
                            .edit()
                            .commit();
                }
            } else {
                ToastUtil.getInstance().showToast(R.string.text_account_not_use);
            }
        } else {
            ToastUtil.getInstance().showToast(R.string.text_account_invalid);
        }
    }


    /**
     * 判断某个服务是否正在运行的方法
     * <p>
     * serviceName 是包名+服务的类名（例如：net.loonggg.testbackstage.TestService）
     *
     * @return true代表正在运行，false代表服务没有正在运行
     */
    public boolean isServiceWork() {
        boolean isWork = false;
        ActivityManager myAM = (ActivityManager) getApplicationContext().getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> myList = myAM.getRunningServices(40);
        if (myList.size() <= 0) {
            return false;
        }
        for (int i = 0; i < myList.size(); i++) {
            String mName = myList.get(i).service.getClassName().toString();
            if (mName.equals(Constants.SERVICE_NAME)) {
                isWork = true;
                break;
            }
        }
        return isWork;
    }
}