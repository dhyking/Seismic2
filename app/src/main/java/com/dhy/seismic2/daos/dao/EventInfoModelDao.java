package com.dhy.seismic2.daos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhy.seismic2.daos.bean.EventInfoModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "EVENTHEAD".
*/
public class EventInfoModelDao extends AbstractDao<EventInfoModel, String> {

    public static final String TABLENAME = "EVENTHEAD";

    /**
     * Properties of entity EventInfoModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, String.class, "ID", true, "ID");
        public final static Property TITLE = new Property(1, String.class, "TITLE", false, "TITLE");
        public final static Property DESCRIPTION = new Property(2, String.class, "DESCRIPTION", false, "DESCRIPTION");
        public final static Property X = new Property(3, double.class, "X", false, "X");
        public final static Property Y = new Property(4, double.class, "Y", false, "Y");
        public final static Property RANGE = new Property(5, float.class, "RANGE", false, "RANGE");
        public final static Property XYCollection = new Property(6, String.class, "XYCollection", false, "XYCollection");
        public final static Property EVENTTIME = new Property(7, String.class, "EVENTTIME", false, "EVENTTIME");
        public final static Property STATE = new Property(8, int.class, "STATE", false, "STATE");
        public final static Property EventCode = new Property(9, String.class, "EventCode", false, "EventCode");
        public final static Property EQEventResCode = new Property(10, String.class, "EQEventResCode", false, "EQEventResCode");
        public final static Property Addr = new Property(11, String.class, "Addr", false, "Addr");
        public final static Property Magnitude = new Property(12, String.class, "Magnitude", false, "Magnitude");
        public final static Property CREATETIME = new Property(13, String.class, "CREATETIME", false, "CREATETIME");
        public final static Property CREATEID = new Property(14, String.class, "CREATEID", false, "CREATEID");
        public final static Property CREATOR = new Property(15, String.class, "CREATOR", false, "CREATOR");
    }


    public EventInfoModelDao(DaoConfig config) {
        super(config);
    }
    
    public EventInfoModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EVENTHEAD\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: ID
                "\"TITLE\" TEXT," + // 1: TITLE
                "\"DESCRIPTION\" TEXT," + // 2: DESCRIPTION
                "\"X\" REAL NOT NULL ," + // 3: X
                "\"Y\" REAL NOT NULL ," + // 4: Y
                "\"RANGE\" REAL NOT NULL ," + // 5: RANGE
                "\"XYCollection\" TEXT," + // 6: XYCollection
                "\"EVENTTIME\" TEXT," + // 7: EVENTTIME
                "\"STATE\" INTEGER NOT NULL ," + // 8: STATE
                "\"EventCode\" TEXT," + // 9: EventCode
                "\"EQEventResCode\" TEXT," + // 10: EQEventResCode
                "\"Addr\" TEXT," + // 11: Addr
                "\"Magnitude\" TEXT," + // 12: Magnitude
                "\"CREATETIME\" TEXT," + // 13: CREATETIME
                "\"CREATEID\" TEXT," + // 14: CREATEID
                "\"CREATOR\" TEXT);"); // 15: CREATOR
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EVENTHEAD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EventInfoModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String TITLE = entity.getTITLE();
        if (TITLE != null) {
            stmt.bindString(2, TITLE);
        }
 
        String DESCRIPTION = entity.getDESCRIPTION();
        if (DESCRIPTION != null) {
            stmt.bindString(3, DESCRIPTION);
        }
        stmt.bindDouble(4, entity.getX());
        stmt.bindDouble(5, entity.getY());
        stmt.bindDouble(6, entity.getRANGE());
 
        String XYCollection = entity.getXYCollection();
        if (XYCollection != null) {
            stmt.bindString(7, XYCollection);
        }
 
        String EVENTTIME = entity.getEVENTTIME();
        if (EVENTTIME != null) {
            stmt.bindString(8, EVENTTIME);
        }
        stmt.bindLong(9, entity.getSTATE());
 
        String EventCode = entity.getEventCode();
        if (EventCode != null) {
            stmt.bindString(10, EventCode);
        }
 
        String EQEventResCode = entity.getEQEventResCode();
        if (EQEventResCode != null) {
            stmt.bindString(11, EQEventResCode);
        }
 
        String Addr = entity.getAddr();
        if (Addr != null) {
            stmt.bindString(12, Addr);
        }
 
        String Magnitude = entity.getMagnitude();
        if (Magnitude != null) {
            stmt.bindString(13, Magnitude);
        }
 
        String CREATETIME = entity.getCREATETIME();
        if (CREATETIME != null) {
            stmt.bindString(14, CREATETIME);
        }
 
        String CREATEID = entity.getCREATEID();
        if (CREATEID != null) {
            stmt.bindString(15, CREATEID);
        }
 
        String CREATOR = entity.getCREATOR();
        if (CREATOR != null) {
            stmt.bindString(16, CREATOR);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EventInfoModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String TITLE = entity.getTITLE();
        if (TITLE != null) {
            stmt.bindString(2, TITLE);
        }
 
        String DESCRIPTION = entity.getDESCRIPTION();
        if (DESCRIPTION != null) {
            stmt.bindString(3, DESCRIPTION);
        }
        stmt.bindDouble(4, entity.getX());
        stmt.bindDouble(5, entity.getY());
        stmt.bindDouble(6, entity.getRANGE());
 
        String XYCollection = entity.getXYCollection();
        if (XYCollection != null) {
            stmt.bindString(7, XYCollection);
        }
 
        String EVENTTIME = entity.getEVENTTIME();
        if (EVENTTIME != null) {
            stmt.bindString(8, EVENTTIME);
        }
        stmt.bindLong(9, entity.getSTATE());
 
        String EventCode = entity.getEventCode();
        if (EventCode != null) {
            stmt.bindString(10, EventCode);
        }
 
        String EQEventResCode = entity.getEQEventResCode();
        if (EQEventResCode != null) {
            stmt.bindString(11, EQEventResCode);
        }
 
        String Addr = entity.getAddr();
        if (Addr != null) {
            stmt.bindString(12, Addr);
        }
 
        String Magnitude = entity.getMagnitude();
        if (Magnitude != null) {
            stmt.bindString(13, Magnitude);
        }
 
        String CREATETIME = entity.getCREATETIME();
        if (CREATETIME != null) {
            stmt.bindString(14, CREATETIME);
        }
 
        String CREATEID = entity.getCREATEID();
        if (CREATEID != null) {
            stmt.bindString(15, CREATEID);
        }
 
        String CREATOR = entity.getCREATOR();
        if (CREATOR != null) {
            stmt.bindString(16, CREATOR);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public EventInfoModel readEntity(Cursor cursor, int offset) {
        EventInfoModel entity = new EventInfoModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // TITLE
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // DESCRIPTION
            cursor.getDouble(offset + 3), // X
            cursor.getDouble(offset + 4), // Y
            cursor.getFloat(offset + 5), // RANGE
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // XYCollection
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // EVENTTIME
            cursor.getInt(offset + 8), // STATE
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // EventCode
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // EQEventResCode
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // Addr
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // Magnitude
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // CREATETIME
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // CREATEID
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15) // CREATOR
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EventInfoModel entity, int offset) {
        entity.setID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTITLE(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDESCRIPTION(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setX(cursor.getDouble(offset + 3));
        entity.setY(cursor.getDouble(offset + 4));
        entity.setRANGE(cursor.getFloat(offset + 5));
        entity.setXYCollection(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setEVENTTIME(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSTATE(cursor.getInt(offset + 8));
        entity.setEventCode(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setEQEventResCode(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setAddr(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setMagnitude(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setCREATETIME(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setCREATEID(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCREATOR(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
     }
    
    @Override
    protected final String updateKeyAfterInsert(EventInfoModel entity, long rowId) {
        return entity.getID();
    }
    
    @Override
    public String getKey(EventInfoModel entity) {
        if(entity != null) {
            return entity.getID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EventInfoModel entity) {
        return entity.getID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
