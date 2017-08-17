package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class PointScore {
    private Integer pointScoreId;

    private String userId;

    private Integer pointId;

    private Double score;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "PointScore{" +
                "pointScoreId=" + pointScoreId +
                ", userId='" + userId + '\'' +
                ", pointId=" + pointId +
                ", score=" + score +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public PointScore() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public PointScore(String userId, Integer pointId, Double score) {
        this.userId = userId;
        this.pointId = pointId;
        this.score = score;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public PointScore(Integer pointScoreId, String userId, Integer pointId, Double score) {
        this.pointScoreId = pointScoreId;
        this.userId = userId;
        this.pointId = pointId;
        this.score = score;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getPointScoreId() {
        return pointScoreId;
    }

    public void setPointScoreId(Integer pointScoreId) {
        this.pointScoreId = pointScoreId;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
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