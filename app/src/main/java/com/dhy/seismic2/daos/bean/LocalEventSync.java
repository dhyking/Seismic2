package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "LocalEventSync")
public class LocalEventSync {
    @Id
    @Property(nameInDb = "Id")
    private int Id;
    @Property(nameInDb = "EventId")
    private String EventId;
    @Property(nameInDb = "PrevSyncId")
    private int PrevSyncId;
    @Generated(hash = 1442571790)
    public LocalEventSync(int Id, String EventId, int PrevSyncId) {
        this.Id = Id;
        this.EventId = EventId;
        this.PrevSyncId = PrevSyncId;
    }
    @Generated(hash = 1398068432)
    public LocalEventSync() {
    }
    public int getId() {
        return this.Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getEventId() {
        return this.EventId;
    }
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }
    public int getPrevSyncId() {
        return this.PrevSyncId;
    }
    public void setPrevSyncId(int PrevSyncId) {
        this.PrevSyncId = PrevSyncId;
    }
}
