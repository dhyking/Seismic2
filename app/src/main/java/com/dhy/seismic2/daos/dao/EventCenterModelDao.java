package com.dhy.seismic2.daos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhy.seismic2.daos.bean.EventCenterModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "EVENTCENTERITEM".
*/
public class EventCenterModelDao extends AbstractDao<EventCenterModel, String> {

    public static final String TABLENAME = "EVENTCENTERITEM";

    /**
     * Properties of entity EventCenterModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, String.class, "ID", true, "ID");
        public final static Property EVENTHEADID = new Property(1, String.class, "EVENTHEADID", false, "EVENTHEADID");
        public final static Property CODE = new Property(2, int.class, "CODE", false, "CODE");
        public final static Property NAME = new Property(3, String.class, "NAME", false, "NAME");
        public final static Property DESCRIPTION = new Property(4, String.class, "DESCRIPTION", false, "DESCRIPTION");
        public final static Property USERID = new Property(5, String.class, "USERID", false, "USERID");
        public final static Property USERNAME = new Property(6, String.class, "USERNAME", false, "USERNAME");
        public final static Property STATE = new Property(7, int.class, "STATE", false, "STATE");
    }


    public EventCenterModelDao(DaoConfig config) {
        super(config);
    }
    
    public EventCenterModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EVENTCENTERITEM\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: ID
                "\"EVENTHEADID\" TEXT," + // 1: EVENTHEADID
                "\"CODE\" INTEGER NOT NULL ," + // 2: CODE
                "\"NAME\" TEXT," + // 3: NAME
                "\"DESCRIPTION\" TEXT," + // 4: DESCRIPTION
                "\"USERID\" TEXT," + // 5: USERID
                "\"USERNAME\" TEXT," + // 6: USERNAME
                "\"STATE\" INTEGER NOT NULL );"); // 7: STATE
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EVENTCENTERITEM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EventCenterModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String EVENTHEADID = entity.getEVENTHEADID();
        if (EVENTHEADID != null) {
            stmt.bindString(2, EVENTHEADID);
        }
        stmt.bindLong(3, entity.getCODE());
 
        String NAME = entity.getNAME();
        if (NAME != null) {
            stmt.bindString(4, NAME);
        }
 
        String DESCRIPTION = entity.getDESCRIPTION();
        if (DESCRIPTION != null) {
            stmt.bindString(5, DESCRIPTION);
        }
 
        String USERID = entity.getUSERID();
        if (USERID != null) {
            stmt.bindString(6, USERID);
        }
 
        String USERNAME = entity.getUSERNAME();
        if (USERNAME != null) {
            stmt.bindString(7, USERNAME);
        }
        stmt.bindLong(8, entity.getSTATE());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EventCenterModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String EVENTHEADID = entity.getEVENTHEADID();
        if (EVENTHEADID != null) {
            stmt.bindString(2, EVENTHEADID);
        }
        stmt.bindLong(3, entity.getCODE());
 
        String NAME = entity.getNAME();
        if (NAME != null) {
            stmt.bindString(4, NAME);
        }
 
        String DESCRIPTION = entity.getDESCRIPTION();
        if (DESCRIPTION != null) {
            stmt.bindString(5, DESCRIPTION);
        }
 
        String USERID = entity.getUSERID();
        if (USERID != null) {
            stmt.bindString(6, USERID);
        }
 
        String USERNAME = entity.getUSERNAME();
        if (USERNAME != null) {
            stmt.bindString(7, USERNAME);
        }
        stmt.bindLong(8, entity.getSTATE());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public EventCenterModel readEntity(Cursor cursor, int offset) {
        EventCenterModel entity = new EventCenterModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // EVENTHEADID
            cursor.getInt(offset + 2), // CODE
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // NAME
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // DESCRIPTION
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // USERID
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // USERNAME
            cursor.getInt(offset + 7) // STATE
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EventCenterModel entity, int offset) {
        entity.setID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setEVENTHEADID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCODE(cursor.getInt(offset + 2));
        entity.setNAME(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDESCRIPTION(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUSERID(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUSERNAME(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSTATE(cursor.getInt(offset + 7));
     }
    
    @Override
    protected final String updateKeyAfterInsert(EventCenterModel entity, long rowId) {
        return entity.getID();
    }
    
    @Override
    public String getKey(EventCenterModel entity) {
        if(entity != null) {
            return entity.getID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EventCenterModel entity) {
        return entity.getID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}