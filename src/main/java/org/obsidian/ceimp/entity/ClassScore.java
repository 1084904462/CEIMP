package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ClassScore {
    private Integer classScoreId;

    private String userId;

    private Integer classId;

    private Double score;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "ClassScore{" +
                "classScoreId=" + classScoreId +
                ", userId='" + userId + '\'' +
                ", classId=" + classId +
                ", score=" + score +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ClassScore() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ClassScore(String userId, Integer classId, Double score) {
        this.userId = userId;
        this.classId = classId;
        this.score = score;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ClassScore(Integer classScoreId, String userId, Integer classId, Double score) {
        this.classScoreId = classScoreId;
        this.userId = userId;
        this.classId = classId;
        this.score = score;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getClassScoreId() {
        return classScoreId;
    }

    public void setClassScoreId(Integer classScoreId) {
        this.classScoreId = classScoreId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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