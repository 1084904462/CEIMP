package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class SingleInput {
    private Integer inputId;

    private String userId;

    private Integer pointId;

    private Long createTime;

    @Override
    public String toString() {
        return "SingleInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", pointId=" + pointId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public SingleInput() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public SingleInput(Integer inputId, String userId, Integer pointId) {
        this.inputId = inputId;
        this.userId = userId;
        this.pointId = pointId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getInputId() {
        return inputId;
    }

    public void setInputId(Integer inputId) {
        this.inputId = inputId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}