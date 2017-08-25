package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class InnovationRequire {
    private Integer requireId;

    private String require;

    private Integer innovationId;

    private Long createTime;

    @Override
    public String toString() {
        return "InnovationRequire{" +
                "requireId=" + requireId +
                ", require='" + require + '\'' +
                ", innovationId=" + innovationId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public InnovationRequire() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationRequire(String require, Integer innovationId) {
        this.require = require;
        this.innovationId = innovationId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationRequire(Integer requireId, String require, Integer innovationId) {
        this.requireId = requireId;
        this.require = require;
        this.innovationId = innovationId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getRequireId() {
        return requireId;
    }

    public void setRequireId(Integer requireId) {
        this.requireId = requireId;
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require == null ? null : require.trim();
    }

    public Integer getInnovationId() {
        return innovationId;
    }

    public void setInnovationId(Integer innovationId) {
        this.innovationId = innovationId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}