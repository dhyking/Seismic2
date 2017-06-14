package com.dhy.seismic2.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by dhy on 2017/6/14.
 */

public class NetUtil {
    /**
     * 无网络
     */
    public static final int NETWORN_NONE = 0;
    /**
     * 无线网络
     */
    public static final int NETWORN_WIFI = 1;
    /**
     * 移动网络
     */
    public static final int NETWORN_MOBILE = 2;

    private static NetUtil networkTool;

    public synchronized static NetUtil getInstance() {
        if (networkTool == null) {
            networkTool = new NetUtil();
        }
        return networkTool;
    }

    /**
     * 获取当前网络状态
     *
     * @param context
     * @return
     */
    public int getNetworkState(Context context) {
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        //Wifi
        NetworkInfo.State state = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
        if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) {
            return NETWORN_WIFI;
        }

        //3G
        state = connManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState();
        if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) {
            return NETWORN_MOBILE;
        }
        return NETWORN_NONE;
    }

    /**
     *  网络是否可用
     * @param context
     * @return
     */
    public boolean isNetAvaliable(Context context) {
        if (getNetworkState(context) == 0) {
            return false;
        } else {
            return true;
        }
    }
}
