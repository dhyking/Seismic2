package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "EVENTMEMBERITEM")
public class EventMemberItem {
    @Id
    private String ID;
    private String EVENTTEAMITEMID;
    private String USERID;
    private String USERNAME;
    private int STATE;
    private int MEMBERTYPE;
    @Generated(hash = 503727090)
    public EventMemberItem(String ID, String EVENTTEAMITEMID, String USERID,
            String USERNAME, int STATE, int MEMBERTYPE) {
        this.ID = ID;
        this.EVENTTEAMITEMID = EVENTTEAMITEMID;
        this.USERID = USERID;
        this.USERNAME = USERNAME;
        this.STATE = STATE;
        this.MEMBERTYPE = MEMBERTYPE;
    }
    @Generated(hash = 1563265259)
    public EventMemberItem() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getEVENTTEAMITEMID() {
        return this.EVENTTEAMITEMID;
    }
    public void setEVENTTEAMITEMID(String EVENTTEAMITEMID) {
        this.EVENTTEAMITEMID = EVENTTEAMITEMID;
    }
    public String getUSERID() {
        return this.USERID;
    }
    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }
    public String getUSERNAME() {
        return this.USERNAME;
    }
    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }
    public int getSTATE() {
        return this.STATE;
    }
    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }
    public int getMEMBERTYPE() {
        return this.MEMBERTYPE;
    }
    public void setMEMBERTYPE(int MEMBERTYPE) {
        this.MEMBERTYPE = MEMBERTYPE;
    }
}
