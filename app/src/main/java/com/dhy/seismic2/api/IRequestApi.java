package com.dhy.seismic2.api;

import com.google.gson.JsonObject;

import java.util.HashMap;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by dhy on 2017/6/14.
 */
//Api接口
public interface IRequestApi {

    /** 下载数据
     * @param params
     * @return
     */
    @FormUrlEncoded
    @POST("Sync/ServerToLocalRecords")
    Observable<JsonObject> requestServerToLocalRecords(@FieldMap HashMap<String,String> params);


    /**
     * 上传同步数据
     * @param params
     * @return
     */
    @FormUrlEncoded
    @POST("Sync/LocalToServerRecords")
    Observable<JsonObject> requestLocalToServer(@FieldMap HashMap<String,String> params);

    /**
     * 创建会议
     * @param params
     * @return
     */
    @FormUrlEncoded
    @POST("create/meeting")
    Observable<JsonObject> requestCreateMeeting(@FieldMap HashMap<String,String> params);

    /**
     * 得到会议列表
     * @return
     */
    @GET("get/meeting?userId={userId}")
    Observable<JsonObject> requestMeeting(@Path("userId") String userId);


    /**
     * 发送消息
     * @param params
     * @return
     */
    @FormUrlEncoded
    @POST("ICQ/ServerICQMessageSave")
    Observable<JsonObject> requestSendMessage(@FieldMap HashMap<String,String> params);

    /**
     * 接收消息
     * @param userId
     * @return
     */
    @FormUrlEncoded
    @POST("ICQ/ServerICQMessageGet")
    Observable<JsonObject> requestGetMessage(@Field("UserId") String userId);

    /**
     * 请求下载文件
     * @param filePath
     * @return
     */
    @GET("Sync/ServerToLocalMediaFiles?filepath={filePath}")
    Observable<JsonObject> downLoadServerMediaFile(@Path("filePath") String filePath);

    @Multipart
    @POST("Sync/LocalToServerMediaFiles")
    Observable<JsonObject> upLoadLocalMediaFile(@Body MultipartBody body);
}
