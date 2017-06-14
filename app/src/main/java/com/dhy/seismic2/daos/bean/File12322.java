package com.dhy.seismic2.daos.bean;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "Files12322")
public class File12322 {
    @Id
    private String Id ;
    private String FilePath;
    private String ResCode;
    private String ResName;
    @Generated(hash = 1421562046)
    public File12322(String Id, String FilePath, String ResCode, String ResName) {
        this.Id = Id;
        this.FilePath = FilePath;
        this.ResCode = ResCode;
        this.ResName = ResName;
    }
    @Generated(hash = 667927742)
    public File12322() {
    }
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getFilePath() {
        return this.FilePath;
    }
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }
    public String getResCode() {
        return this.ResCode;
    }
    public void setResCode(String ResCode) {
        this.ResCode = ResCode;
    }
    public String getResName() {
        return this.ResName;
    }
    public void setResName(String ResName) {
        this.ResName = ResName;
    }
}
