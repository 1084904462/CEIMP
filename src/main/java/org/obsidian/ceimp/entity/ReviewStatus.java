package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ReviewStatus {
    private Integer reviewStatusId;

    private String userId;

    private Integer reviewStatus;

    private Integer reviewTypeId;

    private Long createTime;

    @Override
    public String toString() {
        return "ReviewStatus{" +
                "reviewStatusId=" + reviewStatusId +
                ", userId='" + userId + '\'' +
                ", reviewStatus=" + reviewStatus +
                ", reviewTypeId=" + reviewTypeId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ReviewStatus() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewStatus(Integer reviewStatusId, String userId, Integer reviewStatus, Integer reviewTypeId) {
        this.reviewStatusId = reviewStatusId;
        this.userId = userId;
        this.reviewStatus = reviewStatus;
        this.reviewTypeId = reviewTypeId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getReviewStatusId() {
        return reviewStatusId;
    }

    public void setReviewStatusId(Integer reviewStatusId) {
        this.reviewStatusId = reviewStatusId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Integer getReviewTypeId() {
        return reviewTypeId;
    }

    public void setReviewTypeId(Integer reviewTypeId) {
        this.reviewTypeId = reviewTypeId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}