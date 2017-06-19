package com.dhy.seismic2.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dhy.seismic2.R;
import com.dhy.seismic2.utils.CallbackAction;
import com.orhanobut.logger.Logger;

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
    public LinearLayout bottomLay;
    private boolean isBottomVisible = false;
    private Button btnLeft;
    private Button btnRight;
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
            int side = mActivity.getResources().getDimensionPixelOffset(R.dimen.dimen_30);
            win.getDecorView().setPadding(0,0,0,0);
            WindowManager.LayoutParams lp = win.getAttributes();
            lp.width = width - 2*side;
            lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
            lp.alpha = 0.9f;
            win.setAttributes(lp);
            win.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //去掉背景
            win.setWindowAnimations(R.style.AnimEnterExit);
            rootView = LayoutInflater.from(mActivity).inflate(R.layout.dialog_base_item,null);
            bottomLay = (LinearLayout) rootView.findViewById(R.id.dialog_base_bottom);
            ImageView ivClose = (ImageView) rootView.findViewById(R.id.dialog_base_close);
            if (!isBottomVisible) {
                bottomLay.setVisibility(View.GONE);
            } else {
                bottomLay.setVisibility(View.VISIBLE);
                btnLeft = (Button) rootView.findViewById(R.id.dialog_btn_left);
                btnRight = (Button) rootView.findViewById(R.id.dialog_btn_right);
                btnLeft.setOnClickListener(this);
                btnRight.setOnClickListener(this);
            }
            ivClose.setOnClickListener(this);
            mDialog.setContentView(rootView);
            mDialog.setCanceledOnTouchOutside(false);
            mDialog.setCancelable(true);
            addContentView();
        }else{
            Log.e("TT","标准弹窗:标准弹窗初始化失败");
        }
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.dialog_base_close) {
            if (mDialog != null) {
               dismiss();
            }
        } else if (viewId == R.id.dialog_btn_left) {
            if (mCallbackAction != null) {
                mCallbackAction.error(mCallbackErrorId,mCallbackErrorValue);
                Logger.d("点击了左边取消");
            }
        } else if (viewId == R.id.dialog_btn_right) {
            if(mCallbackAction != null){mCallbackAction.success(mCallbackSuccessValue);}
            Logger.d("点击了右边确定");
            dismiss();
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

    /**
     *  获取底部点击栏
     * @return
     */
    public LinearLayout getBottomLay() {
        if (bottomLay == null) {
            bottomLay = (LinearLayout) rootView.findViewById(R.id.dialog_base_bottom);
        }
        return bottomLay;
    }


    /**
     * 设置底部点击栏可见性
     * @param mBottomVisible
     */
    public void setBottomVisable(boolean mBottomVisible) {
        isBottomVisible = mBottomVisible;
        if (bottomLay == null) {
            if (mBottomVisible) {
                bottomLay.setVisibility(View.VISIBLE);
            } else {
                bottomLay.setVisibility(View.GONE);
            }
        }
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
