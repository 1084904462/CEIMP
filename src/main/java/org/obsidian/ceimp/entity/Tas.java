package org.obsidian.ceimp.entity;

public class Tas {
    private Long tasId;

    private Long userId;

    private Integer yearScope;

    private String applyReason;

    public Long getTasId() {
        return tasId;
    }

    public void setTasId(Long tasId) {
        this.tasId = tasId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }
}