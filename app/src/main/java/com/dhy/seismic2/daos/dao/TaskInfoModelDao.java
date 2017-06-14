package com.dhy.seismic2.daos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhy.seismic2.daos.bean.TaskInfoModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "EVENTTASKITEM".
*/
public class TaskInfoModelDao extends AbstractDao<TaskInfoModel, String> {

    public static final String TABLENAME = "EVENTTASKITEM";

    /**
     * Properties of entity TaskInfoModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, String.class, "ID", true, "ID");
        public final static Property EVENTHEADID = new Property(1, String.class, "EVENTHEADID", false, "EVENTHEADID");
        public final static Property TASKTYPE = new Property(2, int.class, "TASKTYPE", false, "TASKTYPE");
        public final static Property TASKDESC = new Property(3, String.class, "TASKDESC", false, "TASKDESC");
        public final static Property MODIFIEDID = new Property(4, String.class, "MODIFIEDID", false, "MODIFIEDID");
        public final static Property MODIFIER = new Property(5, String.class, "MODIFIER", false, "MODIFIER");
        public final static Property MODIFIEDTIME = new Property(6, String.class, "MODIFIEDTIME", false, "MODIFIEDTIME");
        public final static Property STATE = new Property(7, int.class, "STATE", false, "STATE");
        public final static Property ISTEAMTASK = new Property(8, int.class, "ISTEAMTASK", false, "ISTEAMTASK");
        public final static Property PUBLISHTIME = new Property(9, String.class, "PUBLISHTIME", false, "PUBLISHTIME");
    }


    public TaskInfoModelDao(DaoConfig config) {
        super(config);
    }
    
    public TaskInfoModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EVENTTASKITEM\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: ID
                "\"EVENTHEADID\" TEXT," + // 1: EVENTHEADID
                "\"TASKTYPE\" INTEGER NOT NULL ," + // 2: TASKTYPE
                "\"TASKDESC\" TEXT," + // 3: TASKDESC
                "\"MODIFIEDID\" TEXT," + // 4: MODIFIEDID
                "\"MODIFIER\" TEXT," + // 5: MODIFIER
                "\"MODIFIEDTIME\" TEXT," + // 6: MODIFIEDTIME
                "\"STATE\" INTEGER NOT NULL ," + // 7: STATE
                "\"ISTEAMTASK\" INTEGER NOT NULL ," + // 8: ISTEAMTASK
                "\"PUBLISHTIME\" TEXT);"); // 9: PUBLISHTIME
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EVENTTASKITEM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TaskInfoModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String EVENTHEADID = entity.getEVENTHEADID();
        if (EVENTHEADID != null) {
            stmt.bindString(2, EVENTHEADID);
        }
        stmt.bindLong(3, entity.getTASKTYPE());
 
        String TASKDESC = entity.getTASKDESC();
        if (TASKDESC != null) {
            stmt.bindString(4, TASKDESC);
        }
 
        String MODIFIEDID = entity.getMODIFIEDID();
        if (MODIFIEDID != null) {
            stmt.bindString(5, MODIFIEDID);
        }
 
        String MODIFIER = entity.getMODIFIER();
        if (MODIFIER != null) {
            stmt.bindString(6, MODIFIER);
        }
 
        String MODIFIEDTIME = entity.getMODIFIEDTIME();
        if (MODIFIEDTIME != null) {
            stmt.bindString(7, MODIFIEDTIME);
        }
        stmt.bindLong(8, entity.getSTATE());
        stmt.bindLong(9, entity.getISTEAMTASK());
 
        String PUBLISHTIME = entity.getPUBLISHTIME();
        if (PUBLISHTIME != null) {
            stmt.bindString(10, PUBLISHTIME);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TaskInfoModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String EVENTHEADID = entity.getEVENTHEADID();
        if (EVENTHEADID != null) {
            stmt.bindString(2, EVENTHEADID);
        }
        stmt.bindLong(3, entity.getTASKTYPE());
 
        String TASKDESC = entity.getTASKDESC();
        if (TASKDESC != null) {
            stmt.bindString(4, TASKDESC);
        }
 
        String MODIFIEDID = entity.getMODIFIEDID();
        if (MODIFIEDID != null) {
            stmt.bindString(5, MODIFIEDID);
        }
 
        String MODIFIER = entity.getMODIFIER();
        if (MODIFIER != null) {
            stmt.bindString(6, MODIFIER);
        }
 
        String MODIFIEDTIME = entity.getMODIFIEDTIME();
        if (MODIFIEDTIME != null) {
            stmt.bindString(7, MODIFIEDTIME);
        }
        stmt.bindLong(8, entity.getSTATE());
        stmt.bindLong(9, entity.getISTEAMTASK());
 
        String PUBLISHTIME = entity.getPUBLISHTIME();
        if (PUBLISHTIME != null) {
            stmt.bindString(10, PUBLISHTIME);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public TaskInfoModel readEntity(Cursor cursor, int offset) {
        TaskInfoModel entity = new TaskInfoModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // EVENTHEADID
            cursor.getInt(offset + 2), // TASKTYPE
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // TASKDESC
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // MODIFIEDID
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // MODIFIER
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // MODIFIEDTIME
            cursor.getInt(offset + 7), // STATE
            cursor.getInt(offset + 8), // ISTEAMTASK
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // PUBLISHTIME
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TaskInfoModel entity, int offset) {
        entity.setID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setEVENTHEADID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTASKTYPE(cursor.getInt(offset + 2));
        entity.setTASKDESC(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMODIFIEDID(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMODIFIER(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMODIFIEDTIME(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSTATE(cursor.getInt(offset + 7));
        entity.setISTEAMTASK(cursor.getInt(offset + 8));
        entity.setPUBLISHTIME(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final String updateKeyAfterInsert(TaskInfoModel entity, long rowId) {
        return entity.getID();
    }
    
    @Override
    public String getKey(TaskInfoModel entity) {
        if(entity != null) {
            return entity.getID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TaskInfoModel entity) {
        return entity.getID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
