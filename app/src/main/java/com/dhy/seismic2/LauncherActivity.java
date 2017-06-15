package com.dhy.seismic2;

import android.app.Activity;
import android.content.Intent;

import com.dhy.seismic2.activity.LoginActivity;
import com.dhy.seismic2.base.BaseActivity;

public class LauncherActivity extends BaseActivity {
    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_launcher;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void operate() {
        goLogin(this);

    }

    /**
     * 前往登录界面
     */
    private void goLogin(Activity activity) {
        Intent mIntent = new Intent();
        mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mIntent.setClass(activity, LoginActivity.class);
        activity.startActivity(mIntent);

    }
}
