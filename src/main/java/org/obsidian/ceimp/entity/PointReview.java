package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class PointReview {
    private Integer reviewId;

    private String userId;

    private Integer pointId;

    private Integer reviewStatus;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "PointReview{" +
                "reviewId=" + reviewId +
                ", userId='" + userId + '\'' +
                ", pointId=" + pointId +
                ", reviewStatus=" + reviewStatus +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public PointReview() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public PointReview(String userId, Integer pointId, Integer reviewStatus) {
        this.userId = userId;
        this.pointId = pointId;
        this.reviewStatus = reviewStatus;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public PointReview(Integer reviewId, String userId, Integer pointId, Integer reviewStatus) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.pointId = pointId;
        this.reviewStatus = reviewStatus;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
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