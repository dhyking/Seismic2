package com.dhy.seismic2.daos.bean;

import android.database.Cursor;

/**
 * Created by huqf on 2016/8/1.
 */
public class TaskPointModel {
    private double X;
    private double Y;
    private String TASKDESC;
    private String ID;

    public TaskPointModel(Cursor cursor) {
        for (int i = 0; i < cursor.getColumnCount(); i++) {
            if ("X".equals(cursor.getColumnName(i))) this.X = cursor.getDouble(i);
            if ("Y".equals(cursor.getColumnName(i))) this.Y = cursor.getDouble(i);
            if ("TASKDESC".equals(cursor.getColumnName(i))) this.TASKDESC = cursor.getString(i);
            if ("ID".equals(cursor.getColumnName(i))) this.ID = cursor.getString(i);
        }
    }
    public TaskPointModel(){}
    public TaskPointModel(double x, double y, String TASKDESC, String ID) {
        X = x;
        Y = y;
        this.TASKDESC = TASKDESC;
        this.ID = ID;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public String getTASKDESC() {
        return TASKDESC;
    }

    public void setTASKDESC(String TASKDESC) {
        this.TASKDESC = TASKDESC;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
