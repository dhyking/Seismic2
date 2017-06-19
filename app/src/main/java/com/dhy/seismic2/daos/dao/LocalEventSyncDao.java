package com.dhy.seismic2.daos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhy.seismic2.daos.bean.LocalEventSync;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LocalEventSync".
*/
public class LocalEventSyncDao extends AbstractDao<LocalEventSync, Integer> {

    public static final String TABLENAME = "LocalEventSync";

    /**
     * Properties of entity LocalEventSync.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, int.class, "Id", true, "Id");
        public final static Property EventId = new Property(1, String.class, "EventId", false, "EventId");
        public final static Property PrevSyncId = new Property(2, int.class, "PrevSyncId", false, "PrevSyncId");
    }


    public LocalEventSyncDao(DaoConfig config) {
        super(config);
    }
    
    public LocalEventSyncDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LocalEventSync\" (" + //
                "\"Id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: Id
                "\"EventId\" TEXT," + // 1: EventId
                "\"PrevSyncId\" INTEGER NOT NULL );"); // 2: PrevSyncId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LocalEventSync\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LocalEventSync entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String EventId = entity.getEventId();
        if (EventId != null) {
            stmt.bindString(2, EventId);
        }
        stmt.bindLong(3, entity.getPrevSyncId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LocalEventSync entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String EventId = entity.getEventId();
        if (EventId != null) {
            stmt.bindString(2, EventId);
        }
        stmt.bindLong(3, entity.getPrevSyncId());
    }

    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.getInt(offset + 0);
    }    

    @Override
    public LocalEventSync readEntity(Cursor cursor, int offset) {
        LocalEventSync entity = new LocalEventSync( //
            cursor.getInt(offset + 0), // Id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // EventId
            cursor.getInt(offset + 2) // PrevSyncId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LocalEventSync entity, int offset) {
        entity.setId(cursor.getInt(offset + 0));
        entity.setEventId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPrevSyncId(cursor.getInt(offset + 2));
     }
    
    @Override
    protected final Integer updateKeyAfterInsert(LocalEventSync entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public Integer getKey(LocalEventSync entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LocalEventSync entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
