package com.dhy.seismic2.base;

import java.util.List;

/**
 * Created by dhy on 2017/6/15.
 */
//网络数据交互
public interface ILoadDataView<T> extends IBaseView {
    void loadData(T data);

    void loadMoreData(T data);

    void noData();
}
