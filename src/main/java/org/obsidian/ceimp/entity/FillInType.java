package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class FillInType {
    private Integer fillInTypeId;

    private String type;

    private Long createTime;

    @Override
    public String toString() {
        return "FillInType{" +
                "fillInTypeId=" + fillInTypeId +
                ", type='" + type + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public FillInType() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public FillInType(String type) {
        this.type = type;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public FillInType(Integer fillInTypeId, String type) {
        this.fillInTypeId = fillInTypeId;
        this.type = type;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getFillInTypeId() {
        return fillInTypeId;
    }

    public void setFillInTypeId(Integer fillInTypeId) {
        this.fillInTypeId = fillInTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}