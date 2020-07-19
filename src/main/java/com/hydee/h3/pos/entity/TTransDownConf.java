package com.hydee.h3.pos.entity;

import java.util.Date;

public class TTransDownConf {
    private Long id;

    private String busiTypeName;

    private String busiType;

    private String transType;

    private String transSqlConditions;

    private String transUrl;

    private String busiMainTable;

    private String busiMainTableId;

    private String busiUnionField;

    private Byte dstHandleStrategy;

    private Integer busiTransFrequency;

    private Byte busiIsSkip;

    private Integer busiTransOrder;

    private Integer busiPageSize;

    private Byte busiConfTryTimes;

    private Byte busiRetryTimes;

    private String busiNotes;

    private String busiConfVersion;

    private Date transTimestamp;

    private Long transOffsetId;

    private Byte isDelete;

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

    public String getBusiTypeName() {
        return busiTypeName;
    }

    public void setBusiTypeName(String busiTypeName) {
        this.busiTypeName = busiTypeName;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransSqlConditions() {
        return transSqlConditions;
    }

    public void setTransSqlConditions(String transSqlConditions) {
        this.transSqlConditions = transSqlConditions;
    }

    public String getTransUrl() {
        return transUrl;
    }

    public void setTransUrl(String transUrl) {
        this.transUrl = transUrl;
    }

    public String getBusiMainTable() {
        return busiMainTable;
    }

    public void setBusiMainTable(String busiMainTable) {
        this.busiMainTable = busiMainTable;
    }

    public String getBusiMainTableId() {
        return busiMainTableId;
    }

    public void setBusiMainTableId(String busiMainTableId) {
        this.busiMainTableId = busiMainTableId;
    }

    public String getBusiUnionField() {
        return busiUnionField;
    }

    public void setBusiUnionField(String busiUnionField) {
        this.busiUnionField = busiUnionField;
    }

    public Byte getDstHandleStrategy() {
        return dstHandleStrategy;
    }

    public void setDstHandleStrategy(Byte dstHandleStrategy) {
        this.dstHandleStrategy = dstHandleStrategy;
    }

    public Integer getBusiTransFrequency() {
        return busiTransFrequency;
    }

    public void setBusiTransFrequency(Integer busiTransFrequency) {
        this.busiTransFrequency = busiTransFrequency;
    }

    public Byte getBusiIsSkip() {
        return busiIsSkip;
    }

    public void setBusiIsSkip(Byte busiIsSkip) {
        this.busiIsSkip = busiIsSkip;
    }

    public Integer getBusiTransOrder() {
        return busiTransOrder;
    }

    public void setBusiTransOrder(Integer busiTransOrder) {
        this.busiTransOrder = busiTransOrder;
    }

    public Integer getBusiPageSize() {
        return busiPageSize;
    }

    public void setBusiPageSize(Integer busiPageSize) {
        this.busiPageSize = busiPageSize;
    }

    public Byte getBusiConfTryTimes() {
        return busiConfTryTimes;
    }

    public void setBusiConfTryTimes(Byte busiConfTryTimes) {
        this.busiConfTryTimes = busiConfTryTimes;
    }

    public Byte getBusiRetryTimes() {
        return busiRetryTimes;
    }

    public void setBusiRetryTimes(Byte busiRetryTimes) {
        this.busiRetryTimes = busiRetryTimes;
    }

    public String getBusiNotes() {
        return busiNotes;
    }

    public void setBusiNotes(String busiNotes) {
        this.busiNotes = busiNotes;
    }

    public String getBusiConfVersion() {
        return busiConfVersion;
    }

    public void setBusiConfVersion(String busiConfVersion) {
        this.busiConfVersion = busiConfVersion;
    }

    public Date getTransTimestamp() {
        return transTimestamp;
    }

    public void setTransTimestamp(Date transTimestamp) {
        this.transTimestamp = transTimestamp;
    }

    public Long getTransOffsetId() {
        return transOffsetId;
    }

    public void setTransOffsetId(Long transOffsetId) {
        this.transOffsetId = transOffsetId;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
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