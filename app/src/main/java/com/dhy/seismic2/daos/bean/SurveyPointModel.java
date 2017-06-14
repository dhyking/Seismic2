package com.dhy.seismic2.daos.bean;

import android.database.Cursor;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "SurveyPoint")
public class SurveyPointModel {
    @Id
    private String ID;
    private String area;
    private String address;
    private double longitude;
    private double latitude;
    private String levels;
    private String description;
    private String belongTo;
    private int isUpload;
    private int State;
    private String createTime;
    private String creatorId;
    private String creatorName;
    private String EventHeadId;
//    public SurveyPointModel(Cursor cursor) {
//        for (int i = 0; i < cursor.getColumnCount(); i++) {
//            if ("ID".equals(cursor.getColumnName(i))) this.ID = cursor.getString(i);
//            if ("area".equals(cursor.getColumnName(i))) this.area = cursor.getString(i);
//            if ("address".equals(cursor.getColumnName(i))) this.address = cursor.getString(i);
//            if ("longitude".equals(cursor.getColumnName(i))) this.longitude = cursor.getDouble(i);
//            if ("latitude".equals(cursor.getColumnName(i))) this.latitude = cursor.getDouble(i);
//            if ("levels".equals(cursor.getColumnName(i))) this.levels = cursor.getString(i);
//            if ("description".equals(cursor.getColumnName(i))) this.description = cursor.getString(i);
//            if ("belongTo".equals(cursor.getColumnName(i))) this.belongTo = cursor.getString(i);
//            if ("isUpload".equals(cursor.getColumnName(i))) this.isUpload = cursor.getInt(i);
//            if ("State".equals(cursor.getColumnName(i))) this.State = cursor.getInt(i);
//            if("createTime".equals(cursor.getColumnName(i))) this.createTime=cursor.getString(i);
//            if("creatorId".equals(cursor.getColumnName(i))) this.creatorId=cursor.getString(i);
//            if("creatorName".equals(cursor.getColumnName(i))) this.creatorName=cursor.getString(i);
//            if ("EventHeadId".equals(cursor.getColumnName(i))) this.EventHeadId= cursor.getString(i);
//        }
//    }
    @Generated(hash = 42685930)
    public SurveyPointModel(String ID, String area, String address, double longitude, double latitude,
            String levels, String description, String belongTo, int isUpload, int State,
            String createTime, String creatorId, String creatorName, String EventHeadId) {
        this.ID = ID;
        this.area = area;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.levels = levels;
        this.description = description;
        this.belongTo = belongTo;
        this.isUpload = isUpload;
        this.State = State;
        this.createTime = createTime;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.EventHeadId = EventHeadId;
    }
    @Generated(hash = 1974305909)
    public SurveyPointModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getArea() {
        return this.area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public String getLevels() {
        return this.levels;
    }
    public void setLevels(String levels) {
        this.levels = levels;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getBelongTo() {
        return this.belongTo;
    }
    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }
    public int getIsUpload() {
        return this.isUpload;
    }
    public void setIsUpload(int isUpload) {
        this.isUpload = isUpload;
    }
    public int getState() {
        return this.State;
    }
    public void setState(int State) {
        this.State = State;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getCreatorId() {
        return this.creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
    public String getCreatorName() {
        return this.creatorName;
    }
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
    public String getEventHeadId() {
        return this.EventHeadId;
    }
    public void setEventHeadId(String EventHeadId) {
        this.EventHeadId = EventHeadId;
    }
}
