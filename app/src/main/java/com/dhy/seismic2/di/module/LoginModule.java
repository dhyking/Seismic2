package com.dhy.seismic2.di.module;

import com.dhy.seismic2.activity.LoginActivity;
import com.dhy.seismic2.utils.NetUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhy on 2017/6/14.
 */

@Module
public class LoginModule {
    private LoginActivity mLoginActivity;

    public LoginModule(LoginActivity mLoginActivity) {
        this.mLoginActivity = mLoginActivity;
    }

    @Provides
    @Singleton
    public NetUtil provideNetUtil() {
        return NetUtil.getInstance();
    }

}
