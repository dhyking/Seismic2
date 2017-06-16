package com.dhy.seismic2.utils;

/**
 * Created by dhy on 2017/6/16.
 */

public interface CallbackAction {
    void success(Object object);
    void error(int type,Object object);
}
