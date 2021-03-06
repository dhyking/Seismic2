package com.dhy.seismic2.daos.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 1): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        BaseModelDao.createTable(db, ifNotExists);
        BiaoZhuModelDao.createTable(db, ifNotExists);
        CarInfoModelDao.createTable(db, ifNotExists);
        EventCenterModelDao.createTable(db, ifNotExists);
        EventFeedBackDao.createTable(db, ifNotExists);
        EventInfoModelDao.createTable(db, ifNotExists);
        EventMemberItemDao.createTable(db, ifNotExists);
        EventTeamModelDao.createTable(db, ifNotExists);
        FastCollectModelDao.createTable(db, ifNotExists);
        File12322Dao.createTable(db, ifNotExists);
        Files12322DirDao.createTable(db, ifNotExists);
        GoodsInfoModelDao.createTable(db, ifNotExists);
        HouseGroupModelDao.createTable(db, ifNotExists);
        HouseSingleModelDao.createTable(db, ifNotExists);
        ICQMessageDao.createTable(db, ifNotExists);
        LocalEventSyncDao.createTable(db, ifNotExists);
        LocalWaitMediaModelDao.createTable(db, ifNotExists);
        MediaSourceModelDao.createTable(db, ifNotExists);
        PersonLocationDao.createTable(db, ifNotExists);
        PointInfoModelDao.createTable(db, ifNotExists);
        RoleInfoModelDao.createTable(db, ifNotExists);
        SurveyPointModelDao.createTable(db, ifNotExists);
        SyncDataChangeModelDao.createTable(db, ifNotExists);
        SyncDataFlagModelDao.createTable(db, ifNotExists);
        TaskInfoModelDao.createTable(db, ifNotExists);
        UserIdModelDao.createTable(db, ifNotExists);
        UserInfoModelDao.createTable(db, ifNotExists);
        UserRoleModelDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        BaseModelDao.dropTable(db, ifExists);
        BiaoZhuModelDao.dropTable(db, ifExists);
        CarInfoModelDao.dropTable(db, ifExists);
        EventCenterModelDao.dropTable(db, ifExists);
        EventFeedBackDao.dropTable(db, ifExists);
        EventInfoModelDao.dropTable(db, ifExists);
        EventMemberItemDao.dropTable(db, ifExists);
        EventTeamModelDao.dropTable(db, ifExists);
        FastCollectModelDao.dropTable(db, ifExists);
        File12322Dao.dropTable(db, ifExists);
        Files12322DirDao.dropTable(db, ifExists);
        GoodsInfoModelDao.dropTable(db, ifExists);
        HouseGroupModelDao.dropTable(db, ifExists);
        HouseSingleModelDao.dropTable(db, ifExists);
        ICQMessageDao.dropTable(db, ifExists);
        LocalEventSyncDao.dropTable(db, ifExists);
        LocalWaitMediaModelDao.dropTable(db, ifExists);
        MediaSourceModelDao.dropTable(db, ifExists);
        PersonLocationDao.dropTable(db, ifExists);
        PointInfoModelDao.dropTable(db, ifExists);
        RoleInfoModelDao.dropTable(db, ifExists);
        SurveyPointModelDao.dropTable(db, ifExists);
        SyncDataChangeModelDao.dropTable(db, ifExists);
        SyncDataFlagModelDao.dropTable(db, ifExists);
        TaskInfoModelDao.dropTable(db, ifExists);
        UserIdModelDao.dropTable(db, ifExists);
        UserInfoModelDao.dropTable(db, ifExists);
        UserRoleModelDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(BaseModelDao.class);
        registerDaoClass(BiaoZhuModelDao.class);
        registerDaoClass(CarInfoModelDao.class);
        registerDaoClass(EventCenterModelDao.class);
        registerDaoClass(EventFeedBackDao.class);
        registerDaoClass(EventInfoModelDao.class);
        registerDaoClass(EventMemberItemDao.class);
        registerDaoClass(EventTeamModelDao.class);
        registerDaoClass(FastCollectModelDao.class);
        registerDaoClass(File12322Dao.class);
        registerDaoClass(Files12322DirDao.class);
        registerDaoClass(GoodsInfoModelDao.class);
        registerDaoClass(HouseGroupModelDao.class);
        registerDaoClass(HouseSingleModelDao.class);
        registerDaoClass(ICQMessageDao.class);
        registerDaoClass(LocalEventSyncDao.class);
        registerDaoClass(LocalWaitMediaModelDao.class);
        registerDaoClass(MediaSourceModelDao.class);
        registerDaoClass(PersonLocationDao.class);
        registerDaoClass(PointInfoModelDao.class);
        registerDaoClass(RoleInfoModelDao.class);
        registerDaoClass(SurveyPointModelDao.class);
        registerDaoClass(SyncDataChangeModelDao.class);
        registerDaoClass(SyncDataFlagModelDao.class);
        registerDaoClass(TaskInfoModelDao.class);
        registerDaoClass(UserIdModelDao.class);
        registerDaoClass(UserInfoModelDao.class);
        registerDaoClass(UserRoleModelDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
