package com.dhy.seismic2.di.module;

import android.content.Context;

import com.dhy.seismic2.daos.dao.DaoMaster;
import com.dhy.seismic2.daos.dao.DaoSession;

import org.greenrobot.greendao.database.DatabaseOpenHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhy on 2017/6/16.
 */
@Module
public class DataBaseModule {
    private String databaseName;
    private Context context;
    public DataBaseModule(Context mContext,String mDatabaseName) {
        databaseName = mDatabaseName;
        this.context = mContext;
    }

    public DaoMaster provideDaoMaster(DaoMaster.OpenHelper helper) {
        return new DaoMaster(helper.getReadableDatabase());
    }

    @Provides
    @Singleton
    public DaoSession provideDaoSession(DaoMaster mDaoMaster) {
        return mDaoMaster.newSession();
    }
}
