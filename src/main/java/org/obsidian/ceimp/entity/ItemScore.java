package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ItemScore {
    private Integer itemScoreId;

    private String userId;

    private Integer itemId;

    private Double score;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "ItemScore{" +
                "itemScoreId=" + itemScoreId +
                ", userId='" + userId + '\'' +
                ", itemId=" + itemId +
                ", score=" + score +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ItemScore() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ItemScore(String userId, Integer itemId, Double score) {
        this.userId = userId;
        this.itemId = itemId;
        this.score = score;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ItemScore(Integer itemScoreId, String userId, Integer itemId, Double score) {
        this.itemScoreId = itemScoreId;
        this.userId = userId;
        this.itemId = itemId;
        this.score = score;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getItemScoreId() {
        return itemScoreId;
    }

    public void setItemScoreId(Integer itemScoreId) {
        this.itemScoreId = itemScoreId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
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