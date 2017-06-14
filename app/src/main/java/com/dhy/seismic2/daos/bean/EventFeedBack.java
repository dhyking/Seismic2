package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "EVENTTASKMESSAGEITEM")
public class EventFeedBack extends CreatorInfoModel {
    @Id
    private String ID;
    private String EVENTTASKITEMID;
    private String EVENTMEMBERPOINTITEMID;
    private String CONTENT;
    @Generated(hash = 430352126)
    public EventFeedBack(String ID, String EVENTTASKITEMID,
            String EVENTMEMBERPOINTITEMID, String CONTENT) {
        this.ID = ID;
        this.EVENTTASKITEMID = EVENTTASKITEMID;
        this.EVENTMEMBERPOINTITEMID = EVENTMEMBERPOINTITEMID;
        this.CONTENT = CONTENT;
    }
    @Generated(hash = 1754797363)
    public EventFeedBack() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getEVENTTASKITEMID() {
        return this.EVENTTASKITEMID;
    }
    public void setEVENTTASKITEMID(String EVENTTASKITEMID) {
        this.EVENTTASKITEMID = EVENTTASKITEMID;
    }
    public String getEVENTMEMBERPOINTITEMID() {
        return this.EVENTMEMBERPOINTITEMID;
    }
    public void setEVENTMEMBERPOINTITEMID(String EVENTMEMBERPOINTITEMID) {
        this.EVENTMEMBERPOINTITEMID = EVENTMEMBERPOINTITEMID;
    }
    public String getCONTENT() {
        return this.CONTENT;
    }
    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }
}
