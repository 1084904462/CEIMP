package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class TripleInput {
    private Integer inputId;

    private String userId;

    private Integer pointId;

    private String evidence;

    private String addition;

    private Long createTime;

    @Override
    public String toString() {
        return "TripleInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", pointId=" + pointId +
                ", evidence='" + evidence + '\'' +
                ", addition='" + addition + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public TripleInput() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public TripleInput(Integer inputId, String userId, Integer pointId, String evidence, String addition) {
        this.inputId = inputId;
        this.userId = userId;
        this.pointId = pointId;
        this.evidence = evidence;
        this.addition = addition;
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

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition == null ? null : addition.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}