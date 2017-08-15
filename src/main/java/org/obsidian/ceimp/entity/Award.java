package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Award {
    private Integer awardId;

    private String userId;

    private Integer scholarshipId;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "Award{" +
                "awardId=" + awardId +
                ", userId='" + userId + '\'' +
                ", scholarshipId=" + scholarshipId +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Award() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Award(String userId, Integer scholarshipId) {
        this.userId = userId;
        this.scholarshipId = scholarshipId;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Award(Integer awardId, String userId, Integer scholarshipId) {
        this.awardId = awardId;
        this.userId = userId;
        this.scholarshipId = scholarshipId;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getAwardId() {
        return awardId;
    }

    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(Integer scholarshipId) {
        this.scholarshipId = scholarshipId;
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