package com.dhy.seismic2.daos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhy.seismic2.daos.bean.File12322;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "Files12322".
*/
public class File12322Dao extends AbstractDao<File12322, String> {

    public static final String TABLENAME = "Files12322";

    /**
     * Properties of entity File12322.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "Id", true, "ID");
        public final static Property FilePath = new Property(1, String.class, "FilePath", false, "FILE_PATH");
        public final static Property ResCode = new Property(2, String.class, "ResCode", false, "RES_CODE");
        public final static Property ResName = new Property(3, String.class, "ResName", false, "RES_NAME");
    }


    public File12322Dao(DaoConfig config) {
        super(config);
    }
    
    public File12322Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"Files12322\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: Id
                "\"FILE_PATH\" TEXT," + // 1: FilePath
                "\"RES_CODE\" TEXT," + // 2: ResCode
                "\"RES_NAME\" TEXT);"); // 3: ResName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"Files12322\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, File12322 entity) {
        stmt.clearBindings();
 
        String Id = entity.getId();
        if (Id != null) {
            stmt.bindString(1, Id);
        }
 
        String FilePath = entity.getFilePath();
        if (FilePath != null) {
            stmt.bindString(2, FilePath);
        }
 
        String ResCode = entity.getResCode();
        if (ResCode != null) {
            stmt.bindString(3, ResCode);
        }
 
        String ResName = entity.getResName();
        if (ResName != null) {
            stmt.bindString(4, ResName);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, File12322 entity) {
        stmt.clearBindings();
 
        String Id = entity.getId();
        if (Id != null) {
            stmt.bindString(1, Id);
        }
 
        String FilePath = entity.getFilePath();
        if (FilePath != null) {
            stmt.bindString(2, FilePath);
        }
 
        String ResCode = entity.getResCode();
        if (ResCode != null) {
            stmt.bindString(3, ResCode);
        }
 
        String ResName = entity.getResName();
        if (ResName != null) {
            stmt.bindString(4, ResName);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public File12322 readEntity(Cursor cursor, int offset) {
        File12322 entity = new File12322( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // Id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // FilePath
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ResCode
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // ResName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, File12322 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setFilePath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setResCode(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setResName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final String updateKeyAfterInsert(File12322 entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(File12322 entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(File12322 entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
