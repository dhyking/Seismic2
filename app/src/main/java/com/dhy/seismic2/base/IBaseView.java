package com.dhy.seismic2.base;

import com.trello.rxlifecycle.LifecycleTransformer;

/**
 * Created by dhy on 2017/6/15.
 */

public interface IBaseView<T> {

    /**
     * 绑定生命周期
     * @param <T>
     * @return
     */
    <T> LifecycleTransformer<T> bindToLife();

}
