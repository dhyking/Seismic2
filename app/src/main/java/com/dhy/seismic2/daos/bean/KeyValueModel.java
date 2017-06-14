package com.dhy.seismic2.daos.bean;

import java.io.Serializable;

/**
 * Author a
 * Created at 16/5/7
 * Description
 */
public class KeyValueModel implements Serializable {
    private String key;

    private String value;

    public KeyValueModel(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
