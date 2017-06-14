package com.dhy.seismic2.daos.bean;

import java.io.Serializable;

/**
 * Author a
 * Created at 16/5/9
 * Description
 */
public class LocationInfoModel implements Serializable {
    private String code;
    private String area;
    private String address;
    private double longitude;
    private double latitude;
    public LocationInfoModel(){}
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
