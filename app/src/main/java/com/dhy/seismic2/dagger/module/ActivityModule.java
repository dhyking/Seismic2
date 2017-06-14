package com.dhy.seismic2.dagger.module;

import android.app.Activity;
import android.hardware.camera2.CameraManager;

import com.dhy.seismic2.dagger.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhy on 2017/6/14.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @PerActivity
    @Provides
    Activity getActivity() {
        return mActivity;
    }
}
