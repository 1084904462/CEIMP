package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionScore {
    private Integer scoreId;

    private Integer competitionLevelId;

    private Integer awardLevelId;

    private Integer competitionTypeId;

    private Double score;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionScore{" +
                "scoreId=" + scoreId +
                ", competitionLevelId=" + competitionLevelId +
                ", awardLevelId=" + awardLevelId +
                ", competitionTypeId=" + competitionTypeId +
                ", score=" + score +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionScore() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionScore(Integer competitionLevelId, Integer awardLevelId, Integer competitionTypeId, Double score) {
        this.competitionLevelId = competitionLevelId;
        this.awardLevelId = awardLevelId;
        this.competitionTypeId = competitionTypeId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionScore(Integer scoreId, Integer competitionLevelId, Integer awardLevelId, Integer competitionTypeId, Double score) {
        this.scoreId = scoreId;
        this.competitionLevelId = competitionLevelId;
        this.awardLevelId = awardLevelId;
        this.competitionTypeId = competitionTypeId;
        this.score = score;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
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

    public Integer getCompetitionTypeId() {
        return competitionTypeId;
    }

    public void setCompetitionTypeId(Integer competitionTypeId) {
        this.competitionTypeId = competitionTypeId;
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