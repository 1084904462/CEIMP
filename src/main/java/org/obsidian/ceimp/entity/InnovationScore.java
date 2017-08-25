package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class InnovationScore {
    private Integer scoreId;

    private Integer levelId;

    private Integer requireId;

    private Double score;

    private Long createTime;

    @Override
    public String toString() {
        return "InnovationScore{" +
                "scoreId=" + scoreId +
                ", levelId=" + levelId +
                ", requireId=" + requireId +
                ", score=" + score +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public InnovationScore() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationScore(Integer levelId, Integer requireId, Double score) {
        this.levelId = levelId;
        this.requireId = requireId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationScore(Integer scoreId, Integer levelId, Integer requireId, Double score) {
        this.scoreId = scoreId;
        this.levelId = levelId;
        this.requireId = requireId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getRequireId() {
        return requireId;
    }

    public void setRequireId(Integer requireId) {
        this.requireId = requireId;
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