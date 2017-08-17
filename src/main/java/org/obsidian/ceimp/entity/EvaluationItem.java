package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class EvaluationItem {
    private Integer itemId;

    private String itemName;

    private Integer classId;

    private Double maxScore;

    private Long createTime;

    @Override
    public String toString() {
        return "EvaluationItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", classId=" + classId +
                ", maxScore=" + maxScore +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public EvaluationItem() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public EvaluationItem(String itemName, Integer classId, Double maxScore) {
        this.itemName = itemName;
        this.classId = classId;
        this.maxScore = maxScore;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public EvaluationItem(Integer itemId, String itemName, Integer classId, Double maxScore) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.classId = classId;
        this.maxScore = maxScore;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}