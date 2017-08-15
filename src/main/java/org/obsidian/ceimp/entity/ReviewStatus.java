package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ReviewStatus {
    private Integer reviewStatusId;

    private String userId;

    private Integer status;

    private Integer reviewTypeId;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "ReviewStatus{" +
                "reviewStatusId=" + reviewStatusId +
                ", userId='" + userId + '\'' +
                ", status=" + status +
                ", reviewTypeId=" + reviewTypeId +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ReviewStatus() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewStatus(String userId, Integer status, Integer reviewTypeId) {
        this.userId = userId;
        this.status = status;
        this.reviewTypeId = reviewTypeId;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewStatus(Integer reviewStatusId, String userId, Integer status, Integer reviewTypeId) {
        this.reviewStatusId = reviewStatusId;
        this.userId = userId;
        this.status = status;
        this.reviewTypeId = reviewTypeId;
        this.yearScope = TimeUtil.getInstance().getThisYear();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getReviewTypeId() {
        return reviewTypeId;
    }

    public void setReviewTypeId(Integer reviewTypeId) {
        this.reviewTypeId = reviewTypeId;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}