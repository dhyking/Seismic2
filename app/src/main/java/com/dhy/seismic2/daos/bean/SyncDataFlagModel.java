package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "LocalSyncDataFlag")
public class SyncDataFlagModel {
    @Id
    @Property(nameInDb = "Id")
    private int Id;
    private String EVENTIDS;
    @Generated(hash = 2008154826)
    public SyncDataFlagModel(int Id, String EVENTIDS) {
        this.Id = Id;
        this.EVENTIDS = EVENTIDS;
    }
    @Generated(hash = 1781870075)
    public SyncDataFlagModel() {
    }
    public int getId() {
        return this.Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getEVENTIDS() {
        return this.EVENTIDS;
    }
    public void setEVENTIDS(String EVENTIDS) {
        this.EVENTIDS = EVENTIDS;
    }

}
