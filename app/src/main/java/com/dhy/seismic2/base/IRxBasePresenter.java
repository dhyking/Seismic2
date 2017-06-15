package com.dhy.seismic2.base;

import rx.functions.Action1;

/**
 * Created by dhy on 2017/6/15.
 */

public interface IRxBasePresenter {

    /** 注册RxBus
     * @param type
     * @param action
     * @param <T>
     */
    <T> void registerRxBus(Class<T> type, Action1<T> action);

    /**
     * 注销
     */
    void unregisterRxBus();
}
