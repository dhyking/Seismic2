package com.dhy.seismic2.daos.bean;

import java.io.Serializable;

/**
 * Created by dhy on 2017/6/13.
 */

public class EventSelectModel extends EventInfoModel {
    private boolean isChecked;
//    public EventSelectModel(EventInfoModel model){
//        this.setEQEventResCode(model.getEQEventResCode());
//        this.setDescription(model.getDescription());
//        this.setAddr(model.getAddr());
//        this.setEventCode(model.getEventCode());
//        this.setId(model.getId());
//        this.setLatitude(model.getLatitude());
//        this.setLongitude(model.getLongitude());
//        this.setMagnitude(model.getMagnitude());
//        this.setRange(model.getRange());
//        this.setState(model.getState());
//        this.setTime(model.getTime());
//        this.setTitle(model.getTitle());
//        this.setXyCollection(model.getXyCollection());
//    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
}
