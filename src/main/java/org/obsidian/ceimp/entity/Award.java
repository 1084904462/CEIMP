package org.obsidian.ceimp.entity;

public class Award {
    private Long awardId;

    private Long userId;

    private Long scholarshipId;

    private Integer yearScope;

    public Long getAwardId() {
        return awardId;
    }

    public void setAwardId(Long awardId) {
        this.awardId = awardId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(Long scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }
}