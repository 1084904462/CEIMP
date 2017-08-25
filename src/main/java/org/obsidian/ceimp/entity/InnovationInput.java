package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class InnovationInput {
    private Integer inputId;

    private String userId;

    private Integer innovationId;

    private String content;

    private Integer levelId;

    private Integer requireId;

    private String evidence;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "InnovationInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", innovationId=" + innovationId +
                ", content='" + content + '\'' +
                ", levelId=" + levelId +
                ", requireId=" + requireId +
                ", evidence='" + evidence + '\'' +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public InnovationInput() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationInput(String userId, Integer innovationId, String content, Integer levelId, Integer requireId, String evidence) {
        this.userId = userId;
        this.innovationId = innovationId;
        this.content = content;
        this.levelId = levelId;
        this.requireId = requireId;
        this.evidence = evidence;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationInput(Integer inputId, String userId, Integer innovationId, String content, Integer levelId, Integer requireId, String evidence) {
        this.inputId = inputId;
        this.userId = userId;
        this.innovationId = innovationId;
        this.content = content;
        this.levelId = levelId;
        this.requireId = requireId;
        this.evidence = evidence;
        this.yearScope = TimeUtil.getInstance().getThisYear();
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

    public Integer getInnovationId() {
        return innovationId;
    }

    public void setInnovationId(Integer innovationId) {
        this.innovationId = innovationId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getRequireId() {
        return requireId;
    }

    public void setRequireId(Integer requireId) {
        this.requireId = requireId;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
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