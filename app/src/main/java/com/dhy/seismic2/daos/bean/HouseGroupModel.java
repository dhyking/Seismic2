package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "HouseGroup")
public class HouseGroupModel {
    @Id
    private String ID;
    @Property(nameInDb = "belongTo")
    private String belongTo;
    @Property(nameInDb = "type")
    private int type; //0按面积，1按栋数
    @Property(nameInDb = "steelDestroy")
    private double steelDestroy;
    @Property(nameInDb = "steelSeriousDamage")
    private double steelSeriousDamage;
    @Property(nameInDb = "steelDamage")
    private double steelDamage;
    @Property(nameInDb = "steelSlightDamage")
    private double steelSlightDamage;
    @Property(nameInDb = "steelBasicGood")
    private double steelBasicGood;
    @Property(nameInDb = "defensiveBrickDestroy")
    private double defensiveBrickDestroy;
    @Property(nameInDb = "defensiveBrickSeriousDamage")
    private double defensiveBrickSeriousDamage;
    @Property(nameInDb = "defensiveBrickDamage")
    private double defensiveBrickDamage;
    @Property(nameInDb = "defensiveBrickSlightDamage")
    private double defensiveBrickSlightDamage;
    @Property(nameInDb = "defensiveBrickBasicGood")
    private double defensiveBrickBasicGood;
    @Property(nameInDb = "brickDestroy")
    private double brickDestroy;
    @Property(nameInDb = "brickSeriousDamage")
    private double brickSeriousDamage;
    @Property(nameInDb = "brickDamage")
    private double brickDamage;
    @Property(nameInDb = "brickSlightDamage")
    private double brickSlightDamage;
    @Property(nameInDb = "brickBasicGood")
    private double brickBasicGood;
    @Property(nameInDb = "stockDestroy")
    private double stockDestroy;
    @Property(nameInDb = "stockSeriousDamage")
    private double stockSeriousDamage;
    @Property(nameInDb = "stockDamage")
    private double stockDamage;
    @Property(nameInDb = "stockSlightDamage")
    private double stockSlightDamage;
    @Property(nameInDb = "stockBasicGood")
    private double stockBasicGood;
    @Property(nameInDb = "civilDestroy")
    private double civilDestroy;
    @Property(nameInDb = "civilSeriousDamage")
    private double civilSeriousDamage;
    @Property(nameInDb = "civilDamage")
    private double civilDamage;
    @Property(nameInDb = "civilSlightDamage")
    private double civilSlightDamage;
    @Property(nameInDb = "civilBasicGood")
    private double civilBasicGood;
    @Property(nameInDb = "otherDestroy")
    private double otherDestroy;
    @Property(nameInDb = "otherSeriousDamage")
    private double otherSeriousDamage;
    @Property(nameInDb = "otherDamage")
    private double otherDamage;
    @Property(nameInDb = "otherSlightDamage")
    private double otherSlightDamage;
    @Property(nameInDb = "otherBasicGood")
    private double otherBasicGood;
    @Property(nameInDb = "isUpload")
    private int isUpload;
    @Property(nameInDb = "State")
    private int State;
    private String INQUIRERID;
    private String INQUIRERNAME;
    private String INQUIRERTIME;
    @Property(nameInDb = "EventHeadId")
    private String EventHeadId;
    @Generated(hash = 1486872768)
    public HouseGroupModel(String ID, String belongTo, int type,
            double steelDestroy, double steelSeriousDamage, double steelDamage,
            double steelSlightDamage, double steelBasicGood,
            double defensiveBrickDestroy, double defensiveBrickSeriousDamage,
            double defensiveBrickDamage, double defensiveBrickSlightDamage,
            double defensiveBrickBasicGood, double brickDestroy,
            double brickSeriousDamage, double brickDamage, double brickSlightDamage,
            double brickBasicGood, double stockDestroy, double stockSeriousDamage,
            double stockDamage, double stockSlightDamage, double stockBasicGood,
            double civilDestroy, double civilSeriousDamage, double civilDamage,
            double civilSlightDamage, double civilBasicGood, double otherDestroy,
            double otherSeriousDamage, double otherDamage, double otherSlightDamage,
            double otherBasicGood, int isUpload, int State, String INQUIRERID,
            String INQUIRERNAME, String INQUIRERTIME, String EventHeadId) {
        this.ID = ID;
        this.belongTo = belongTo;
        this.type = type;
        this.steelDestroy = steelDestroy;
        this.steelSeriousDamage = steelSeriousDamage;
        this.steelDamage = steelDamage;
        this.steelSlightDamage = steelSlightDamage;
        this.steelBasicGood = steelBasicGood;
        this.defensiveBrickDestroy = defensiveBrickDestroy;
        this.defensiveBrickSeriousDamage = defensiveBrickSeriousDamage;
        this.defensiveBrickDamage = defensiveBrickDamage;
        this.defensiveBrickSlightDamage = defensiveBrickSlightDamage;
        this.defensiveBrickBasicGood = defensiveBrickBasicGood;
        this.brickDestroy = brickDestroy;
        this.brickSeriousDamage = brickSeriousDamage;
        this.brickDamage = brickDamage;
        this.brickSlightDamage = brickSlightDamage;
        this.brickBasicGood = brickBasicGood;
        this.stockDestroy = stockDestroy;
        this.stockSeriousDamage = stockSeriousDamage;
        this.stockDamage = stockDamage;
        this.stockSlightDamage = stockSlightDamage;
        this.stockBasicGood = stockBasicGood;
        this.civilDestroy = civilDestroy;
        this.civilSeriousDamage = civilSeriousDamage;
        this.civilDamage = civilDamage;
        this.civilSlightDamage = civilSlightDamage;
        this.civilBasicGood = civilBasicGood;
        this.otherDestroy = otherDestroy;
        this.otherSeriousDamage = otherSeriousDamage;
        this.otherDamage = otherDamage;
        this.otherSlightDamage = otherSlightDamage;
        this.otherBasicGood = otherBasicGood;
        this.isUpload = isUpload;
        this.State = State;
        this.INQUIRERID = INQUIRERID;
        this.INQUIRERNAME = INQUIRERNAME;
        this.INQUIRERTIME = INQUIRERTIME;
        this.EventHeadId = EventHeadId;
    }
    @Generated(hash = 736039578)
    public HouseGroupModel() {
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getBelongTo() {
        return this.belongTo;
    }
    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public double getSteelDestroy() {
        return this.steelDestroy;
    }
    public void setSteelDestroy(double steelDestroy) {
        this.steelDestroy = steelDestroy;
    }
    public double getSteelSeriousDamage() {
        return this.steelSeriousDamage;
    }
    public void setSteelSeriousDamage(double steelSeriousDamage) {
        this.steelSeriousDamage = steelSeriousDamage;
    }
    public double getSteelDamage() {
        return this.steelDamage;
    }
    public void setSteelDamage(double steelDamage) {
        this.steelDamage = steelDamage;
    }
    public double getSteelSlightDamage() {
        return this.steelSlightDamage;
    }
    public void setSteelSlightDamage(double steelSlightDamage) {
        this.steelSlightDamage = steelSlightDamage;
    }
    public double getSteelBasicGood() {
        return this.steelBasicGood;
    }
    public void setSteelBasicGood(double steelBasicGood) {
        this.steelBasicGood = steelBasicGood;
    }
    public double getDefensiveBrickDestroy() {
        return this.defensiveBrickDestroy;
    }
    public void setDefensiveBrickDestroy(double defensiveBrickDestroy) {
        this.defensiveBrickDestroy = defensiveBrickDestroy;
    }
    public double getDefensiveBrickSeriousDamage() {
        return this.defensiveBrickSeriousDamage;
    }
    public void setDefensiveBrickSeriousDamage(double defensiveBrickSeriousDamage) {
        this.defensiveBrickSeriousDamage = defensiveBrickSeriousDamage;
    }
    public double getDefensiveBrickDamage() {
        return this.defensiveBrickDamage;
    }
    public void setDefensiveBrickDamage(double defensiveBrickDamage) {
        this.defensiveBrickDamage = defensiveBrickDamage;
    }
    public double getDefensiveBrickSlightDamage() {
        return this.defensiveBrickSlightDamage;
    }
    public void setDefensiveBrickSlightDamage(double defensiveBrickSlightDamage) {
        this.defensiveBrickSlightDamage = defensiveBrickSlightDamage;
    }
    public double getDefensiveBrickBasicGood() {
        return this.defensiveBrickBasicGood;
    }
    public void setDefensiveBrickBasicGood(double defensiveBrickBasicGood) {
        this.defensiveBrickBasicGood = defensiveBrickBasicGood;
    }
    public double getBrickDestroy() {
        return this.brickDestroy;
    }
    public void setBrickDestroy(double brickDestroy) {
        this.brickDestroy = brickDestroy;
    }
    public double getBrickSeriousDamage() {
        return this.brickSeriousDamage;
    }
    public void setBrickSeriousDamage(double brickSeriousDamage) {
        this.brickSeriousDamage = brickSeriousDamage;
    }
    public double getBrickDamage() {
        return this.brickDamage;
    }
    public void setBrickDamage(double brickDamage) {
        this.brickDamage = brickDamage;
    }
    public double getBrickSlightDamage() {
        return this.brickSlightDamage;
    }
    public void setBrickSlightDamage(double brickSlightDamage) {
        this.brickSlightDamage = brickSlightDamage;
    }
    public double getBrickBasicGood() {
        return this.brickBasicGood;
    }
    public void setBrickBasicGood(double brickBasicGood) {
        this.brickBasicGood = brickBasicGood;
    }
    public double getStockDestroy() {
        return this.stockDestroy;
    }
    public void setStockDestroy(double stockDestroy) {
        this.stockDestroy = stockDestroy;
    }
    public double getStockSeriousDamage() {
        return this.stockSeriousDamage;
    }
    public void setStockSeriousDamage(double stockSeriousDamage) {
        this.stockSeriousDamage = stockSeriousDamage;
    }
    public double getStockDamage() {
        return this.stockDamage;
    }
    public void setStockDamage(double stockDamage) {
        this.stockDamage = stockDamage;
    }
    public double getStockSlightDamage() {
        return this.stockSlightDamage;
    }
    public void setStockSlightDamage(double stockSlightDamage) {
        this.stockSlightDamage = stockSlightDamage;
    }
    public double getStockBasicGood() {
        return this.stockBasicGood;
    }
    public void setStockBasicGood(double stockBasicGood) {
        this.stockBasicGood = stockBasicGood;
    }
    public double getCivilDestroy() {
        return this.civilDestroy;
    }
    public void setCivilDestroy(double civilDestroy) {
        this.civilDestroy = civilDestroy;
    }
    public double getCivilSeriousDamage() {
        return this.civilSeriousDamage;
    }
    public void setCivilSeriousDamage(double civilSeriousDamage) {
        this.civilSeriousDamage = civilSeriousDamage;
    }
    public double getCivilDamage() {
        return this.civilDamage;
    }
    public void setCivilDamage(double civilDamage) {
        this.civilDamage = civilDamage;
    }
    public double getCivilSlightDamage() {
        return this.civilSlightDamage;
    }
    public void setCivilSlightDamage(double civilSlightDamage) {
        this.civilSlightDamage = civilSlightDamage;
    }
    public double getCivilBasicGood() {
        return this.civilBasicGood;
    }
    public void setCivilBasicGood(double civilBasicGood) {
        this.civilBasicGood = civilBasicGood;
    }
    public double getOtherDestroy() {
        return this.otherDestroy;
    }
    public void setOtherDestroy(double otherDestroy) {
        this.otherDestroy = otherDestroy;
    }
    public double getOtherSeriousDamage() {
        return this.otherSeriousDamage;
    }
    public void setOtherSeriousDamage(double otherSeriousDamage) {
        this.otherSeriousDamage = otherSeriousDamage;
    }
    public double getOtherDamage() {
        return this.otherDamage;
    }
    public void setOtherDamage(double otherDamage) {
        this.otherDamage = otherDamage;
    }
    public double getOtherSlightDamage() {
        return this.otherSlightDamage;
    }
    public void setOtherSlightDamage(double otherSlightDamage) {
        this.otherSlightDamage = otherSlightDamage;
    }
    public double getOtherBasicGood() {
        return this.otherBasicGood;
    }
    public void setOtherBasicGood(double otherBasicGood) {
        this.otherBasicGood = otherBasicGood;
    }
    public int getIsUpload() {
        return this.isUpload;
    }
    public void setIsUpload(int isUpload) {
        this.isUpload = isUpload;
    }
    public int getState() {
        return this.State;
    }
    public void setState(int State) {
        this.State = State;
    }
    public String getINQUIRERID() {
        return this.INQUIRERID;
    }
    public void setINQUIRERID(String INQUIRERID) {
        this.INQUIRERID = INQUIRERID;
    }
    public String getINQUIRERNAME() {
        return this.INQUIRERNAME;
    }
    public void setINQUIRERNAME(String INQUIRERNAME) {
        this.INQUIRERNAME = INQUIRERNAME;
    }
    public String getINQUIRERTIME() {
        return this.INQUIRERTIME;
    }
    public void setINQUIRERTIME(String INQUIRERTIME) {
        this.INQUIRERTIME = INQUIRERTIME;
    }
    public String getEventHeadId() {
        return this.EventHeadId;
    }
    public void setEventHeadId(String EventHeadId) {
        this.EventHeadId = EventHeadId;
    }


}
