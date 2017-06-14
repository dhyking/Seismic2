package com.dhy.seismic2.daos.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.dhy.seismic2.daos.bean.BaseModel;
import com.dhy.seismic2.daos.bean.BiaoZhuModel;
import com.dhy.seismic2.daos.bean.CarInfoModel;
import com.dhy.seismic2.daos.bean.EventCenterModel;
import com.dhy.seismic2.daos.bean.EventFeedBack;
import com.dhy.seismic2.daos.bean.EventInfoModel;
import com.dhy.seismic2.daos.bean.EventMemberItem;
import com.dhy.seismic2.daos.bean.EventTeamModel;
import com.dhy.seismic2.daos.bean.FastCollectModel;
import com.dhy.seismic2.daos.bean.File12322;
import com.dhy.seismic2.daos.bean.Files12322Dir;
import com.dhy.seismic2.daos.bean.GoodsInfoModel;
import com.dhy.seismic2.daos.bean.HouseGroupModel;
import com.dhy.seismic2.daos.bean.HouseSingleModel;
import com.dhy.seismic2.daos.bean.ICQMessage;
import com.dhy.seismic2.daos.bean.LocalEventSync;
import com.dhy.seismic2.daos.bean.LocalWaitMediaModel;
import com.dhy.seismic2.daos.bean.MediaSourceModel;
import com.dhy.seismic2.daos.bean.PersonLocation;
import com.dhy.seismic2.daos.bean.PointInfoModel;
import com.dhy.seismic2.daos.bean.RoleInfoModel;
import com.dhy.seismic2.daos.bean.SurveyPointModel;
import com.dhy.seismic2.daos.bean.SyncDataChangeModel;
import com.dhy.seismic2.daos.bean.SyncDataFlagModel;
import com.dhy.seismic2.daos.bean.TaskInfoModel;
import com.dhy.seismic2.daos.bean.UserIdModel;
import com.dhy.seismic2.daos.bean.UserInfoModel;
import com.dhy.seismic2.daos.bean.UserRoleModel;

