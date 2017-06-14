package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "BASEUSER")
public class UserInfoModel{
    @Id
    private String ID;
    private String USERNAME;
    private String ACCOUNT;
    private String PASSWORD;
    private String SEX;
    private String SATION;
    private String COMPANY;
    private String DEPT;
    private String ADDRESS;
    private String POST;
    private String EMAIL;
    private String PHONE;
    private String MOBILE;
    private int CLASSIFY;
    private int STATE;
    private String CREATEDTIME;
    private String CREATEID;
    private String CREATOR;
    private String MODIFIEDID;
    private String MODIFIER;
    private String MODIFIEDTIME;
    @Generated(hash = 1049122905)
    public UserInfoModel(String ID, String USERNAME, String ACCOUNT,
            String PASSWORD, String SEX, String SATION, String COMPANY, String DEPT,
            String ADDRESS, String POST, String EMAIL, String PHONE, String MOBILE,
            int CLASSIFY, int STATE, String CREATEDTIME, String CREATEID,
            String CREATOR, String MODIFIEDID, String MODIFIER,
            String MODIFIEDTIME) {
        this.ID = ID;
        this.USERNAME = USERNAME;
        this.ACCOUNT = ACCOUNT;
        this.PASSWORD = PASSWORD;
        this.SEX = SEX;
        this.SATION = SATION;
        this.COMPANY = COMPANY;
        this.DEPT = DEPT;
        this.ADDRESS = ADDRESS;
        this.POST = POST;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.MOBILE = MOBILE;
        this.CLASSIFY = CLASSIFY;
        this.STATE = STATE;
        this.CREATEDTIME = CREATEDTIME;
        this.CREATEID = CREATEID;
        this.CREATOR = CREATOR;
        this.MODIFIEDID = MODIFIEDID;
        this.MODIFIER = MODIFIER;
        this.MODIFIEDTIME = MODIFIEDTIME;
    }
    @Generated(hash = 886444478)
    public UserInfoModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getUSERNAME() {
        return this.USERNAME;
    }
    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }
    public String getACCOUNT() {
        return this.ACCOUNT;
    }
    public void setACCOUNT(String ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }
    public String getPASSWORD() {
        return this.PASSWORD;
    }
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    public String getSEX() {
        return this.SEX;
    }
    public void setSEX(String SEX) {
        this.SEX = SEX;
    }
    public String getSATION() {
        return this.SATION;
    }
    public void setSATION(String SATION) {
        this.SATION = SATION;
    }
    public String getCOMPANY() {
        return this.COMPANY;
    }
    public void setCOMPANY(String COMPANY) {
        this.COMPANY = COMPANY;
    }
    public String getDEPT() {
        return this.DEPT;
    }
    public void setDEPT(String DEPT) {
        this.DEPT = DEPT;
    }
    public String getADDRESS() {
        return this.ADDRESS;
    }
    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }
    public String getPOST() {
        return this.POST;
    }
    public void setPOST(String POST) {
        this.POST = POST;
    }
    public String getEMAIL() {
        return this.EMAIL;
    }
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    public String getPHONE() {
        return this.PHONE;
    }
    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }
    public String getMOBILE() {
        return this.MOBILE;
    }
    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }
    public int getCLASSIFY() {
        return this.CLASSIFY;
    }
    public void setCLASSIFY(int CLASSIFY) {
        this.CLASSIFY = CLASSIFY;
    }
    public int getSTATE() {
        return this.STATE;
    }
    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }
    public String getCREATEDTIME() {
        return this.CREATEDTIME;
    }
    public void setCREATEDTIME(String CREATEDTIME) {
        this.CREATEDTIME = CREATEDTIME;
    }
    public String getCREATEID() {
        return this.CREATEID;
    }
    public void setCREATEID(String CREATEID) {
        this.CREATEID = CREATEID;
    }
    public String getCREATOR() {
        return this.CREATOR;
    }
    public void setCREATOR(String CREATOR) {
        this.CREATOR = CREATOR;
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
}
