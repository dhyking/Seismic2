package com.dhy.seismic2.widget.dialog;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.dhy.seismic2.R;
import com.dhy.seismic2.utils.CallbackAction;
import com.dhy.seismic2.utils.NetUtil;

import static com.autonavi.ae.pos.LocManager.init;

/**
 * Created by dhy on 2017/6/16.
 */

public abstract class DialogBase implements View.OnClickListener{
    private Dialog mDialog;
    public Activity mActivity;
    private View rootView;
    private LinearLayout contentLay;
    private CallbackAction mCallbackAction;
    public int mCallbackErrorId;
    public Object mCallbackSuccessValue,mCallbackErrorValue;
    protected abstract void addContentView();
//    public DialogBase(Activity activity, CallbackAction back) {
//        this.mActivity = activity;
//        this.mCallbackAction = back;
//        init();
//    }
    public DialogBase(Activity activity) {
        this.mActivity = activity;
        init();
    }

    public void setCallbackSuccessValue(Object object) {
        this.mCallbackSuccessValue = object;
    }

    public void setCallbackErrorValue(int type,Object object) {
        this.mCallbackErrorId = type;
        this.mCallbackErrorValue = object;
    }


    private void init() {
        if(mActivity != null && mActivity.getResources()!= null){
           int width = mActivity.getResources().getDisplayMetrics().widthPixels;
            mDialog = new Dialog(mActivity,R.style.DialogStyle);
            Window win = mDialog.getWindow();
            int side = mActivity.getResources().getDimensionPixelOffset(R.dimen.dimen_5);
            win.getDecorView().setPadding(0,0,0,0);
            WindowManager.LayoutParams lp = win.getAttributes();
            lp.width = width - 2*side;
            lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
            lp.alpha = 0.9f;
            win.setAttributes(lp);
            win.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //去掉背景
            win.setWindowAnimations(R.style.AnimEnterExit);
            rootView = LayoutInflater.from(mActivity).inflate(R.layout.dialog_base_item,null);
            mDialog.setContentView(rootView);
            mDialog.setCanceledOnTouchOutside(false);
            mDialog.setCancelable(false);

            addContentView();

        }else{
            Log.e("TT","标准弹窗:标准弹窗初始化失败");
        }
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.dialog_close_iv) {
            if (mDialog != null) {
                mDialog.dismiss();
            }
        } else if (viewId == R.id.dialog_btn_left) {
            if (mCallbackAction != null) {
                mCallbackAction.error(mCallbackErrorId,mCallbackErrorValue);
            }
        } else if (viewId == R.id.dialog_btn_right) {
            if(mCallbackAction != null){mCallbackAction.success(mCallbackSuccessValue);}
             mDialog.dismiss();

        }
    }

    /**
     * 获取内容布局
     * @return
     */
    public LinearLayout getContentLay() {
       if (contentLay == null) {
           contentLay = (LinearLayout) rootView.findViewById(R.id.dialog_base_content);
       }
        return contentLay;
    }

    public void show() {
        if (mDialog != null) {
            mDialog.show();
        }
    }

    public void dismiss() {
        if (mDialog != null) {
            mDialog.dismiss();
        }
    }
}
