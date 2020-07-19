package com.hydee.h3.pos.entity;

import java.util.Date;

public class TTransDownLog2 {
    private Long id;

    private Long confId;

    private String busiType;

    private String posNo;

    private Integer transLogType;

    private Date transStartTime;

    private Date transEndTime;

    private Long transTotalCnt;

    private Long transSuccessCnt;

    private String transMsg;

    private Integer transStatus;

    private String transExceptionMsg;

    private String transSequence;

    private Integer transPageIndex;

    private Date createTime;

    private Long createUser;

    private Date modifyTime;

    private Long modifyUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConfId() {
        return confId;
    }

    public void setConfId(Long confId) {
        this.confId = confId;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public Integer getTransLogType() {
        return transLogType;
    }

    public void setTransLogType(Integer transLogType) {
        this.transLogType = transLogType;
    }

    public Date getTransStartTime() {
        return transStartTime;
    }

    public void setTransStartTime(Date transStartTime) {
        this.transStartTime = transStartTime;
    }

    public Date getTransEndTime() {
        return transEndTime;
    }

    public void setTransEndTime(Date transEndTime) {
        this.transEndTime = transEndTime;
    }

    public Long getTransTotalCnt() {
        return transTotalCnt;
    }

    public void setTransTotalCnt(Long transTotalCnt) {
        this.transTotalCnt = transTotalCnt;
    }

    public Long getTransSuccessCnt() {
        return transSuccessCnt;
    }

    public void setTransSuccessCnt(Long transSuccessCnt) {
        this.transSuccessCnt = transSuccessCnt;
    }

    public String getTransMsg() {
        return transMsg;
    }

    public void setTransMsg(String transMsg) {
        this.transMsg = transMsg;
    }

    public Integer getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Integer transStatus) {
        this.transStatus = transStatus;
    }

    public String getTransExceptionMsg() {
        return transExceptionMsg;
    }

    public void setTransExceptionMsg(String transExceptionMsg) {
        this.transExceptionMsg = transExceptionMsg;
    }

    public String getTransSequence() {
        return transSequence;
    }

    public void setTransSequence(String transSequence) {
        this.transSequence = transSequence;
    }

    public Integer getTransPageIndex() {
        return transPageIndex;
    }

    public void setTransPageIndex(Integer transPageIndex) {
        this.transPageIndex = transPageIndex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }
}