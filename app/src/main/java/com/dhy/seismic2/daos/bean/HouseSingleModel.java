package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "HouseSingle")
public class HouseSingleModel {
    @Id
    private String ID;
    @Property(nameInDb = "belongTo")
    private String belongTo;
    @Property(nameInDb = "area")
    private String area;
    @Property(nameInDb = "address")
    private String address;
    @Property(nameInDb = "longitude")
    private double longitude;
    @Property(nameInDb = "latitude")
    private double latitude;
    @Property(nameInDb = "type")
    private String type;
    @Property(nameInDb = "struct")
    private String struct;
    @Property(nameInDb = "levels")
    private String levels;
    @Property(nameInDb = "acreage")
    private float acreage;
    @Property(nameInDb = "count")
    private int count;
    @Property(nameInDb = "per")
    private float per;
    @Property(nameInDb = "total")
    private float total;
    @Property(nameInDb = "description")
    private String description;
    @Property(nameInDb = "isUpload")
    private int isUpload;
    @Property(nameInDb = "State")
    private int State;
    @Property(nameInDb = "EventHeadId")
    private String EventHeadId;
    @Property(nameInDb = "inquirerId")
    private String inquirerId;
    @Property(nameInDb = "inquirerName")
    private String inquirerName;
    @Property(nameInDb = "inquirerTime")
    private String inquirerTime;
    @Generated(hash = 1023098512)
    public HouseSingleModel(String ID, String belongTo, String area, String address,
            double longitude, double latitude, String type, String struct,
            String levels, float acreage, int count, float per, float total,
            String description, int isUpload, int State, String EventHeadId,
            String inquirerId, String inquirerName, String inquirerTime) {
        this.ID = ID;
        this.belongTo = belongTo;
        this.area = area;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.type = type;
        this.struct = struct;
        this.levels = levels;
        this.acreage = acreage;
        this.count = count;
        this.per = per;
        this.total = total;
        this.description = description;
        this.isUpload = isUpload;
        this.State = State;
        this.EventHeadId = EventHeadId;
        this.inquirerId = inquirerId;
        this.inquirerName = inquirerName;
        this.inquirerTime = inquirerTime;
    }
    @Generated(hash = 1407146541)
    public HouseSingleModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getBelongTo() {
        return this.belongTo;
    }
    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
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
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getStruct() {
        return this.struct;
    }
    public void setStruct(String struct) {
        this.struct = struct;
    }
    public String getLevels() {
        return this.levels;
    }
    public void setLevels(String levels) {
        this.levels = levels;
    }
    public float getAcreage() {
        return this.acreage;
    }
    public void setAcreage(float acreage) {
        this.acreage = acreage;
    }
    public int getCount() {
        return this.count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public float getPer() {
        return this.per;
    }
    public void setPer(float per) {
        this.per = per;
    }
    public float getTotal() {
        return this.total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
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
    public String getEventHeadId() {
        return this.EventHeadId;
    }
    public void setEventHeadId(String EventHeadId) {
        this.EventHeadId = EventHeadId;
    }
    public String getInquirerId() {
        return this.inquirerId;
    }
    public void setInquirerId(String inquirerId) {
        this.inquirerId = inquirerId;
    }
    public String getInquirerName() {
        return this.inquirerName;
    }
    public void setInquirerName(String inquirerName) {
        this.inquirerName = inquirerName;
    }
    public String getInquirerTime() {
        return this.inquirerTime;
    }
    public void setInquirerTime(String inquirerTime) {
        this.inquirerTime = inquirerTime;
    }

}
