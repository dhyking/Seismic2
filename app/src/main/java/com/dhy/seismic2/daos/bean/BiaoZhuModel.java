package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/12.
 */
@Entity(nameInDb = "BIAOZHUDIAN")
public class BiaoZhuModel {
    @Id
    public String ID; //ID
    public String Name; //标注点名称
    public double Longitude; //纬度
    public double Latitude; //经度
    public String Des; //详细描述
    public String PicAddress; //图片地址
    public String VideoAddress; //视频地址
    public String AudioAddress; //录音地址
    public String BZMType; //标注点类型
    public String CreatorId; //创建人ID
    public String EventHeadId; //事件ID
    public String CreatorName; //创建人姓名
    public String CreateTime; //创建时间
    public String MissionCase; //任务所属事件
    public int IsUpload; //是否上传
    @Generated(hash = 1952010446)
    public BiaoZhuModel(String ID, String Name, double Longitude, double Latitude,
            String Des, String PicAddress, String VideoAddress, String AudioAddress,
            String BZMType, String CreatorId, String EventHeadId,
            String CreatorName, String CreateTime, String MissionCase,
            int IsUpload) {
        this.ID = ID;
        this.Name = Name;
        this.Longitude = Longitude;
        this.Latitude = Latitude;
        this.Des = Des;
        this.PicAddress = PicAddress;
        this.VideoAddress = VideoAddress;
        this.AudioAddress = AudioAddress;
        this.BZMType = BZMType;
        this.CreatorId = CreatorId;
        this.EventHeadId = EventHeadId;
        this.CreatorName = CreatorName;
        this.CreateTime = CreateTime;
        this.MissionCase = MissionCase;
        this.IsUpload = IsUpload;
    }
    @Generated(hash = 1169809663)
    public BiaoZhuModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
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
    public String getDes() {
        return this.Des;
    }
    public void setDes(String Des) {
        this.Des = Des;
    }
    public String getPicAddress() {
        return this.PicAddress;
    }
    public void setPicAddress(String PicAddress) {
        this.PicAddress = PicAddress;
    }
    public String getVideoAddress() {
        return this.VideoAddress;
    }
    public void setVideoAddress(String VideoAddress) {
        this.VideoAddress = VideoAddress;
    }
    public String getAudioAddress() {
        return this.AudioAddress;
    }
    public void setAudioAddress(String AudioAddress) {
        this.AudioAddress = AudioAddress;
    }
    public String getBZMType() {
        return this.BZMType;
    }
    public void setBZMType(String BZMType) {
        this.BZMType = BZMType;
    }
    public String getCreatorId() {
        return this.CreatorId;
    }
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }
    public String getEventHeadId() {
        return this.EventHeadId;
    }
    public void setEventHeadId(String EventHeadId) {
        this.EventHeadId = EventHeadId;
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
    public String getMissionCase() {
        return this.MissionCase;
    }
    public void setMissionCase(String MissionCase) {
        this.MissionCase = MissionCase;
    }
    public int getIsUpload() {
        return this.IsUpload;
    }
    public void setIsUpload(int IsUpload) {
        this.IsUpload = IsUpload;
    }
}
