package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "MEDIARESOURCE")
public class MediaSourceModel {
    @Id
    private String ID;
    private String BELONGTO;
    private String IMAGEURL;
    private String FILEURL;
    private String TITLE;
    private String TASKID;
    private String TASKNAME;
    private double LONGITUDE;
    private double LATITUDE;
    private String AREA;
    private String ADDRESS;
    private int TYPE;
    private int ISUPLOAD;
    private String INQUIRERID;
    private String INQUIRERNAME;
    private String INQUIRERTIME;
    private int State;
    private String EventHeadId;
    @Generated(hash = 516795647)
    public MediaSourceModel(String ID, String BELONGTO, String IMAGEURL,
            String FILEURL, String TITLE, String TASKID, String TASKNAME,
            double LONGITUDE, double LATITUDE, String AREA, String ADDRESS,
            int TYPE, int ISUPLOAD, String INQUIRERID, String INQUIRERNAME,
            String INQUIRERTIME, int State, String EventHeadId) {
        this.ID = ID;
        this.BELONGTO = BELONGTO;
        this.IMAGEURL = IMAGEURL;
        this.FILEURL = FILEURL;
        this.TITLE = TITLE;
        this.TASKID = TASKID;
        this.TASKNAME = TASKNAME;
        this.LONGITUDE = LONGITUDE;
        this.LATITUDE = LATITUDE;
        this.AREA = AREA;
        this.ADDRESS = ADDRESS;
        this.TYPE = TYPE;
        this.ISUPLOAD = ISUPLOAD;
        this.INQUIRERID = INQUIRERID;
        this.INQUIRERNAME = INQUIRERNAME;
        this.INQUIRERTIME = INQUIRERTIME;
        this.State = State;
        this.EventHeadId = EventHeadId;
    }
    @Generated(hash = 459068503)
    public MediaSourceModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getBELONGTO() {
        return this.BELONGTO;
    }
    public void setBELONGTO(String BELONGTO) {
        this.BELONGTO = BELONGTO;
    }
    public String getIMAGEURL() {
        return this.IMAGEURL;
    }
    public void setIMAGEURL(String IMAGEURL) {
        this.IMAGEURL = IMAGEURL;
    }
    public String getFILEURL() {
        return this.FILEURL;
    }
    public void setFILEURL(String FILEURL) {
        this.FILEURL = FILEURL;
    }
    public String getTITLE() {
        return this.TITLE;
    }
    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }
    public String getTASKID() {
        return this.TASKID;
    }
    public void setTASKID(String TASKID) {
        this.TASKID = TASKID;
    }
    public String getTASKNAME() {
        return this.TASKNAME;
    }
    public void setTASKNAME(String TASKNAME) {
        this.TASKNAME = TASKNAME;
    }
    public double getLONGITUDE() {
        return this.LONGITUDE;
    }
    public void setLONGITUDE(double LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }
    public double getLATITUDE() {
        return this.LATITUDE;
    }
    public void setLATITUDE(double LATITUDE) {
        this.LATITUDE = LATITUDE;
    }
    public String getAREA() {
        return this.AREA;
    }
    public void setAREA(String AREA) {
        this.AREA = AREA;
    }
    public String getADDRESS() {
        return this.ADDRESS;
    }
    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }
    public int getTYPE() {
        return this.TYPE;
    }
    public void setTYPE(int TYPE) {
        this.TYPE = TYPE;
    }
    public int getISUPLOAD() {
        return this.ISUPLOAD;
    }
    public void setISUPLOAD(int ISUPLOAD) {
        this.ISUPLOAD = ISUPLOAD;
    }
    public String getINQUIRERID() {
        return this.INQUIRERID;
    }
    public void setINQUIRERID(String INQUIRERID) {
        this.INQUIRERID = INQUIRERID;
    }
    public String getINQUIRERNAME() {
        return this.INQUIRERNAME;
    }
    public void setINQUIRERNAME(String INQUIRERNAME) {
        this.INQUIRERNAME = INQUIRERNAME;
    }
    public String getINQUIRERTIME() {
        return this.INQUIRERTIME;
    }
    public void setINQUIRERTIME(String INQUIRERTIME) {
        this.INQUIRERTIME = INQUIRERTIME;
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
}
