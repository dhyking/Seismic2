package com.dhy.seismic2.di.module;

import android.content.Context;

import com.dhy.seismic2.BaseApplication;
import com.dhy.seismic2.daos.dao.DaoSession;
import com.dhy.seismic2.rxbus.RxBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhy on 2017/6/14.
 */
@Module
public class ApplicationModule {
    private final BaseApplication baseApplication;
    private final DaoSession daoSession;
    private final RxBus rxBus;

    public ApplicationModule(BaseApplication mBaseApplication, DaoSession mDaoSession, RxBus mRxBus) {
        baseApplication = mBaseApplication;
        daoSession = mDaoSession;
        rxBus = mRxBus;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return baseApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    RxBus provideRxBus() {
        return rxBus;
    }

    @Provides
    @Singleton
    DaoSession provideDaoSession() {
        return daoSession;
    }
}
