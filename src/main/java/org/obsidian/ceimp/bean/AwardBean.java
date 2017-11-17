package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/14.
 */
public class AwardBean {
    private String awardName;
    private String subName;
    private Integer isFilled;
    private Integer userId;

    @Override
    public String toString() {
        return "AwardBean{" +
                "awardName='" + awardName + '\'' +
                ", subName='" + subName + '\'' +
                ", isFilled=" + isFilled +
                ", userId=" + userId +
                '}';
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Integer getIsFilled() {
        return isFilled;
    }

    public void setIsFilled(Integer isFilled) {
        this.isFilled = isFilled;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
