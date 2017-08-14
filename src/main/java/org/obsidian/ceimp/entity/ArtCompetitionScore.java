package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ArtCompetitionScore {
    private Integer scoreId;

    private Integer competitionLevelId;

    private Integer awardLevelId;

    private Integer score;

    private Long createTime;

    @Override
    public String toString() {
        return "ArtCompetitionScore{" +
                "scoreId=" + scoreId +
                ", competitionLevelId=" + competitionLevelId +
                ", awardLevelId=" + awardLevelId +
                ", score=" + score +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ArtCompetitionScore() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ArtCompetitionScore(Integer scoreId, Integer competitionLevelId, Integer awardLevelId, Integer score) {
        this.scoreId = scoreId;
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