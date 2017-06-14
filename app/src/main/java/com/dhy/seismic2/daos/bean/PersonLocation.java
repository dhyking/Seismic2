package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "PersonLocation")
public class PersonLocation {
    @Id
    private String Id;
    private String UserId;
    private String CreatedTime;
    private String Address;
    private double X;
    private double Y;
    private String EventHeadId;
    @Generated(hash = 524449695)
    public PersonLocation(String Id, String UserId, String CreatedTime,
            String Address, double X, double Y, String EventHeadId) {
        this.Id = Id;
        this.UserId = UserId;
        this.CreatedTime = CreatedTime;
        this.Address = Address;
        this.X = X;
        this.Y = Y;
        this.EventHeadId = EventHeadId;
    }
    @Generated(hash = 1397846084)
    public PersonLocation() {
    }
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getUserId() {
        return this.UserId;
    }
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }
    public String getCreatedTime() {
        return this.CreatedTime;
    }
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }
    public String getAddress() {
        return this.Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
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
    public String getEventHeadId() {
        return this.EventHeadId;
    }
    public void setEventHeadId(String EventHeadId) {
        this.EventHeadId = EventHeadId;
    }
}
