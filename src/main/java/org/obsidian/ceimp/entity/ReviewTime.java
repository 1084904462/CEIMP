package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ReviewTime {
    private Integer reviewTimeId;

    private Long reviewStart;

    private Long reviewEnd;

    private Integer reviewTypeId;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "ReviewTime{" +
                "reviewTimeId=" + reviewTimeId +
                ", reviewStart=" + reviewStart +
                ", reviewEnd=" + reviewEnd +
                ", reviewTypeId=" + reviewTypeId +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ReviewTime() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewTime(Long reviewStart, Long reviewEnd, Integer reviewTypeId) {
        this.reviewStart = reviewStart;
        this.reviewEnd = reviewEnd;
        this.reviewTypeId = reviewTypeId;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ReviewTime(Integer reviewTimeId, Long reviewStart, Long reviewEnd, Integer reviewTypeId) {
        this.reviewTimeId = reviewTimeId;
        this.reviewStart = reviewStart;
        this.reviewEnd = reviewEnd;
        this.reviewTypeId = reviewTypeId;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getReviewTimeId() {
        return reviewTimeId;
    }

    public void setReviewTimeId(Integer reviewTimeId) {
        this.reviewTimeId = reviewTimeId;
    }

    public Long getReviewStart() {
        return reviewStart;
    }

    public void setReviewStart(Long reviewStart) {
        this.reviewStart = reviewStart;
    }

    public Long getReviewEnd() {
        return reviewEnd;
    }

    public void setReviewEnd(Long reviewEnd) {
        this.reviewEnd = reviewEnd;
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