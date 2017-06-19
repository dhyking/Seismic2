package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "LocalWaitSyncMediaFile")
public class LocalWaitMediaModel {
    @Id
    @Property(nameInDb = "FilePath")
    public String FilePath;
    @Property(nameInDb = "SyncType")
    public int SyncType;
    @Property(nameInDb = "IsFinish")
    public int IsFinish;
    @Generated(hash = 113594687)
    public LocalWaitMediaModel(String FilePath, int SyncType, int IsFinish) {
        this.FilePath = FilePath;
        this.SyncType = SyncType;
        this.IsFinish = IsFinish;
    }
    @Generated(hash = 1446929269)
    public LocalWaitMediaModel() {
    }
    public String getFilePath() {
        return this.FilePath;
    }
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }
    public int getSyncType() {
        return this.SyncType;
    }
    public void setSyncType(int SyncType) {
        this.SyncType = SyncType;
    }
    public int getIsFinish() {
        return this.IsFinish;
    }
    public void setIsFinish(int IsFinish) {
        this.IsFinish = IsFinish;
    }
}
