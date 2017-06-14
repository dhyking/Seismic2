package com.dhy.seismic2.base;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.Nullable;

import com.dhy.seismic2.Constants;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

/**
 * Created by huqf on 2016/5/20.
 */
public class ServiceSampleBase extends Service {
    // 开启WAL, 对写入加速提升巨大

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    /**静态内部类，防止内存泄露*/
    private static class BaseHandler extends Handler {
        private final WeakReference<ServiceSampleBase> mActivity;
        public BaseHandler(ServiceSampleBase activity){
            //创建对外部服务的弱引用
            mActivity = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            ServiceSampleBase theActivity = mActivity.get();
            switch (msg.what) {
                case Constants.Progress_Show:
                    // 显示进度条
                    break;
                case Constants.Progress_Loading:
                    // 显示进度值
                    break;
                case Constants.Progress_Hidden:
                    // 隐藏进度条
                    break;
                case Constants.Request_Failure:
                    // 请求失败
                    if(theActivity != null){
                        theActivity.handleOtherMessage(msg.arg1,"失败");
                    }
                    break;
                default:
                    if(theActivity != null){
                        JSONObject object;
                        try{
                            object = new JSONObject(msg.obj.toString());
                            theActivity.handleOtherMessage(msg.what,object.getString("result"));
                        }catch (JSONException e){
                        }

                    }
            }
        }
    }
    /**
     * 定义一个全局的handler
     */
    private BaseHandler baseHandler = new BaseHandler(this);

    /**
     * 其他异步处理逻辑
     * @param result 发送的消息
     */
    protected void handleOtherMessage(int what,String result){

    }


}
