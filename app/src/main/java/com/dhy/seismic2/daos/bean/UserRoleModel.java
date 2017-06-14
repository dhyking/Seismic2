package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "USERROLE")
public class UserRoleModel {
    @Id
    private String ID;
    private String USERID;
    private String ROLEID;
    private int STATE;
    @Generated(hash = 1691487332)
    public UserRoleModel(String ID, String USERID, String ROLEID, int STATE) {
        this.ID = ID;
        this.USERID = USERID;
        this.ROLEID = ROLEID;
        this.STATE = STATE;
    }
    @Generated(hash = 1660528621)
    public UserRoleModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getUSERID() {
        return this.USERID;
    }
    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }
    public String getROLEID() {
        return this.ROLEID;
    }
    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID;
    }
    public int getSTATE() {
        return this.STATE;
    }
    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }
}
