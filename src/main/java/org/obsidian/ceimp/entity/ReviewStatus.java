package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ReviewStatus {
    private Integer statusId;

    private String userId;

    private Integer reviewTypeId;

    private Integer status;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "ReviewStatus{" +
                "statusId=" + statusId +
                ", userId='" + userId + '\'' +
                ", reviewTypeId=" + reviewTypeId +
                ", status=" + status +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ReviewStatus() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewStatus(String userId, Integer reviewTypeId, Integer status) {
        this.userId = userId;
        this.reviewTypeId = reviewTypeId;
        this.status = status;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewStatus(Integer statusId, String userId, Integer reviewTypeId, Integer status) {
        this.statusId = statusId;
        this.userId = userId;
        this.reviewTypeId = reviewTypeId;
        this.status = status;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getReviewTypeId() {
        return reviewTypeId;
    }

    public void setReviewTypeId(Integer reviewTypeId) {
        this.reviewTypeId = reviewTypeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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