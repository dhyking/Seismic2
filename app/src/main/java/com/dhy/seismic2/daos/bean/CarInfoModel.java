package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/12.
 */
@Entity(nameInDb = "CARITEM")
public class CarInfoModel extends CreatorInfoModel{
    @Id
    private String ID;
    private String CARNUMBER;
    private String USERNAME;
    private int STATE;
    @Generated(hash = 2136272639)
    public CarInfoModel(String ID, String CARNUMBER, String USERNAME, int STATE) {
        this.ID = ID;
        this.CARNUMBER = CARNUMBER;
        this.USERNAME = USERNAME;
        this.STATE = STATE;
    }
    @Generated(hash = 1135225804)
    public CarInfoModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getCARNUMBER() {
        return this.CARNUMBER;
    }
    public void setCARNUMBER(String CARNUMBER) {
        this.CARNUMBER = CARNUMBER;
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
