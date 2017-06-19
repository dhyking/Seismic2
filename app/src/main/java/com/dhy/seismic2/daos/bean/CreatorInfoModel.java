package com.dhy.seismic2.daos.bean;



import java.io.Serializable;

/**
 * Created by RenTH on 2016/4/8.
 */
public class CreatorInfoModel implements Serializable {
    private String CREATETIME;
    private String CREATEID;
    private String CREATOR;


    public CreatorInfoModel() {
    }

    public String getCreateTime() {
        return CREATETIME;
    }

    public void setCreateTime(String createTime) {
        this.CREATETIME = createTime;
    }

    public String getCreatorId() {
        return CREATEID;
    }

    public void setCreatorId(String creatorId) {
        this.CREATEID = creatorId;
    }

    public String getCREATOR() {
        return CREATOR;
    }

    public void setCREATOR(String creatorName) {
        this.CREATOR = creatorName;
    }

}
