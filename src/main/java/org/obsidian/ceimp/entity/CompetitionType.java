package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionType {
    private Integer typeId;

    private String type;

    private Double percent;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionType{" +
                "typeId=" + typeId +
                ", type='" + type + '\'' +
                ", percent=" + percent +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionType() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionType(String type, Double percent) {
        this.type = type;
        this.percent = percent;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionType(Integer typeId, String type, Double percent) {
        this.typeId = typeId;
        this.type = type;
        this.percent = percent;
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

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}