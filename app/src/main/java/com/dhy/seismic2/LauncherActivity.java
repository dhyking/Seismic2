package com.dhy.seismic2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dhy.seismic2.activity.LoginActivity;
import com.dhy.seismic2.base.BaseActivity;

public class LauncherActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
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
