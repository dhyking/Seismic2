package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/12.
 */
@Entity(nameInDb = "BASEMODULE")
public class BaseModel {
    @Id
    private String ID;
    public String MODULECODE;
    public String MODULENAME;
    public String PARENTID;
    public String URL;
    public String WEBURL;
    public String ISMENU;
    public String REMARK;
    public String SORTNUM;
    public String WEBSHOW;
    @Generated(hash = 332562971)
    public BaseModel(String ID, String MODULECODE, String MODULENAME,
            String PARENTID, String URL, String WEBURL, String ISMENU,
            String REMARK, String SORTNUM, String WEBSHOW) {
        this.ID = ID;
        this.MODULECODE = MODULECODE;
        this.MODULENAME = MODULENAME;
        this.PARENTID = PARENTID;
        this.URL = URL;
        this.WEBURL = WEBURL;
        this.ISMENU = ISMENU;
        this.REMARK = REMARK;
        this.SORTNUM = SORTNUM;
        this.WEBSHOW = WEBSHOW;
    }
    @Generated(hash = 851705445)
    public BaseModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getMODULECODE() {
        return this.MODULECODE;
    }
    public void setMODULECODE(String MODULECODE) {
        this.MODULECODE = MODULECODE;
    }
    public String getMODULENAME() {
        return this.MODULENAME;
    }
    public void setMODULENAME(String MODULENAME) {
        this.MODULENAME = MODULENAME;
    }
    public String getPARENTID() {
        return this.PARENTID;
    }
    public void setPARENTID(String PARENTID) {
        this.PARENTID = PARENTID;
    }
    public String getURL() {
        return this.URL;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }
    public String getWEBURL() {
        return this.WEBURL;
    }
    public void setWEBURL(String WEBURL) {
        this.WEBURL = WEBURL;
    }
    public String getISMENU() {
        return this.ISMENU;
    }
    public void setISMENU(String ISMENU) {
        this.ISMENU = ISMENU;
    }
    public String getREMARK() {
        return this.REMARK;
    }
    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }
    public String getSORTNUM() {
        return this.SORTNUM;
    }
    public void setSORTNUM(String SORTNUM) {
        this.SORTNUM = SORTNUM;
    }
    public String getWEBSHOW() {
        return this.WEBSHOW;
    }
    public void setWEBSHOW(String WEBSHOW) {
        this.WEBSHOW = WEBSHOW;
    }
}
