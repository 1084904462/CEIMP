package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class PointScore {
    private Integer pointScoreId;

    private Integer pointId;

    private String userId;

    private Integer score;

    private Long createTime;

    @Override
    public String toString() {
        return "PointScore{" +
                "pointScoreId=" + pointScoreId +
                ", pointId=" + pointId +
                ", userId='" + userId + '\'' +
                ", score=" + score +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public PointScore() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public PointScore(Integer pointScoreId, Integer pointId, String userId, Integer score) {
        this.pointScoreId = pointScoreId;
        this.pointId = pointId;
        this.userId = userId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getPointScoreId() {
        return pointScoreId;
    }

    public void setPointScoreId(Integer pointScoreId) {
        this.pointScoreId = pointScoreId;
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}