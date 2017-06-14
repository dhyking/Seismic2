package com.dhy.seismic2.daos.bean;

/**
 * Created by dhy on 2017/6/13.
 */

public class SelectMtModel {
    public boolean isSelect;
    public MeetModel meetModel;
    public SelectMtModel(MeetModel meetModel,boolean isSelect){
        this.isSelect=isSelect;
        this.meetModel=meetModel;

    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setIsSelect(boolean isSelect) {
        this.isSelect = isSelect;
    }
}
