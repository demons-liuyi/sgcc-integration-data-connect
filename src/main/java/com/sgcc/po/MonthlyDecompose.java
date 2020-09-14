package com.sgcc.po;

import java.math.BigDecimal;

public class MonthlyDecompose {
    private String decomposeId;

    private String contractId;

    private Integer particularYear;

    private Integer month;

    private BigDecimal decomposeElectricity;

    private String createUserId;

    private String createTime;

    private String updateUserId;

    private String updateTime;

    private Long version;

    private String dataStatus;

    public String getDecomposeId() {
        return decomposeId;
    }

    public void setDecomposeId(String decomposeId) {
        this.decomposeId = decomposeId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Integer getParticularYear() {
        return particularYear;
    }

    public void setParticularYear(Integer particularYear) {
        this.particularYear = particularYear;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public BigDecimal getDecomposeElectricity() {
        return decomposeElectricity;
    }

    public void setDecomposeElectricity(BigDecimal decomposeElectricity) {
        this.decomposeElectricity = decomposeElectricity;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }
}