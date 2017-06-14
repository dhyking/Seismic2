package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.json.JSONObject;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "LocalTableChangedLog")
public class SyncDataChangeModel {
    @Id
    private String Id;
    private String TableName;
    private String PrimaryKeyId;
    private String ActionType;
    private String RowData;
    private String CreateId;
    private String Creator;
    private String CreatedTime;
    private int IsFinish;
    @Generated(hash = 1224680840)
    public SyncDataChangeModel(String Id, String TableName, String PrimaryKeyId,
            String ActionType, String RowData, String CreateId, String Creator,
            String CreatedTime, int IsFinish) {
        this.Id = Id;
        this.TableName = TableName;
        this.PrimaryKeyId = PrimaryKeyId;
        this.ActionType = ActionType;
        this.RowData = RowData;
        this.CreateId = CreateId;
        this.Creator = Creator;
        this.CreatedTime = CreatedTime;
        this.IsFinish = IsFinish;
    }
    @Generated(hash = 1222728184)
    public SyncDataChangeModel() {
    }
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getTableName() {
        return this.TableName;
    }
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }
    public String getPrimaryKeyId() {
        return this.PrimaryKeyId;
    }
    public void setPrimaryKeyId(String PrimaryKeyId) {
        this.PrimaryKeyId = PrimaryKeyId;
    }
    public String getActionType() {
        return this.ActionType;
    }
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }
    public String getRowData() {
        return this.RowData;
    }
    public void setRowData(String RowData) {
        this.RowData = RowData;
    }
    public String getCreateId() {
        return this.CreateId;
    }
    public void setCreateId(String CreateId) {
        this.CreateId = CreateId;
    }
    public String getCreator() {
        return this.Creator;
    }
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }
    public String getCreatedTime() {
        return this.CreatedTime;
    }
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }
    public int getIsFinish() {
        return this.IsFinish;
    }
    public void setIsFinish(int IsFinish) {
        this.IsFinish = IsFinish;
    }

//    public SyncDataChangeModel(JSONObject object){
//        try{
//            this.id = object.getString("LocalLogId");
//            this.tableName = object.getString("TableName");
//            this.primaryKeyId = object.getString("PrimaryKeyId");
//            this.actionType = object.getString("ActionType");
//            this.rowData = object.getString("RowData");
//            this.createId = object.getString("CreateId");
//            this.creator = object.getString("Creator");
//            this.createdTime = object.getString("CreatedTime");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
}