import com.dhy.seismic2.daos.dao.BaseModelDao;
import com.dhy.seismic2.daos.dao.BiaoZhuModelDao;
import com.dhy.seismic2.daos.dao.CarInfoModelDao;
import com.dhy.seismic2.daos.dao.EventCenterModelDao;
import com.dhy.seismic2.daos.dao.EventFeedBackDao;
import com.dhy.seismic2.daos.dao.EventInfoModelDao;
import com.dhy.seismic2.daos.dao.EventMemberItemDao;
import com.dhy.seismic2.daos.dao.EventTeamModelDao;
import com.dhy.seismic2.daos.dao.FastCollectModelDao;
import com.dhy.seismic2.daos.dao.File12322Dao;
import com.dhy.seismic2.daos.dao.Files12322DirDao;
import com.dhy.seismic2.daos.dao.GoodsInfoModelDao;
import com.dhy.seismic2.daos.dao.HouseGroupModelDao;
import com.dhy.seismic2.daos.dao.HouseSingleModelDao;
import com.dhy.seismic2.daos.dao.ICQMessageDao;
import com.dhy.seismic2.daos.dao.LocalEventSyncDao;
import com.dhy.seismic2.daos.dao.LocalWaitMediaModelDao;
import com.dhy.seismic2.daos.dao.MediaSourceModelDao;
import com.dhy.seismic2.daos.dao.PersonLocationDao;
import com.dhy.seismic2.daos.dao.PointInfoModelDao;
import com.dhy.seismic2.daos.dao.RoleInfoModelDao;
import com.dhy.seismic2.daos.dao.SurveyPointModelDao;
import com.dhy.seismic2.daos.dao.SyncDataChangeModelDao;
import com.dhy.seismic2.daos.dao.SyncDataFlagModelDao;
import com.dhy.seismic2.daos.dao.TaskInfoModelDao;
import com.dhy.seismic2.daos.dao.UserIdModelDao;
import com.dhy.seismic2.daos.dao.UserInfoModelDao;
import com.dhy.seismic2.daos.dao.UserRoleModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig baseModelDaoConfig;
    private final DaoConfig biaoZhuModelDaoConfig;
    private final DaoConfig carInfoModelDaoConfig;
    private final DaoConfig eventCenterModelDaoConfig;
    private final DaoConfig eventFeedBackDaoConfig;
    private final DaoConfig eventInfoModelDaoConfig;
    private final DaoConfig eventMemberItemDaoConfig;
    private final DaoConfig eventTeamModelDaoConfig;
    private final DaoConfig fastCollectModelDaoConfig;
    private final DaoConfig file12322DaoConfig;
    private final DaoConfig files12322DirDaoConfig;
    private final DaoConfig goodsInfoModelDaoConfig;
    private final DaoConfig houseGroupModelDaoConfig;
    private final DaoConfig houseSingleModelDaoConfig;
    private final DaoConfig iCQMessageDaoConfig;
    private final DaoConfig localEventSyncDaoConfig;
    private final DaoConfig localWaitMediaModelDaoConfig;
    private final DaoConfig mediaSourceModelDaoConfig;
    private final DaoConfig personLocationDaoConfig;
    private final DaoConfig pointInfoModelDaoConfig;
    private final DaoConfig roleInfoModelDaoConfig;
    private final DaoConfig surveyPointModelDaoConfig;
    private final DaoConfig syncDataChangeModelDaoConfig;
    private final DaoConfig syncDataFlagModelDaoConfig;
    private final DaoConfig taskInfoModelDaoConfig;
    private final DaoConfig userIdModelDaoConfig;
    private final DaoConfig userInfoModelDaoConfig;
    private final DaoConfig userRoleModelDaoConfig;

    private final BaseModelDao baseModelDao;
    private final BiaoZhuModelDao biaoZhuModelDao;
    private final CarInfoModelDao carInfoModelDao;
    private final EventCenterModelDao eventCenterModelDao;
    private final EventFeedBackDao eventFeedBackDao;
    private final EventInfoModelDao eventInfoModelDao;
    private final EventMemberItemDao eventMemberItemDao;
    private final EventTeamModelDao eventTeamModelDao;
    private final FastCollectModelDao fastCollectModelDao;
    private final File12322Dao file12322Dao;
    private final Files12322DirDao files12322DirDao;
    private final GoodsInfoModelDao goodsInfoModelDao;
    private final HouseGroupModelDao houseGroupModelDao;
    private final HouseSingleModelDao houseSingleModelDao;
    private final ICQMessageDao iCQMessageDao;
    private final LocalEventSyncDao localEventSyncDao;
    private final LocalWaitMediaModelDao localWaitMediaModelDao;
    private final MediaSourceModelDao mediaSourceModelDao;
    private final PersonLocationDao personLocationDao;
    private final PointInfoModelDao pointInfoModelDao;
    private final RoleInfoModelDao roleInfoModelDao;
    private final SurveyPointModelDao surveyPointModelDao;
    private final SyncDataChangeModelDao syncDataChangeModelDao;
    private final SyncDataFlagModelDao syncDataFlagModelDao;
    private final TaskInfoModelDao taskInfoModelDao;
    private final UserIdModelDao userIdModelDao;
    private final UserInfoModelDao userInfoModelDao;
    private final UserRoleModelDao userRoleModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        baseModelDaoConfig = daoConfigMap.get(BaseModelDao.class).clone();
        baseModelDaoConfig.initIdentityScope(type);

        biaoZhuModelDaoConfig = daoConfigMap.get(BiaoZhuModelDao.class).clone();
        biaoZhuModelDaoConfig.initIdentityScope(type);

        carInfoModelDaoConfig = daoConfigMap.get(CarInfoModelDao.class).clone();
        carInfoModelDaoConfig.initIdentityScope(type);

        eventCenterModelDaoConfig = daoConfigMap.get(EventCenterModelDao.class).clone();
        eventCenterModelDaoConfig.initIdentityScope(type);

        eventFeedBackDaoConfig = daoConfigMap.get(EventFeedBackDao.class).clone();
        eventFeedBackDaoConfig.initIdentityScope(type);

        eventInfoModelDaoConfig = daoConfigMap.get(EventInfoModelDao.class).clone();
        eventInfoModelDaoConfig.initIdentityScope(type);

        eventMemberItemDaoConfig = daoConfigMap.get(EventMemberItemDao.class).clone();
        eventMemberItemDaoConfig.initIdentityScope(type);

        eventTeamModelDaoConfig = daoConfigMap.get(EventTeamModelDao.class).clone();
        eventTeamModelDaoConfig.initIdentityScope(type);

        fastCollectModelDaoConfig = daoConfigMap.get(FastCollectModelDao.class).clone();
        fastCollectModelDaoConfig.initIdentityScope(type);

        file12322DaoConfig = daoConfigMap.get(File12322Dao.class).clone();
        file12322DaoConfig.initIdentityScope(type);

        files12322DirDaoConfig = daoConfigMap.get(Files12322DirDao.class).clone();
        files12322DirDaoConfig.initIdentityScope(type);

        goodsInfoModelDaoConfig = daoConfigMap.get(GoodsInfoModelDao.class).clone();
        goodsInfoModelDaoConfig.initIdentityScope(type);

        houseGroupModelDaoConfig = daoConfigMap.get(HouseGroupModelDao.class).clone();
        houseGroupModelDaoConfig.initIdentityScope(type);

        houseSingleModelDaoConfig = daoConfigMap.get(HouseSingleModelDao.class).clone();
        houseSingleModelDaoConfig.initIdentityScope(type);

        iCQMessageDaoConfig = daoConfigMap.get(ICQMessageDao.class).clone();
        iCQMessageDaoConfig.initIdentityScope(type);

        localEventSyncDaoConfig = daoConfigMap.get(LocalEventSyncDao.class).clone();
        localEventSyncDaoConfig.initIdentityScope(type);

        localWaitMediaModelDaoConfig = daoConfigMap.get(LocalWaitMediaModelDao.class).clone();
        localWaitMediaModelDaoConfig.initIdentityScope(type);

        mediaSourceModelDaoConfig = daoConfigMap.get(MediaSourceModelDao.class).clone();
        mediaSourceModelDaoConfig.initIdentityScope(type);

        personLocationDaoConfig = daoConfigMap.get(PersonLocationDao.class).clone();
        personLocationDaoConfig.initIdentityScope(type);

        pointInfoModelDaoConfig = daoConfigMap.get(PointInfoModelDao.class).clone();
        pointInfoModelDaoConfig.initIdentityScope(type);

        roleInfoModelDaoConfig = daoConfigMap.get(RoleInfoModelDao.class).clone();
        roleInfoModelDaoConfig.initIdentityScope(type);

        surveyPointModelDaoConfig = daoConfigMap.get(SurveyPointModelDao.class).clone();
        surveyPointModelDaoConfig.initIdentityScope(type);

        syncDataChangeModelDaoConfig = daoConfigMap.get(SyncDataChangeModelDao.class).clone();
        syncDataChangeModelDaoConfig.initIdentityScope(type);

        syncDataFlagModelDaoConfig = daoConfigMap.get(SyncDataFlagModelDao.class).clone();
        syncDataFlagModelDaoConfig.initIdentityScope(type);

        taskInfoModelDaoConfig = daoConfigMap.get(TaskInfoModelDao.class).clone();
        taskInfoModelDaoConfig.initIdentityScope(type);

        userIdModelDaoConfig = daoConfigMap.get(UserIdModelDao.class).clone();
        userIdModelDaoConfig.initIdentityScope(type);

        userInfoModelDaoConfig = daoConfigMap.get(UserInfoModelDao.class).clone();
        userInfoModelDaoConfig.initIdentityScope(type);

        userRoleModelDaoConfig = daoConfigMap.get(UserRoleModelDao.class).clone();
        userRoleModelDaoConfig.initIdentityScope(type);

        baseModelDao = new BaseModelDao(baseModelDaoConfig, this);
        biaoZhuModelDao = new BiaoZhuModelDao(biaoZhuModelDaoConfig, this);
        carInfoModelDao = new CarInfoModelDao(carInfoModelDaoConfig, this);
        eventCenterModelDao = new EventCenterModelDao(eventCenterModelDaoConfig, this);
        eventFeedBackDao = new EventFeedBackDao(eventFeedBackDaoConfig, this);
        eventInfoModelDao = new EventInfoModelDao(eventInfoModelDaoConfig, this);
        eventMemberItemDao = new EventMemberItemDao(eventMemberItemDaoConfig, this);
        eventTeamModelDao = new EventTeamModelDao(eventTeamModelDaoConfig, this);
        fastCollectModelDao = new FastCollectModelDao(fastCollectModelDaoConfig, this);
        file12322Dao = new File12322Dao(file12322DaoConfig, this);
        files12322DirDao = new Files12322DirDao(files12322DirDaoConfig, this);
        goodsInfoModelDao = new GoodsInfoModelDao(goodsInfoModelDaoConfig, this);
        houseGroupModelDao = new HouseGroupModelDao(houseGroupModelDaoConfig, this);
        houseSingleModelDao = new HouseSingleModelDao(houseSingleModelDaoConfig, this);
        iCQMessageDao = new ICQMessageDao(iCQMessageDaoConfig, this);
        localEventSyncDao = new LocalEventSyncDao(localEventSyncDaoConfig, this);
        localWaitMediaModelDao = new LocalWaitMediaModelDao(localWaitMediaModelDaoConfig, this);
        mediaSourceModelDao = new MediaSourceModelDao(mediaSourceModelDaoConfig, this);
        personLocationDao = new PersonLocationDao(personLocationDaoConfig, this);
        pointInfoModelDao = new PointInfoModelDao(pointInfoModelDaoConfig, this);
        roleInfoModelDao = new RoleInfoModelDao(roleInfoModelDaoConfig, this);
        surveyPointModelDao = new SurveyPointModelDao(surveyPointModelDaoConfig, this);
        syncDataChangeModelDao = new SyncDataChangeModelDao(syncDataChangeModelDaoConfig, this);
        syncDataFlagModelDao = new SyncDataFlagModelDao(syncDataFlagModelDaoConfig, this);
        taskInfoModelDao = new TaskInfoModelDao(taskInfoModelDaoConfig, this);
        userIdModelDao = new UserIdModelDao(userIdModelDaoConfig, this);
        userInfoModelDao = new UserInfoModelDao(userInfoModelDaoConfig, this);
        userRoleModelDao = new UserRoleModelDao(userRoleModelDaoConfig, this);

        registerDao(BaseModel.class, baseModelDao);
        registerDao(BiaoZhuModel.class, biaoZhuModelDao);
        registerDao(CarInfoModel.class, carInfoModelDao);
        registerDao(EventCenterModel.class, eventCenterModelDao);
        registerDao(EventFeedBack.class, eventFeedBackDao);
        registerDao(EventInfoModel.class, eventInfoModelDao);
        registerDao(EventMemberItem.class, eventMemberItemDao);
        registerDao(EventTeamModel.class, eventTeamModelDao);
        registerDao(FastCollectModel.class, fastCollectModelDao);
        registerDao(File12322.class, file12322Dao);
        registerDao(Files12322Dir.class, files12322DirDao);
        registerDao(GoodsInfoModel.class, goodsInfoModelDao);
        registerDao(HouseGroupModel.class, houseGroupModelDao);
        registerDao(HouseSingleModel.class, houseSingleModelDao);
        registerDao(ICQMessage.class, iCQMessageDao);
        registerDao(LocalEventSync.class, localEventSyncDao);
        registerDao(LocalWaitMediaModel.class, localWaitMediaModelDao);
        registerDao(MediaSourceModel.class, mediaSourceModelDao);
        registerDao(PersonLocation.class, personLocationDao);
        registerDao(PointInfoModel.class, pointInfoModelDao);
        registerDao(RoleInfoModel.class, roleInfoModelDao);
        registerDao(SurveyPointModel.class, surveyPointModelDao);
        registerDao(SyncDataChangeModel.class, syncDataChangeModelDao);
        registerDao(SyncDataFlagModel.class, syncDataFlagModelDao);
        registerDao(TaskInfoModel.class, taskInfoModelDao);
        registerDao(UserIdModel.class, userIdModelDao);
        registerDao(UserInfoModel.class, userInfoModelDao);
        registerDao(UserRoleModel.class, userRoleModelDao);
    }
    
    public void clear() {
        baseModelDaoConfig.clearIdentityScope();
        biaoZhuModelDaoConfig.clearIdentityScope();
        carInfoModelDaoConfig.clearIdentityScope();
        eventCenterModelDaoConfig.clearIdentityScope();
        eventFeedBackDaoConfig.clearIdentityScope();
        eventInfoModelDaoConfig.clearIdentityScope();
        eventMemberItemDaoConfig.clearIdentityScope();
        eventTeamModelDaoConfig.clearIdentityScope();
        fastCollectModelDaoConfig.clearIdentityScope();
        file12322DaoConfig.clearIdentityScope();
        files12322DirDaoConfig.clearIdentityScope();
        goodsInfoModelDaoConfig.clearIdentityScope();
        houseGroupModelDaoConfig.clearIdentityScope();
        houseSingleModelDaoConfig.clearIdentityScope();
        iCQMessageDaoConfig.clearIdentityScope();
        localEventSyncDaoConfig.clearIdentityScope();
        localWaitMediaModelDaoConfig.clearIdentityScope();
        mediaSourceModelDaoConfig.clearIdentityScope();
        personLocationDaoConfig.clearIdentityScope();
        pointInfoModelDaoConfig.clearIdentityScope();
        roleInfoModelDaoConfig.clearIdentityScope();
        surveyPointModelDaoConfig.clearIdentityScope();
        syncDataChangeModelDaoConfig.clearIdentityScope();
        syncDataFlagModelDaoConfig.clearIdentityScope();
        taskInfoModelDaoConfig.clearIdentityScope();
        userIdModelDaoConfig.clearIdentityScope();
        userInfoModelDaoConfig.clearIdentityScope();
        userRoleModelDaoConfig.clearIdentityScope();
    }

    public BaseModelDao getBaseModelDao() {
        return baseModelDao;
    }

    public BiaoZhuModelDao getBiaoZhuModelDao() {
        return biaoZhuModelDao;
    }

    public CarInfoModelDao getCarInfoModelDao() {
        return carInfoModelDao;
    }

    public EventCenterModelDao getEventCenterModelDao() {
        return eventCenterModelDao;
    }

    public EventFeedBackDao getEventFeedBackDao() {
        return eventFeedBackDao;
    }

    public EventInfoModelDao getEventInfoModelDao() {
        return eventInfoModelDao;
    }

    public EventMemberItemDao getEventMemberItemDao() {
        return eventMemberItemDao;
    }

    public EventTeamModelDao getEventTeamModelDao() {
        return eventTeamModelDao;
    }

    public FastCollectModelDao getFastCollectModelDao() {
        return fastCollectModelDao;
    }

    public File12322Dao getFile12322Dao() {
        return file12322Dao;
    }

    public Files12322DirDao getFiles12322DirDao() {
        return files12322DirDao;
    }

    public GoodsInfoModelDao getGoodsInfoModelDao() {
        return goodsInfoModelDao;
    }

    public HouseGroupModelDao getHouseGroupModelDao() {
        return houseGroupModelDao;
    }

    public HouseSingleModelDao getHouseSingleModelDao() {
        return houseSingleModelDao;
    }

    public ICQMessageDao getICQMessageDao() {
        return iCQMessageDao;
    }

    public LocalEventSyncDao getLocalEventSyncDao() {
        return localEventSyncDao;
    }

    public LocalWaitMediaModelDao getLocalWaitMediaModelDao() {
        return localWaitMediaModelDao;
    }

    public MediaSourceModelDao getMediaSourceModelDao() {
        return mediaSourceModelDao;
    }

    public PersonLocationDao getPersonLocationDao() {
        return personLocationDao;
    }

    public PointInfoModelDao getPointInfoModelDao() {
        return pointInfoModelDao;
    }

    public RoleInfoModelDao getRoleInfoModelDao() {
        return roleInfoModelDao;
    }

    public SurveyPointModelDao getSurveyPointModelDao() {
        return surveyPointModelDao;
    }

    public SyncDataChangeModelDao getSyncDataChangeModelDao() {
        return syncDataChangeModelDao;
    }

    public SyncDataFlagModelDao getSyncDataFlagModelDao() {
        return syncDataFlagModelDao;
    }

    public TaskInfoModelDao getTaskInfoModelDao() {
        return taskInfoModelDao;
    }

    public UserIdModelDao getUserIdModelDao() {
        return userIdModelDao;
    }

    public UserInfoModelDao getUserInfoModelDao() {
        return userInfoModelDao;
    }

    public UserRoleModelDao getUserRoleModelDao() {
        return userRoleModelDao;
    }

}
