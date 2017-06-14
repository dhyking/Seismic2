package com.dhy.seismic2.daos.bean;

import android.database.Cursor;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "EVENTTEAMITEM")
public class EventTeamModel extends CreatorInfoModel{
    @Id
    private String ID;
    private String EVENTHEADID;
    private String EVENTCENTERITEMID;
    private int CODE;
    private String NAME;
    private String DESCRIPTION;
    private String USERID;
    private String USERNAME;
    private int STATE;
    @Generated(hash = 1212771928)
    public EventTeamModel(String ID, String EVENTHEADID, String EVENTCENTERITEMID, int CODE, String NAME,
            String DESCRIPTION, String USERID, String USERNAME, int STATE) {
        this.ID = ID;
        this.EVENTHEADID = EVENTHEADID;
        this.EVENTCENTERITEMID = EVENTCENTERITEMID;
        this.CODE = CODE;
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.USERID = USERID;
        this.USERNAME = USERNAME;
        this.STATE = STATE;
    }
    @Generated(hash = 1893669154)
    public EventTeamModel() {
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
    public String getEVENTCENTERITEMID() {
        return this.EVENTCENTERITEMID;
    }
    public void setEVENTCENTERITEMID(String EVENTCENTERITEMID) {
        this.EVENTCENTERITEMID = EVENTCENTERITEMID;
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

//    public EventTeamModel(Cursor cursor) {
//        for (int i = 0; i < cursor.getColumnCount(); i++) {
//            if ("ID".equals(cursor.getColumnName(i))) this.id = cursor.getString(i);
//            if ("EVENTHEADID".equals(cursor.getColumnName(i))) this.eventHeadId = cursor.getString(i);
//            if ("EVENTCENTERITEMID".equals(cursor.getColumnName(i))) this.eventCenterItemId = cursor.getString(i);
//            if ("CODE".equals(cursor.getColumnName(i))) this.code = cursor.getInt(i);
//            if ("NAME".equals(cursor.getColumnName(i))) this.name = cursor.getString(i);
//            if ("DESCRIPTION".equals(cursor.getColumnName(i))) this.description = cursor.getString(i);
//            if ("USERID".equals(cursor.getColumnName(i))) this.userId = cursor.getString(i);
//            if ("STATE".equals(cursor.getColumnName(i))) this.state = cursor.getInt(i);
//            if ("USERNAME".equals(cursor.getColumnName(i))) this.userName = cursor.getString(i);
//            if("CREATETIME".equals(cursor.getColumnName(i))) this.setCreateTime(cursor.getString(i));
//            if("CREATEID".equals(cursor.getColumnName(i))) this.setCreatorId(cursor.getString(i));
//            if("CREATOR".equals(cursor.getColumnName(i))) this.setCreatorName(cursor.getString(i));
//        }
//    }
}
