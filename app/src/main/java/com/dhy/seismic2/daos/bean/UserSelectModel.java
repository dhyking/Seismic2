package com.dhy.seismic2.daos.bean;

import java.io.Serializable;

/**
 * Created by RenTH on 2016/4/27.
 */
public class UserSelectModel extends UserInfoModel implements Serializable {

    private boolean isChecked;

    public UserSelectModel(){}
    public UserSelectModel(UserInfoModel model){
        this.setUSERNAME(model.getUSERNAME());
        this.setCREATOR(model.getCREATOR());
        this.setACCOUNT(model.getACCOUNT());
        this.setCREATEID(model.getCREATEID());
        this.setADDRESS(model.getADDRESS());
        this.setCLASSIFY(model.getCLASSIFY());
        this.setCOMPANY(model.getCOMPANY());
        this.setDEPT(model.getDEPT());
        this.setEMAIL(model.getEMAIL());
        this.setID(model.getID());
        this.setMOBILE(model.getMOBILE());
        this.setMODIFIEDID(model.getMODIFIEDID());
        this.setMODIFIEDTIME(model.getMODIFIEDTIME());
        this.setMODIFIER(model.getMODIFIER());
        this.setPASSWORD(model.getPASSWORD());
        this.setPHONE(model.getPHONE());
        this.setPOST(model.getPHONE());
        this.setSATION(model.getSATION());
        this.setSEX(model.getSEX());
        this.setSTATE(model.getSTATE());
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
}
