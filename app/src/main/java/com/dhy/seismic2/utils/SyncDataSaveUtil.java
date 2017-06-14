package com.dhy.seismic2.utils;

import com.dhy.seismic2.daos.bean.SyncDataChangeModel;
import com.dhy.seismic2.daos.dao.DaoSession;

import java.util.UUID;

/**
 * Created by dhy on 2017/6/14.
 */

public class SyncDataSaveUtil {
    public static void SyncDataSaveUtil(DaoSession db, String actionType, String createTime, String createId, String creator, String primaryKey, String tableName, String rowData)throws Exception{
        //生成待同步记录
        SyncDataChangeModel modelData = new SyncDataChangeModel();
        modelData.setId(UUID.randomUUID().toString());
        modelData.setActionType(actionType);
        modelData.setCreatedTime(createTime);
        modelData.setCreateId(createId);
        modelData.setCreator(creator);
        modelData.setIsFinish(0);
        modelData.setPrimaryKeyId(primaryKey);
        modelData.setTableName(tableName);
        modelData.setRowData(rowData);
        db.getSyncDataChangeModelDao().save(modelData);
    }
}
