package com.dhy.seismic2.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * 分辨率工具类
 * Created by dhy on 2017/6/6.
 */

public class DensityUtil {

    public static int dp2px(Context context,float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dpVal,context.getResources().getDisplayMetrics());
    }

    public static int sp2px(Context context,float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,spVal,context.getResources().getDisplayMetrics());
    }

    public static float px2dp(Context context,int pxVal) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX,pxVal,context.getResources().getDisplayMetrics());
    }

    public static float px2sp(Context context,int pxVal) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX,pxVal,context.getResources().getDisplayMetrics());
    }
}
