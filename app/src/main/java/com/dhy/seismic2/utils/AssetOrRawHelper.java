package com.dhy.seismic2.utils;

import android.content.Context;

import com.dhy.seismic2.R;
import com.orhanobut.logger.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dhy on 2017/6/15.
 */

public class AssetOrRawHelper {
    public final static int TYPE_ASSET = 1;
    public final static int TYPE_RAW = 2;
    private Context context;
    private static AssetOrRawHelper instance;

    private AssetOrRawHelper(Context mContext) {
        this.context = mContext;
    }

    public static AssetOrRawHelper getInstance(Context mContext) {
        if (instance == null) {
            instance = new AssetOrRawHelper(mContext);
        }
        return instance;
    }

    /**
     * 读取文件
     *
     * @param fileName
     * @return
     */
    public String readData(String fileName, int type) {
        InputStream inStream = null;
        String data = null;
        try {
            inStream = context.getAssets().open(fileName);     //打开assets/raw目录中的文本文件
            byte[] bytes = new byte[inStream.available()];  //inStream.available()为文件中的总byte数
            inStream.read(bytes);
            inStream.close();
            data = new String(bytes, "utf-8");        //将bytes转为utf-8字符串
        } catch (IOException e) {
            Logger.e(e.toString());
            e.printStackTrace();
        }
        return data;
    }

    public boolean CopyData(int resId, String file) {
        try {
            InputStream is = context.getResources().openRawResource(
                    R.raw.eds);
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buffer = new byte[is.available()];
            int count;
            while ((count = is.read(buffer)) > 0) {
                fos.write(buffer, 0, count);
            }
            fos.close();
            is.close();
            return true;
        } catch (FileNotFoundException mE) {
            mE.printStackTrace();
            return false;
        } catch (IOException mE) {
            mE.printStackTrace();
            return false;
        }
    }

}
