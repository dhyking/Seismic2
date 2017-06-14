package com.dhy.seismic2.daos.bean;

import android.database.Cursor;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "EVENTRANGEITEM")
public class PointInfoModel extends CreatorInfoModel{
    @Id
    private String ID;
    private String EVENTHEADID;
    private String SPACETYPE;
    private String REGIONCODE;
    private double X;
    private double Y;
    private String POSITION;
//    public PointInfoModel(){}
//    public PointInfoModel(Cursor cursor) {
//        for (int i = 0; i < cursor.getColumnCount(); i++) {
//            if ("ID".equals(cursor.getColumnName(i))) this.id = cursor.getString(i);
//            if ("EVENTHEADID".equals(cursor.getColumnName(i))) this.eventHeadId = cursor.getString(i);
//            if ("SPACETYPE".equals(cursor.getColumnName(i))) this.spaceType = cursor.getString(i);
//            if ("REGIONCODE".equals(cursor.getColumnName(i))) this.regionCode = cursor.getString(i);
//            if ("X".equals(cursor.getColumnName(i))) this.x = cursor.getDouble(i);
//            if ("Y".equals(cursor.getColumnName(i))) this.y = cursor.getDouble(i);
//            if ("POSITION".equals(cursor.getColumnName(i))) this.position = cursor.getString(i);
//        }
//    }
    @Generated(hash = 217935524)
    public PointInfoModel(String ID, String EVENTHEADID, String SPACETYPE, String REGIONCODE, double X,
            double Y, String POSITION) {
        this.ID = ID;
        this.EVENTHEADID = EVENTHEADID;
        this.SPACETYPE = SPACETYPE;
        this.REGIONCODE = REGIONCODE;
        this.X = X;
        this.Y = Y;
        this.POSITION = POSITION;
    }
    @Generated(hash = 229161407)
    public PointInfoModel() {
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
    public String getSPACETYPE() {
        return this.SPACETYPE;
    }
    public void setSPACETYPE(String SPACETYPE) {
        this.SPACETYPE = SPACETYPE;
    }
    public String getREGIONCODE() {
        return this.REGIONCODE;
    }
    public void setREGIONCODE(String REGIONCODE) {
        this.REGIONCODE = REGIONCODE;
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
    public String getPOSITION() {
        return this.POSITION;
    }
    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

}
