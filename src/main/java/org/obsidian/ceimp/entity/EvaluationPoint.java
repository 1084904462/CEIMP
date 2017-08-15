package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class EvaluationPoint {
    private Integer pointId;

    private String content;

    private String remark;

    private Integer score;

    private Integer itemId;

    private Integer calculateType;

    private Integer inputType;

    private Long createTime;

    @Override
    public String toString() {
        return "EvaluationPoint{" +
                "pointId=" + pointId +
                ", content='" + content + '\'' +
                ", remark='" + remark + '\'' +
                ", score=" + score +
                ", itemId=" + itemId +
                ", calculateType=" + calculateType +
                ", inputType=" + inputType +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public EvaluationPoint() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public EvaluationPoint(String content, String remark, Integer score, Integer itemId, Integer calculateType, Integer inputType) {
        this.content = content;
        this.remark = remark;
        this.score = score;
        this.itemId = itemId;
        this.calculateType = calculateType;
        this.inputType = inputType;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public EvaluationPoint(Integer pointId, String content, String remark, Integer score, Integer itemId, Integer calculateType, Integer inputType) {
        this.pointId = pointId;
        this.content = content;
        this.remark = remark;
        this.score = score;
        this.itemId = itemId;
        this.calculateType = calculateType;
        this.inputType = inputType;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCalculateType() {
        return calculateType;
    }

    public void setCalculateType(Integer calculateType) {
        this.calculateType = calculateType;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}