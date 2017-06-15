package com.dhy.seismic2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;

import com.dhy.seismic2.activity.LoginActivity;
import com.dhy.seismic2.base.BaseActivity;
import com.dhy.seismic2.daos.dao.DaoMaster;
import com.dhy.seismic2.daos.dao.DaoSession;
import com.dhy.seismic2.di.compontent.ApplicationComponent;
import com.dhy.seismic2.di.compontent.DaggerApplicationComponent;
import com.dhy.seismic2.di.module.ApplicationModule;
import com.dhy.seismic2.rxbus.RxBus;
import com.dhy.seismic2.utils.ACache;
import com.dhy.seismic2.widget.GreenDaoContext;
import com.squareup.leakcanary.LeakCanary;

import org.greenrobot.greendao.database.Database;

/**
 * Created by dhy on 2017/6/12.
 */

public class BaseApplication extends Application {
    private static BaseApplication instance;
    private boolean DEVELOPER_MODE = false;  //是否开启StrictMode
    private Database db;
    private DaoMaster daoMaster;
    public DaoSession daoSession;
    private RxBus rxBus = new RxBus();
    private Context context;
    private static ApplicationComponent applicationComponent;
    private DaoMaster.DevOpenHelper helper;


    @Override
    public void onCreate() {
        if (DEVELOPER_MODE) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()
                    .penaltyLog()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectLeakedSqlLiteObjects()
                    .detectLeakedClosableObjects()
                    .penaltyLog()
                    .penaltyDeath()
                    .build());
        }
        super.onCreate();
        context = getApplicationContext();
        instance = this;
        initConfig();
        initDatabase();
        initInjector();
    }

    /**
     * 初始化注射器
     */
    private void initInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this,daoSession,rxBus))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    /**
     * 初始化配置
     */
    private void initConfig() {
        LeakCanary.install(this);
    }

    /**
     * 初始化数据库
     */
    private void initDatabase() {
        helper = new DaoMaster.DevOpenHelper(new GreenDaoContext(this), Constants.Db_Name);
        db = helper.getWritableDb();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();

    }

    /**
     * 获取唯一实例
     * @return
     */
    public static BaseApplication getInstance() {
        return instance;
    }

    public Context getContext() {
        return context;
    }
    /**
     * 全局广播方法
     * @param action
     */
    public void sendBroadcast(String action){
        Intent intent = new Intent();
        intent.setAction(action);
        intent.setPackage(getPackageName());
        BaseApplication.getInstance().sendBroadcast(intent);
    }

    /**
     * 退出当前账户
     */
    public void logout() {
        ACache mACache = ACache.get(this);
        mACache.put("username","");
        mACache.put("password","");
        mACache.put("role","");
        Intent mIntent = new Intent();
        mIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.setClass(BaseApplication.getInstance(),LoginActivity.class);
        BaseApplication.getInstance().startActivity(mIntent);
        BaseApplication.getInstance().sendBroadcast(Constants.FINISH_ACTIVITY);
    }

    public void exit() {
        BaseApplication.getInstance().sendBroadcast(BaseActivity.FINISH_ACTIVITY);
        ActivityManager manager = (ActivityManager) BaseApplication.getInstance().getSystemService(ACTIVITY_SERVICE);   //获取应用管理器
        manager.killBackgroundProcesses(getPackageName());  //强制结束当前应用程序
    }
}
