package com.dhy.seismic2.daos.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dhy on 2017/6/13.
 */
@Entity(nameInDb = "ICQMessage")
public class ICQMessage {
    @Id
    private int Id;
    private String SenderId;
    private int ReceiverType;
    private String ReceiverId;
    private int MsgType;
    private String Content;
    private String CreatedTime;
    private int IsFinish;
    private String FileName;
    @Generated(hash = 1929208155)
    public ICQMessage(int Id, String SenderId, int ReceiverType, String ReceiverId,
            int MsgType, String Content, String CreatedTime, int IsFinish,
            String FileName) {
        this.Id = Id;
        this.SenderId = SenderId;
        this.ReceiverType = ReceiverType;
        this.ReceiverId = ReceiverId;
        this.MsgType = MsgType;
        this.Content = Content;
        this.CreatedTime = CreatedTime;
        this.IsFinish = IsFinish;
        this.FileName = FileName;
    }
    @Generated(hash = 916799104)
    public ICQMessage() {
    }
    public int getId() {
        return this.Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getSenderId() {
        return this.SenderId;
    }
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }
    public int getReceiverType() {
        return this.ReceiverType;
    }
    public void setReceiverType(int ReceiverType) {
        this.ReceiverType = ReceiverType;
    }
    public String getReceiverId() {
        return this.ReceiverId;
    }
    public void setReceiverId(String ReceiverId) {
        this.ReceiverId = ReceiverId;
    }
    public int getMsgType() {
        return this.MsgType;
    }
    public void setMsgType(int MsgType) {
        this.MsgType = MsgType;
    }
    public String getContent() {
        return this.Content;
    }
    public void setContent(String Content) {
        this.Content = Content;
    }
    public String getCreatedTime() {
        return this.CreatedTime;
    }
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }
    public int getIsFinish() {
        return this.IsFinish;
    }
    public void setIsFinish(int IsFinish) {
        this.IsFinish = IsFinish;
    }
    public String getFileName() {
        return this.FileName;
    }
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }
}
