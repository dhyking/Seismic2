package com.dhy.seismic2.dagger.compontent;

import android.content.Context;

import com.dhy.seismic2.dagger.module.ApplicationModule;
import com.dhy.seismic2.daos.dao.DaoSession;
import com.dhy.seismic2.rxbus.RxBus;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dhy on 2017/6/14.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Context getContext();
    RxBus getRxBus();
    DaoSession getDaoSession();
}
