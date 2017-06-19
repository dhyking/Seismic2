package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by dhy on 2017/6/12.
 */
@Entity(nameInDb = "EVENTHEAD")
public class EventInfoModel {
    @Id
    private String ID;
    private String TITLE;
    private String DESCRIPTION;
    private double X;
    private double Y;
    private float RANGE;
    @Property(nameInDb = "XYCollection")
    private String XYCollection;
    private String EVENTTIME;
    private int STATE;
    @Property(nameInDb = "EventCode")
    private String EventCode;
    @Property(nameInDb = "EQEventResCode")
    private String EQEventResCode;
    @Property(nameInDb = "Addr")
    private String Addr;
    @Property(nameInDb = "Magnitude")
    private String Magnitude;
    private String CREATETIME;
    private String CREATEID;
    private String CREATOR;
    @Generated(hash = 1243192930)
    public EventInfoModel(String ID, String TITLE, String DESCRIPTION, double X,
            double Y, float RANGE, String XYCollection, String EVENTTIME, int STATE,
            String EventCode, String EQEventResCode, String Addr, String Magnitude,
            String CREATETIME, String CREATEID, String CREATOR) {
        this.ID = ID;
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
        this.X = X;
        this.Y = Y;
        this.RANGE = RANGE;
        this.XYCollection = XYCollection;
        this.EVENTTIME = EVENTTIME;
        this.STATE = STATE;
        this.EventCode = EventCode;
        this.EQEventResCode = EQEventResCode;
        this.Addr = Addr;
        this.Magnitude = Magnitude;
        this.CREATETIME = CREATETIME;
        this.CREATEID = CREATEID;
        this.CREATOR = CREATOR;
    }
    @Generated(hash = 84106945)
    public EventInfoModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getTITLE() {
        return this.TITLE;
    }
    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }
    public String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    public double getX() {
        return this.X;
    }
    public void setX(double X) {
        this.X = X;
    }
    public double getY() {
        return this.Y;
    }
    public void setY(double Y) {
        this.Y = Y;
    }
    public float getRANGE() {
        return this.RANGE;
    }
    public void setRANGE(float RANGE) {
        this.RANGE = RANGE;
    }
    public String getXYCollection() {
        return this.XYCollection;
    }
    public void setXYCollection(String XYCollection) {
        this.XYCollection = XYCollection;
    }
    public String getEVENTTIME() {
        return this.EVENTTIME;
    }
    public void setEVENTTIME(String EVENTTIME) {
        this.EVENTTIME = EVENTTIME;
    }
    public int getSTATE() {
        return this.STATE;
    }
    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }
    public String getEventCode() {
        return this.EventCode;
    }
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }
    public String getEQEventResCode() {
        return this.EQEventResCode;
    }
    public void setEQEventResCode(String EQEventResCode) {
        this.EQEventResCode = EQEventResCode;
    }
    public String getAddr() {
        return this.Addr;
    }
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }
    public String getMagnitude() {
        return this.Magnitude;
    }
    public void setMagnitude(String Magnitude) {
        this.Magnitude = Magnitude;
    }
    public String getCREATETIME() {
        return this.CREATETIME;
    }
    public void setCREATETIME(String CREATETIME) {
        this.CREATETIME = CREATETIME;
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
}
