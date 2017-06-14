package com.dhy.seismic2.activity;

import android.Manifest;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dhy.seismic2.BaseApplication;
import com.dhy.seismic2.R;
import com.dhy.seismic2.api.ApiService;
import com.dhy.seismic2.base.BaseActivity;
import com.dhy.seismic2.utils.ToastUtil;
import com.google.gson.JsonObject;
import com.tbruyelle.rxpermissions.Permission;
import com.tbruyelle.rxpermissions.RxPermissions;
import com.trello.rxlifecycle.android.ActivityEvent;


import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

public class LoginActivity extends BaseActivity {
    private final static String[] PERMISSIONS_STR = { Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.READ_PHONE_STATE};
    private boolean isCheck = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initPermissions();
//        testRequest();
    }

    private void testRequest() {

    }

    /**
     * 动态权限
     */
    private void initPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (isCheck) {
                RxPermissions mRxPermissions = new RxPermissions(this);
                mRxPermissions.request(PERMISSIONS_STR)
                        .subscribe(mBoolean -> {
                            if (mBoolean) {
                                ToastUtil.getInstance().showToast(R.string.text_success);
                            } else {
                                isCheck = false;
                                ToastUtil.getInstance().showToast(R.string.text_failure);
                            }
                        });
            } else {
//                ToastUtil.getInstance().showToast(R.string.text_success);
            }
        } else {

        }

    }
}