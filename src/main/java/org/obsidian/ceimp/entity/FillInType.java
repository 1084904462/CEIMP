package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class FillInType {
    private Integer fillInTypeId;

    private String fillInType;

    private Long createTime;

    @Override
    public String toString() {
        return "FillInType{" +
                "fillInTypeId=" + fillInTypeId +
                ", fillInType='" + fillInType + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public FillInType() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public FillInType(Integer fillInTypeId, String fillInType) {
        this.fillInTypeId = fillInTypeId;
        this.fillInType = fillInType;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getFillInTypeId() {
        return fillInTypeId;
    }

    public void setFillInTypeId(Integer fillInTypeId) {
        this.fillInTypeId = fillInTypeId;
    }

    public String getFillInType() {
        return fillInType;
    }

    public void setFillInType(String fillInType) {
        this.fillInType = fillInType == null ? null : fillInType.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}