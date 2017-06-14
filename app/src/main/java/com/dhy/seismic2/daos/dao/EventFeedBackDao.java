package com.dhy.seismic2.daos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhy.seismic2.daos.bean.EventFeedBack;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "EVENTTASKMESSAGEITEM".
*/
public class EventFeedBackDao extends AbstractDao<EventFeedBack, String> {

    public static final String TABLENAME = "EVENTTASKMESSAGEITEM";

    /**
     * Properties of entity EventFeedBack.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, String.class, "ID", true, "ID");
        public final static Property EVENTTASKITEMID = new Property(1, String.class, "EVENTTASKITEMID", false, "EVENTTASKITEMID");
        public final static Property EVENTMEMBERPOINTITEMID = new Property(2, String.class, "EVENTMEMBERPOINTITEMID", false, "EVENTMEMBERPOINTITEMID");
        public final static Property CONTENT = new Property(3, String.class, "CONTENT", false, "CONTENT");
    }


    public EventFeedBackDao(DaoConfig config) {
        super(config);
    }
    
    public EventFeedBackDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EVENTTASKMESSAGEITEM\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: ID
                "\"EVENTTASKITEMID\" TEXT," + // 1: EVENTTASKITEMID
                "\"EVENTMEMBERPOINTITEMID\" TEXT," + // 2: EVENTMEMBERPOINTITEMID
                "\"CONTENT\" TEXT);"); // 3: CONTENT
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EVENTTASKMESSAGEITEM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EventFeedBack entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String EVENTTASKITEMID = entity.getEVENTTASKITEMID();
        if (EVENTTASKITEMID != null) {
            stmt.bindString(2, EVENTTASKITEMID);
        }
 
        String EVENTMEMBERPOINTITEMID = entity.getEVENTMEMBERPOINTITEMID();
        if (EVENTMEMBERPOINTITEMID != null) {
            stmt.bindString(3, EVENTMEMBERPOINTITEMID);
        }
 
        String CONTENT = entity.getCONTENT();
        if (CONTENT != null) {
            stmt.bindString(4, CONTENT);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EventFeedBack entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String EVENTTASKITEMID = entity.getEVENTTASKITEMID();
        if (EVENTTASKITEMID != null) {
            stmt.bindString(2, EVENTTASKITEMID);
        }
 
        String EVENTMEMBERPOINTITEMID = entity.getEVENTMEMBERPOINTITEMID();
        if (EVENTMEMBERPOINTITEMID != null) {
            stmt.bindString(3, EVENTMEMBERPOINTITEMID);
        }
 
        String CONTENT = entity.getCONTENT();
        if (CONTENT != null) {
            stmt.bindString(4, CONTENT);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public EventFeedBack readEntity(Cursor cursor, int offset) {
        EventFeedBack entity = new EventFeedBack( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // EVENTTASKITEMID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // EVENTMEMBERPOINTITEMID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // CONTENT
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EventFeedBack entity, int offset) {
        entity.setID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setEVENTTASKITEMID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setEVENTMEMBERPOINTITEMID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCONTENT(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final String updateKeyAfterInsert(EventFeedBack entity, long rowId) {
        return entity.getID();
    }
    
    @Override
    public String getKey(EventFeedBack entity) {
        if(entity != null) {
            return entity.getID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EventFeedBack entity) {
        return entity.getID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}