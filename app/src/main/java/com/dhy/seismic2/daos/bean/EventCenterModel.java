package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/12.
 */

@Entity(nameInDb = "EVENTCENTERITEM")
public class EventCenterModel extends CreatorInfoModel{
    @Id
    private String ID;
    private String EVENTHEADID;
    private int CODE;
    private String NAME;
    private String DESCRIPTION;
    private String USERID;
    private String USERNAME;
    private int STATE;
    @Generated(hash = 193772597)
    public EventCenterModel(String ID, String EVENTHEADID, int CODE, String NAME,
            String DESCRIPTION, String USERID, String USERNAME, int STATE) {
        this.ID = ID;
        this.EVENTHEADID = EVENTHEADID;
        this.CODE = CODE;
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.USERID = USERID;
        this.USERNAME = USERNAME;
        this.STATE = STATE;
    }
    @Generated(hash = 1727373980)
    public EventCenterModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getEVENTHEADID() {
        return this.EVENTHEADID;
    }
    public void setEVENTHEADID(String EVENTHEADID) {
        this.EVENTHEADID = EVENTHEADID;
    }
    public int getCODE() {
        return this.CODE;
    }
    public void setCODE(int CODE) {
        this.CODE = CODE;
    }
    public String getNAME() {
        return this.NAME;
    }
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    public String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
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
}
