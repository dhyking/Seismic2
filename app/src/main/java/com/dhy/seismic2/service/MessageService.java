package com.dhy.seismic2.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.dhy.seismic2.BaseApplication;
import com.dhy.seismic2.daos.bean.TaskPointModel;
import com.dhy.seismic2.daos.dao.DaoSession;
import com.dhy.seismic2.utils.MapLocationUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dhy on 2017/6/14.
 */

public class MessageService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public final static String ACTION_CLOSE = "close";
    //获取消息线程
    private MessageThread messageThread = null;
    private LocationThread locationThread = null;
    private DaoSession mDaoSession;
    protected BaseApplication app;
    MapLocationUtil locationTool;
    private List<TaskPointModel> taskPointModels = new ArrayList<>();


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        app = BaseApplication.getInstance();
        locationTool = new MapLocationUtil();

        //开启线程
        messageThread = new MessageThread();
        messageThread.isRunning = true;
        messageThread.start();

        locationThread = new LocationThread();
        locationThread.isRunning = true;
        locationThread.start();

        return super.onStartCommand(intent, flags, startId);
    }


    /**
     * 从服务器端获取消息
     */
    class MessageThread extends Thread {
        //运行状态，下一步骤有大用
        public boolean isRunning = true;

        public void run() {
            while (isRunning) {
                try {
                    //休息3秒
                    Thread.sleep(1000);
                    //获取服务器消息
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取位置信息
     */
    class LocationThread extends Thread {
        //运行状态，下一步骤有大用
        public boolean isRunning = true;

        public void run() {
            while (isRunning) {
                try {
                    //休息10秒
                    Thread.sleep(2000);
                    //获取服务器消息
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Override
    public void onDestroy() {
        locationTool.destroy();
        messageThread.isRunning = false;
        locationThread.isRunning = false;
        super.onDestroy();
    }

}
