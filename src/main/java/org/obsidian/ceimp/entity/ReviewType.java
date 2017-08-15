package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ReviewType {
    private Integer reviewTypeId;

    private String type;

    private Long createTime;

    @Override
    public String toString() {
        return "ReviewType{" +
                "reviewTypeId=" + reviewTypeId +
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

    public ReviewType(Integer reviewTypeId, String type) {
        this.reviewTypeId = reviewTypeId;
        this.type = type;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getReviewTypeId() {
        return reviewTypeId;
    }

    public void setReviewTypeId(Integer reviewTypeId) {
        this.reviewTypeId = reviewTypeId;
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