package com.dhy.seismic2.dagger.compontent;

import android.app.Activity;

import com.dhy.seismic2.dagger.PerActivity;
import com.dhy.seismic2.dagger.module.ActivityModule;

import dagger.Component;

/**
 * Created by dhy on 2017/6/14.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
}
