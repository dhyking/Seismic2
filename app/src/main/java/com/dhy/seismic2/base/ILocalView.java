package com.dhy.seismic2.base;

import java.util.List;

/**
 * Created by dhy on 2017/6/15.
 */
//本地数据交互
public interface ILocalView<T> {


    void loadData(List<T> dataList);

    void noData();

}
