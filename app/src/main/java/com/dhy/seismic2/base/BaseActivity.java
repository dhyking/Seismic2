package com.dhy.seismic2.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.iflytek.cloud.thirdparty.T;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.components.RxActivity;
import com.trello.rxlifecycle.components.support.RxFragmentActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by dhy on 2017/6/5.
 */

public abstract class BaseActivity extends RxFragmentActivity{
    public final static String FINISH_ACTIVITY = "action.finish";

    protected void preOnCreate(){}
    protected abstract int attachLayoutRes();
    protected void initInjector(){}
    protected abstract void initViews();
    protected abstract void initData();
    protected abstract void operate();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        preOnCreate();
        super.onCreate(savedInstanceState);
        setContentView(attachLayoutRes());
        ButterKnife.bind(this);
        initInjector();
        initReceiver();
        initViews();
        initData();
        operate();
    }

    private void initReceiver(){
        IntentFilter mIntentFilter = new IntentFilter(FINISH_ACTIVITY);
        this.registerReceiver(mBroadcastReceiver,mIntentFilter);
    }

    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(FINISH_ACTIVITY)) {
                finish();
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.unregisterReceiver(mBroadcastReceiver);
    }


    public LifecycleTransformer bindToLife() {
        return this.<T>bindToLifecycle();
    }
}
