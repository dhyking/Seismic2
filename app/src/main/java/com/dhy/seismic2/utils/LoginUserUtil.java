package com.dhy.seismic2.utils;

import android.text.TextUtils;

import com.dhy.seismic2.daos.bean.UserInfoModel;
import com.google.gson.Gson;

/**
 * Created by dhy on 2017/6/16.
 */

public class LoginUserUtil {
    private static final String SP_CURRENT_USER = "sp_current_user"; //配置信息

    public static UserInfoModel loadCurrentUser() {
        String userInfo = SpUtil.getInstance().get(SP_CURRENT_USER, "").toString();
        if (!TextUtils.isEmpty(userInfo)) {
            return new Gson().fromJson(userInfo, UserInfoModel.class);
        }
        return null;
    }

    public static boolean saveCurrentUser(UserInfoModel info) {
        String userInfo = new Gson().toJson(info);
        return SpUtil.getInstance().put(SP_CURRENT_USER, userInfo)
                .edit()
                .commit();
    }

}
