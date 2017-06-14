package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity
public class UserIdModel {
    @Id
    private String USERID;
    private int STATE;
    @Generated(hash = 210915581)
    public UserIdModel(String USERID, int STATE) {
        this.USERID = USERID;
        this.STATE = STATE;
    }
    @Generated(hash = 2019907304)
    public UserIdModel() {
    }
    public String getUSERID() {
        return this.USERID;
    }
    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }
    public int getSTATE() {
        return this.STATE;
    }
    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }
}
