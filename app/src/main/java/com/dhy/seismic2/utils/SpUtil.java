package com.dhy.seismic2.utils;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/**
 * SharedPreferences 工具类
 * Created by dhy on 2017/6/6.
 */

public class SpUtil {
    private static SpUtil instance;
    public SharedPreferences sp;
    private final static String SP_NAME = "SharePreference_data";
    private SharedPreferences.Editor editor;
    private SharedPreferences.OnSharedPreferenceChangeListener listener;

    public final static String PREFERENCE_LOGIN ="preference_login";
    public final static String DB_EXIST_STATE = "dbExistState";
    public final static String ROLE_TYPE = "role_type";


    private SpUtil(Context context) {
        sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
    }

    private SpUtil(Context context, String name) {
        sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public static SpUtil getInstance(Context context) {
        if (instance == null) {
            instance = new SpUtil(context);
        }
        return instance;
    }

    public static SpUtil getInstance(Context context, String name) {
        if (instance == null) {
            instance = new SpUtil(context, name);
        }
        return instance;
    }

    public synchronized SpUtil edit() {
        if (editor == null) {
            editor = sp.edit();
        }
        return this;
    }

    /**
     * 同步-立即提交保存到到磁盘,在主线程执行,有返回结果
     *  因为是同步过程,所以是执行完当前commit才去执行下一个,当多并发的时候会影响性能,造成线程阻塞
     * @return
     */
    public synchronized boolean commit() {
        boolean committed = editor.commit();
        editor = null;
        return committed;
    }

    /**
     * 异步-立即提交保存到内存,然后再异步提交保存到磁盘,无返回结果
     *  后面一条的apply会覆盖当前的内存中的数据,然后异步执行,不会造成线程阻塞
     */
    public synchronized void apply() {
        editor.apply();
        editor = null;
    }

    /**
     * 修改保存的数据
     *
     * @param key
     * @param object
     * @return
     */
    public SpUtil put(String key, Object object) {
        if (object == null) {
            editor.putString(key, "");
            return this;
        }
        if (object instanceof Integer) {
            editor.putInt(key, (Integer) object);
        } else if (object instanceof Boolean) {
            editor.putBoolean(key, (Boolean) object);
        } else if (object instanceof Float) {
            editor.putFloat(key, (Float) object);
        } else if (object instanceof Long) {
            editor.putLong(key, (Long) object);
        } else if (object instanceof String) {
            editor.putString(key, (String) object);
        } else if (object instanceof Set) {
            editor.putStringSet(key, (Set<String>) object);
        } else {
            editor.putString(key, (String) object);
        }
        return this;
    }

    /**
     * 获取保存的数据
     *
     * @param key
     * @param defaultObject
     * @return
     */
    public Object get(String key, Object defaultObject) {
        if (defaultObject == null) {
            return sp.getString(key, null);
        }

        if (defaultObject instanceof Integer) {
            return sp.getInt(key, (Integer) defaultObject);
        }
        if (defaultObject instanceof Boolean) {
            return sp.getBoolean(key, (Boolean) defaultObject);
        }
        if (defaultObject instanceof Float) {
            return sp.getFloat(key, (Float) defaultObject);
        }
        if (defaultObject instanceof Long) {
            return sp.getLong(key, (Long) defaultObject);
        }
        if (defaultObject instanceof String) {
            return sp.getString(key, (String) defaultObject);
        }
        if (defaultObject instanceof Set) {
            return sp.getStringSet(key, (Set<String>) defaultObject);
        }
        return null;
    }

    /**
     * 清除保存的某个键名的数据
     * @param key
     * @return
     */
    public SpUtil remove(String key) {
        editor.remove(key);
        return this;
    }

    /**
     * 清除对应的SharePreference的所有数据
     * @return
     */
    public SpUtil clear() {
        editor.clear();
        return this;
    }

    /**
     * 获取当前所有保存的键值对
     * @return
     */
    public Map getAll() {
        return sp.getAll();
    }

    /**
     * 当前SharePreference是否存在某键名的数据
     * @param key
     * @return
     */
    public boolean isContain(String key) {
        return sp.contains(key);
    }

    public void registerListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        if (sp != null) {
            this.listener = listener;
            sp.registerOnSharedPreferenceChangeListener(listener);
        }
    }

    public void unregisterListener() {
        if (sp !=null && this.listener!=null) {
            sp.unregisterOnSharedPreferenceChangeListener(listener);
        }
    }
}
