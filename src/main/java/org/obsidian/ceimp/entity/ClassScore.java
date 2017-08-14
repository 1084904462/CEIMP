package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ClassScore {
    private Integer classScoreId;

    private Integer classId;

    private String userId;

    private Double score;

    private Long createTime;

    @Override
    public String toString() {
        return "ClassScore{" +
                "classScoreId=" + classScoreId +
                ", classId=" + classId +
                ", userId='" + userId + '\'' +
                ", score=" + score +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ClassScore() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ClassScore(Integer classScoreId, Integer classId, String userId, Double score) {
        this.classScoreId = classScoreId;
        this.classId = classId;
        this.userId = userId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getClassScoreId() {
        return classScoreId;
    }

    public void setClassScoreId(Integer classScoreId) {
        this.classScoreId = classScoreId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}