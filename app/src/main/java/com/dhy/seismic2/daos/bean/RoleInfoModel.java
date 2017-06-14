package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "Role")
public class RoleInfoModel {
    @Id
    private String ID;
    private String ROLENAME;
    private String PARENTID;
    private String DESCRIPTION;
    private String MODIF;
    private String MODIFIER;
    private String MODIFIEDTIME;
    private int STATE;
    @Generated(hash = 1272276618)
    public RoleInfoModel(String ID, String ROLENAME, String PARENTID,
            String DESCRIPTION, String MODIF, String MODIFIER, String MODIFIEDTIME,
            int STATE) {
        this.ID = ID;
        this.ROLENAME = ROLENAME;
        this.PARENTID = PARENTID;
        this.DESCRIPTION = DESCRIPTION;
        this.MODIF = MODIF;
        this.MODIFIER = MODIFIER;
        this.MODIFIEDTIME = MODIFIEDTIME;
        this.STATE = STATE;
    }
    @Generated(hash = 41235133)
    public RoleInfoModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getROLENAME() {
        return this.ROLENAME;
    }
    public void setROLENAME(String ROLENAME) {
        this.ROLENAME = ROLENAME;
    }
    public String getPARENTID() {
        return this.PARENTID;
    }
    public void setPARENTID(String PARENTID) {
        this.PARENTID = PARENTID;
    }
    public String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    public String getMODIF() {
        return this.MODIF;
    }
    public void setMODIF(String MODIF) {
        this.MODIF = MODIF;
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
}
