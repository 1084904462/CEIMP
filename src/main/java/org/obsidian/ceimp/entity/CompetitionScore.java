package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionScore {
    private Integer scoreId;

    private Integer type;

    private Integer competitionLevelId;

    private Integer awardLevelId;

    private Double score;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionScore{" +
                "scoreId=" + scoreId +
                ", type=" + type +
                ", competitionLevelId=" + competitionLevelId +
                ", awardLevelId=" + awardLevelId +
                ", score=" + score +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionScore() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionScore(Integer type, Integer competitionLevelId, Integer awardLevelId, Double score) {
        this.type = type;
        this.competitionLevelId = competitionLevelId;
        this.awardLevelId = awardLevelId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionScore(Integer scoreId, Integer type, Integer competitionLevelId, Integer awardLevelId, Double score) {
        this.scoreId = scoreId;
        this.type = type;
        this.competitionLevelId = competitionLevelId;
        this.awardLevelId = awardLevelId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCompetitionLevelId() {
        return competitionLevelId;
    }

    public void setCompetitionLevelId(Integer competitionLevelId) {
        this.competitionLevelId = competitionLevelId;
    }

    public Integer getAwardLevelId() {
        return awardLevelId;
    }

    public void setAwardLevelId(Integer awardLevelId) {
        this.awardLevelId = awardLevelId;
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