package com.dhy.seismic2.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.dhy.seismic2.Constants;


/**
 * Created by dhy on 2017/6/14.
 */

public class MapLocationUtil implements AMapLocationListener {
    //声明AMapLocationClient类对象
    public AMapLocationClient locationClient = null;

    //声明mLocationOption对象
    public AMapLocationClientOption locationOption = null;

    private boolean isLocated = false;

    private Handler mHandler;
    public void getInstance(Context context, Handler handler){
        this.mHandler = handler;
        locationClient = new AMapLocationClient(context);
        locationOption = new AMapLocationClientOption();
        // 设置定位模式为高精度模式
        locationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        // 设置定位监听
        locationClient.setLocationListener(this);

        initOption();
        // 设置定位参数
        locationClient.setLocationOption(locationOption);
        // 启动定位
        locationClient.startLocation();
        this.mHandler.sendEmptyMessage(Constants.MSG_LOCATION_START);
    }

    // 根据控件的选择，重新设置定位参数
    private void initOption() {
        //设置定位模式为高精度模式，Battery_Saving为低功耗模式，Device_Sensors是仅设备模式
        locationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        //设置是否返回地址信息（默认返回地址信息）
        locationOption.setNeedAddress(true);
        //设置是否只定位一次,默认为false
        locationOption.setOnceLocation(false);
        //设置是否强制刷新WIFI，默认为强制刷新
        locationOption.setWifiScan(true);
        //设置是否允许模拟位置,默认为false，不允许模拟位置
        locationOption.setMockEnable(false);
        //设置是否单次定位
//        locationOption.setOnceLocation(true);
        //设置定位间隔,单位毫秒,默认为2000ms
        locationOption.setInterval(10000);

        //给定位客户端对象设置定位参数
        locationClient.setLocationOption(locationOption);
    }

    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {
        if (null != aMapLocation) {
            if (!isLocated) {
                isLocated = true;
                Message msg = mHandler.obtainMessage();
                msg.obj = aMapLocation;
                msg.what = Constants.MSG_LOCATION_FINISH;
                mHandler.sendMessage(msg);
            }
        }
    }

    public void destroy(){
        if (null != locationClient) {
            /**
             * 如果AMapLocationClient是在当前Activity实例化的，
             * 在Activity的onDestroy中一定要执行AMapLocationClient的onDestroy
             */
            locationClient.onDestroy();
            locationClient = null;
            locationOption = null;
        }
    }
}
