package com.dhy.seismic2.daos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhy.seismic2.daos.bean.BaseModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BASEMODULE".
*/
public class BaseModelDao extends AbstractDao<BaseModel, String> {

    public static final String TABLENAME = "BASEMODULE";

    /**
     * Properties of entity BaseModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, String.class, "ID", true, "ID");
        public final static Property MODULECODE = new Property(1, String.class, "MODULECODE", false, "MODULECODE");
        public final static Property MODULENAME = new Property(2, String.class, "MODULENAME", false, "MODULENAME");
        public final static Property PARENTID = new Property(3, String.class, "PARENTID", false, "PARENTID");
        public final static Property URL = new Property(4, String.class, "URL", false, "URL");
        public final static Property WEBURL = new Property(5, String.class, "WEBURL", false, "WEBURL");
        public final static Property ISMENU = new Property(6, String.class, "ISMENU", false, "ISMENU");
        public final static Property REMARK = new Property(7, String.class, "REMARK", false, "REMARK");
        public final static Property SORTNUM = new Property(8, String.class, "SORTNUM", false, "SORTNUM");
        public final static Property WEBSHOW = new Property(9, String.class, "WEBSHOW", false, "WEBSHOW");
    }


    public BaseModelDao(DaoConfig config) {
        super(config);
    }
    
    public BaseModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BASEMODULE\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: ID
                "\"MODULECODE\" TEXT," + // 1: MODULECODE
                "\"MODULENAME\" TEXT," + // 2: MODULENAME
                "\"PARENTID\" TEXT," + // 3: PARENTID
                "\"URL\" TEXT," + // 4: URL
                "\"WEBURL\" TEXT," + // 5: WEBURL
                "\"ISMENU\" TEXT," + // 6: ISMENU
                "\"REMARK\" TEXT," + // 7: REMARK
                "\"SORTNUM\" TEXT," + // 8: SORTNUM
                "\"WEBSHOW\" TEXT);"); // 9: WEBSHOW
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BASEMODULE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BaseModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String MODULECODE = entity.getMODULECODE();
        if (MODULECODE != null) {
            stmt.bindString(2, MODULECODE);
        }
 
        String MODULENAME = entity.getMODULENAME();
        if (MODULENAME != null) {
            stmt.bindString(3, MODULENAME);
        }
 
        String PARENTID = entity.getPARENTID();
        if (PARENTID != null) {
            stmt.bindString(4, PARENTID);
        }
 
        String URL = entity.getURL();
        if (URL != null) {
            stmt.bindString(5, URL);
        }
 
        String WEBURL = entity.getWEBURL();
        if (WEBURL != null) {
            stmt.bindString(6, WEBURL);
        }
 
        String ISMENU = entity.getISMENU();
        if (ISMENU != null) {
            stmt.bindString(7, ISMENU);
        }
 
        String REMARK = entity.getREMARK();
        if (REMARK != null) {
            stmt.bindString(8, REMARK);
        }
 
        String SORTNUM = entity.getSORTNUM();
        if (SORTNUM != null) {
            stmt.bindString(9, SORTNUM);
        }
 
        String WEBSHOW = entity.getWEBSHOW();
        if (WEBSHOW != null) {
            stmt.bindString(10, WEBSHOW);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BaseModel entity) {
        stmt.clearBindings();
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(1, ID);
        }
 
        String MODULECODE = entity.getMODULECODE();
        if (MODULECODE != null) {
            stmt.bindString(2, MODULECODE);
        }
 
        String MODULENAME = entity.getMODULENAME();
        if (MODULENAME != null) {
            stmt.bindString(3, MODULENAME);
        }
 
        String PARENTID = entity.getPARENTID();
        if (PARENTID != null) {
            stmt.bindString(4, PARENTID);
        }
 
        String URL = entity.getURL();
        if (URL != null) {
            stmt.bindString(5, URL);
        }
 
        String WEBURL = entity.getWEBURL();
        if (WEBURL != null) {
            stmt.bindString(6, WEBURL);
        }
 
        String ISMENU = entity.getISMENU();
        if (ISMENU != null) {
            stmt.bindString(7, ISMENU);
        }
 
        String REMARK = entity.getREMARK();
        if (REMARK != null) {
            stmt.bindString(8, REMARK);
        }
 
        String SORTNUM = entity.getSORTNUM();
        if (SORTNUM != null) {
            stmt.bindString(9, SORTNUM);
        }
 
        String WEBSHOW = entity.getWEBSHOW();
        if (WEBSHOW != null) {
            stmt.bindString(10, WEBSHOW);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BaseModel readEntity(Cursor cursor, int offset) {
        BaseModel entity = new BaseModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // MODULECODE
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // MODULENAME
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // PARENTID
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // URL
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // WEBURL
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // ISMENU
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // REMARK
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // SORTNUM
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // WEBSHOW
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BaseModel entity, int offset) {
        entity.setID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setMODULECODE(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMODULENAME(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPARENTID(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setURL(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setWEBURL(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setISMENU(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setREMARK(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSORTNUM(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setWEBSHOW(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BaseModel entity, long rowId) {
        return entity.getID();
    }
    
    @Override
    public String getKey(BaseModel entity) {
        if(entity != null) {
            return entity.getID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BaseModel entity) {
        return entity.getID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
