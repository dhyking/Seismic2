package com.dhy.seismic2;

import android.os.Environment;

/**
 * Created by dhy on 2017/6/13.
 */

public class Constants {
    //    public static String serverUrl = "http://220.167.54.135:800/eds";  //原始
    //    public static String serverUrl = "http://192.168.1.61/eds";   //现在 -测试
    public static String serverUrl = "http://220.167.54.135:8006/eds";   //现在 -生产
    public static String Path_Root = Environment.getExternalStorageDirectory().toString()+ "/Exploration";

    public static String Path_Voice = Path_Root + "/Voice/";
    public static String Path_Photo = Path_Root + "/Photo/";
    public static String Path_Media = Path_Root + "/Media/";
    public static String Path_Data = Path_Root + "/Database/";
    public static String Path_Chat = Path_Root + "/ChatFile/";
    public static String Path_12322File = Path_Root + "/File12322/";
    public static String Path_E0File = Path_Root + "/E0File/";
    // 保存异常信息的所在路径
    public static String Path_Crash = Path_Root + "/Crash/";
    public static String Db_Name = "eds.db";
//    public static final LatLng CHENGDU = new LatLng(30.679879, 104.064855);// 成都市经纬度
    /**
     * 广播action
     * */
    public static final String FINISH_ACTIVITY = "action.finish_activity";

    //异常标识
    public final static int Exception_Normal = 1000;
    //显示进度条标识
    public final static int Progress_Show = 3000;
    //取消进度条标识
    public final static int Progress_Hidden = 3001;
    //显示进度值
    public final static int Progress_Loading = 3002;
    //网络请求失败
    public final static int Request_Failure = 4000;


    /**
     * 开始定位
     */
    public final static int MSG_LOCATION_START = 0;
    /**
     * 定位完成
     */
    public final static int MSG_LOCATION_FINISH = 1;
    /**
     * 停止定位
     */
    public final static int MSG_LOCATION_STOP = 2;

    public final static String SAVE_NAME = "name";
    public final static String SAVE_PASSWORD = "password";
    public final static String COMMON_ROLE = "普通用户角色";
    public final static String SERVICE_NAME = "com.dhy.seismic2.service.DataSyncService";
    public final static String OPEN_SYNC_SERVICE = "开启同步服务";
    public final static String CLOSE_SYNC_SERVICE = "关闭同步服务";








}
