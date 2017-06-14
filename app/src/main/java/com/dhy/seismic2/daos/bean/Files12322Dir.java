package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "Files12322Dir")
public class Files12322Dir {
    @Id
    private String Id;
    private String Name;
    private String Code;
    private String ParentID;
    @Generated(hash = 1599794398)
    public Files12322Dir(String Id, String Name, String Code, String ParentID) {
        this.Id = Id;
        this.Name = Name;
        this.Code = Code;
        this.ParentID = ParentID;
    }
    @Generated(hash = 1652102144)
    public Files12322Dir() {
    }
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getCode() {
        return this.Code;
    }
    public void setCode(String Code) {
        this.Code = Code;
    }
    public String getParentID() {
        return this.ParentID;
    }
    public void setParentID(String ParentID) {
        this.ParentID = ParentID;
    }

}
