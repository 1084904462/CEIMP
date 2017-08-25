package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionGroup {
    private Integer rankId;

    private String rank;

    private Double percent;

    private Integer schoolId;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionGroup{" +
                "rankId=" + rankId +
                ", rank='" + rank + '\'' +
                ", percent=" + percent +
                ", schoolId=" + schoolId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionGroup() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionGroup(String rank, Double percent, Integer schoolId) {
        this.rank = rank;
        this.percent = percent;
        this.schoolId = schoolId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionGroup(Integer rankId, String rank, Double percent, Integer schoolId) {
        this.rankId = rankId;
        this.rank = rank;
        this.percent = percent;
        this.schoolId = schoolId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}