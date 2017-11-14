package org.obsidian.ceimp.entity;

public class Tas {
    private Long tasId;

    private Long userId;

    private Integer yearScope;

    private String reason;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}