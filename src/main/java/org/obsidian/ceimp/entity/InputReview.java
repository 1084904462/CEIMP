package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class InputReview {
    private Integer reviewId;

    private Integer inputId;

    private Integer inputType;

    private Integer reviewStatus;

    private Long createTime;

    @Override
    public String toString() {
        return "InputReview{" +
                "reviewId=" + reviewId +
                ", inputId=" + inputId +
                ", inputType=" + inputType +
                ", reviewStatus=" + reviewStatus +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public InputReview() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InputReview(Integer inputId, Integer inputType, Integer reviewStatus) {
        this.inputId = inputId;
        this.inputType = inputType;
        this.reviewStatus = reviewStatus;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InputReview(Integer reviewId, Integer inputId, Integer inputType, Integer reviewStatus) {
        this.reviewId = reviewId;
        this.inputId = inputId;
        this.inputType = inputType;
        this.reviewStatus = reviewStatus;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getInputId() {
        return inputId;
    }

    public void setInputId(Integer inputId) {
        this.inputId = inputId;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}