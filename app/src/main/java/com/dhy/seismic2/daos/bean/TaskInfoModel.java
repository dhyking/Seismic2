package com.dhy.seismic2.daos.bean;

import android.database.Cursor;
import android.nfc.tech.NfcA;
import android.support.annotation.IntDef;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.io.Serializable;
import org.greenrobot.greendao.annotation.Generated;

/** 任务分派小组详情
 * Author: zhuxiaohong
 * Date: 2016/3/11 11:09
 */
@Entity(nameInDb = "EVENTTASKITEM")
public class TaskInfoModel extends CreatorInfoModel {

    @Id
    private String ID;
    private String EVENTHEADID;
    private int TASKTYPE;
    private String TASKDESC;
    private String MODIFIEDID;
    private String MODIFIER;
    private String MODIFIEDTIME;
    private int STATE;
    private int ISTEAMTASK;
    private String PUBLISHTIME;

    /*private String address;

    private String longitude;

    private String latitude;*/
    public TaskInfoModel(){}

    public TaskInfoModel(Cursor cursor) {
        for (int i = 0; i < cursor.getColumnCount(); i++) {
            if ("ID".equals(cursor.getColumnName(i))) this.ID = cursor.getString(i);
            if ("EVENTHEADID".equals(cursor.getColumnName(i))) this.EVENTHEADID = cursor.getString(i);
            if ("TASKTYPE".equals(cursor.getColumnName(i))) this.TASKTYPE = cursor.getInt(i);
            if ("TASKDESC".equals(cursor.getColumnName(i))) this.TASKDESC = cursor.getString(i);
            if ("MODIFIEDID".equals(cursor.getColumnName(i))) this.MODIFIEDID = cursor.getString(i);
            if ("MODIFIER".equals(cursor.getColumnName(i))) this.MODIFIER = cursor.getString(i);
            if ("MODIFIEDTIME".equals(cursor.getColumnName(i))) this.MODIFIEDTIME = cursor.getString(i);
            if ("STATE".equals(cursor.getColumnName(i))) this.STATE = cursor.getInt(i);
            if ("ISTEAMTASK".equals(cursor.getColumnName(i))) this.ISTEAMTASK = cursor.getInt(i);
            if ("PUBLISHTIME".equals(cursor.getColumnName(i))) this.PUBLISHTIME = cursor.getString(i);
//            if ("PUBLISHTIME".equals(cursor.getColumnName(i))) this.PUBLISHTIME = cursor.getString(i);
//            if ("PUBLISHTIME".equals(cursor.getColumnName(i))) this.PUBLISHTIME = cursor.getString(i);
//            if ("PUBLISHTIME".equals(cursor.getColumnName(i))) this.PUBLISHTIME = cursor.getString(i);
            if("CREATEDTIME".equals(cursor.getColumnName(i))) this.setCreateTime(cursor.getString(i));
            if("CREATORID".equals(cursor.getColumnName(i))) this.setCreatorId(cursor.getString(i));
            if("CREATORNAME".equals(cursor.getColumnName(i))) this.setCREATOR(cursor.getString(i));
        }
    }

    @Generated(hash = 922554420)
    public TaskInfoModel(String ID, String EVENTHEADID, int TASKTYPE, String TASKDESC,
            String MODIFIEDID, String MODIFIER, String MODIFIEDTIME, int STATE, int ISTEAMTASK,
            String PUBLISHTIME) {
        this.ID = ID;
        this.EVENTHEADID = EVENTHEADID;
        this.TASKTYPE = TASKTYPE;
        this.TASKDESC = TASKDESC;
        this.MODIFIEDID = MODIFIEDID;
        this.MODIFIER = MODIFIER;
        this.MODIFIEDTIME = MODIFIEDTIME;
        this.STATE = STATE;
        this.ISTEAMTASK = ISTEAMTASK;
        this.PUBLISHTIME = PUBLISHTIME;
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

    public int getTASKTYPE() {
        return this.TASKTYPE;
    }

    public void setTASKTYPE(int TASKTYPE) {
        this.TASKTYPE = TASKTYPE;
    }

    public String getTASKDESC() {
        return this.TASKDESC;
    }

    public void setTASKDESC(String TASKDESC) {
        this.TASKDESC = TASKDESC;
    }

    public String getMODIFIEDID() {
        return this.MODIFIEDID;
    }

    public void setMODIFIEDID(String MODIFIEDID) {
        this.MODIFIEDID = MODIFIEDID;
    }

    public String getMODIFIER() {
        return this.MODIFIER;
    }

    public void setMODIFIER(String MODIFIER) {
        this.MODIFIER = MODIFIER;
    }

    public String getMODIFIEDTIME() {
        return this.MODIFIEDTIME;
    }

    public void setMODIFIEDTIME(String MODIFIEDTIME) {
        this.MODIFIEDTIME = MODIFIEDTIME;
    }

    public int getSTATE() {
        return this.STATE;
    }

    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }

    public int getISTEAMTASK() {
        return this.ISTEAMTASK;
    }

    public void setISTEAMTASK(int ISTEAMTASK) {
        this.ISTEAMTASK = ISTEAMTASK;
    }

    public String getPUBLISHTIME() {
        return this.PUBLISHTIME;
    }

    public void setPUBLISHTIME(String PUBLISHTIME) {
        this.PUBLISHTIME = PUBLISHTIME;
    }
}
