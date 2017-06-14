package com.dhy.seismic2.utils;

import android.app.Activity;
import android.content.Context;
import android.service.voice.VoiceInteractionService;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dhy.seismic2.BaseApplication;
import com.dhy.seismic2.R;

/**
 * Created by dhy on 2017/6/13.
 */

public class ToastUtil {
    private ToastUtil() {
        this.context = BaseApplication.getInstance().getApplicationContext();
    }
    private static ToastUtil toastUtil;
    private  Toast toast = null;
    private  View convertView;
    private  ViewHolder holder;


    private Context context;
    /**
     * 单例模式
     *
     * @return
     */
    public static synchronized ToastUtil getInstance() {
        if (toastUtil == null) {
            toastUtil = new ToastUtil();
        }
        return toastUtil;
    }


    public  void showToast(int resId){
        showToast(resId, 0);
    }


    public  void showToast(int resId, int imgResId) {
        if (toast == null) {
            toast = new Toast(context.getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        // 初始化布局文件
        if (convertView == null) {
            holder = new ToastUtil.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.toast_withimage,null);

            holder.content = (TextView) convertView
                    .findViewById(R.id.toast_withimage_context);
            holder.image = (ImageView) convertView
                    .findViewById(R.id.toast_withimage_image);
            convertView.setTag(holder);
        } else {
            holder = (ToastUtil.ViewHolder) convertView.getTag();
        }
        if (resId == 0) {
            holder.image.setVisibility(View.GONE);
        } else {
            holder.image.setImageResource(imgResId);
        }

        holder.content.setText(resId);
        toast.setView(convertView);
        toast.show();
    }

    public void cancelToast() {
        if (toast != null) {
            toast.cancel();
        }
    }

    private static class ViewHolder {
        TextView content;
        ImageView image;
    }
}
