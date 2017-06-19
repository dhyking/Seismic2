package com.dhy.seismic2.daos.bean;

import android.database.Cursor;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "FastCollect")
public class FastCollectModel {
    @Id
    private String ID;
    @Property(nameInDb = "Longitude")
    private double Longitude;
    @Property(nameInDb = "Latitude")
    private double Latitude;
    @Property(nameInDb = "Address")
    private String Address;
    @Property(nameInDb = "CreatorId")
    private String CreatorId;
    @Property(nameInDb = "CreatorName")
    private String CreatorName;
    @Property(nameInDb = "CreateTime")
    private String CreateTime;
    @Property(nameInDb = "IsUpload")
    private int IsUpload;
    @Property(nameInDb = "PublicType")
    private int PublicType;
    @Property(nameInDb = "Description")
    private String Description;
    @Property(nameInDb = "EventHeadId")
    private String EventHeadId;
    @Generated(hash = 702473006)
    public FastCollectModel(String ID, double Longitude, double Latitude, String Address,
            String CreatorId, String CreatorName, String CreateTime, int IsUpload, int PublicType,
            String Description, String EventHeadId) {
        this.ID = ID;
        this.Longitude = Longitude;
        this.Latitude = Latitude;
        this.Address = Address;
        this.CreatorId = CreatorId;
        this.CreatorName = CreatorName;
        this.CreateTime = CreateTime;
        this.IsUpload = IsUpload;
        this.PublicType = PublicType;
        this.Description = Description;
        this.EventHeadId = EventHeadId;
    }
    @Generated(hash = 904116016)
    public FastCollectModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public double getLongitude() {
        return this.Longitude;
    }
    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }
    public double getLatitude() {
        return this.Latitude;
    }
    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }
    public String getAddress() {
        return this.Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getCreatorId() {
        return this.CreatorId;
    }
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }
    public String getCreatorName() {
        return this.CreatorName;
    }
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }
    public String getCreateTime() {
        return this.CreateTime;
    }
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }
    public int getIsUpload() {
        return this.IsUpload;
    }
    public void setIsUpload(int IsUpload) {
        this.IsUpload = IsUpload;
    }
    public int getPublicType() {
        return this.PublicType;
    }
    public void setPublicType(int PublicType) {
        this.PublicType = PublicType;
    }
    public String getDescription() {
        return this.Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public String getEventHeadId() {
        return this.EventHeadId;
    }
    public void setEventHeadId(String EventHeadId) {
        this.EventHeadId = EventHeadId;
    }

//    public FastCollectModel(Cursor cursor) {
//        for (int i = 0; i < cursor.getColumnCount(); i++) {
//            if ("ID".equals(cursor.getColumnName(i))) this.ID = cursor.getString(i);
//            if ("Longitude".equals(cursor.getColumnName(i))) this.Longitude = cursor.getDouble(i);
//            if ("Latitude".equals(cursor.getColumnName(i))) this.Latitude = cursor.getDouble(i);
//            if ("Address".equals(cursor.getColumnName(i))) this.Address = cursor.getString(i);
//            if ("CreatorId".equals(cursor.getColumnName(i))) this.CreatorId = cursor.getString(i);
//            if ("CreatorName".equals(cursor.getColumnName(i))) this.CreatorName = cursor.getString(i);
//            if ("CreateTime".equals(cursor.getColumnName(i))) this.CreateTime = cursor.getString(i);
//            if ("IsUpload".equals(cursor.getColumnName(i))) this.IsUpload = cursor.getInt(i);
//            if ("PublicType".equals(cursor.getColumnName(i))) this.PublicType = cursor.getInt(i);
//            if ("Description".equals(cursor.getColumnName(i))) this.Description = cursor.getString(i);
//            if ("EventHeadId".equals(cursor.getColumnName(i))) this.EventHeadId = cursor.getString(i);
//        }
//    }
}
