package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ReviewType {
    private Integer reviewTypeId;

    private String reviewType;

    private Long createTime;

    @Override
    public String toString() {
        return "ReviewType{" +
                "reviewTypeId=" + reviewTypeId +
                ", reviewType='" + reviewType + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ReviewType() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewType(Integer reviewTypeId, String reviewType) {
        this.reviewTypeId = reviewTypeId;
        this.reviewType = reviewType;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getReviewTypeId() {
        return reviewTypeId;
    }

    public void setReviewTypeId(Integer reviewTypeId) {
        this.reviewTypeId = reviewTypeId;
    }

    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType == null ? null : reviewType.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}