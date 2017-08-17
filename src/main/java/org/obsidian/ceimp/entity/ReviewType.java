package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ReviewType {
    private Integer typeId;

    private String type;

    private Long createTime;

    @Override
    public String toString() {
        return "ReviewType{" +
                "typeId=" + typeId +
                ", type='" + type + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ReviewType() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewType(String type) {
        this.type = type;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewType(Integer typeId, String type) {
        this.typeId = typeId;
        this.type = type;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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