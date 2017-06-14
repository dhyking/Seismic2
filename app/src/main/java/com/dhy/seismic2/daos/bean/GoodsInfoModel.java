package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "MATERIALITEM")
public class GoodsInfoModel extends CreatorInfoModel{
    @Id
    private String ID;
    private String CODE;
    private String TYPE;
    private String NAME;
    private int AMOUNT;
    private int STATE;
    @Generated(hash = 1924545761)
    public GoodsInfoModel(String ID, String CODE, String TYPE, String NAME,
            int AMOUNT, int STATE) {
        this.ID = ID;
        this.CODE = CODE;
        this.TYPE = TYPE;
        this.NAME = NAME;
        this.AMOUNT = AMOUNT;
        this.STATE = STATE;
    }
    @Generated(hash = 1999597464)
    public GoodsInfoModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getCODE() {
        return this.CODE;
    }
    public void setCODE(String CODE) {
        this.CODE = CODE;
    }
    public String getTYPE() {
        return this.TYPE;
    }
    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }
    public String getNAME() {
        return this.NAME;
    }
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    public int getAMOUNT() {
        return this.AMOUNT;
    }
    public void setAMOUNT(int AMOUNT) {
        this.AMOUNT = AMOUNT;
    }
    public int getSTATE() {
        return this.STATE;
    }
    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }
}
