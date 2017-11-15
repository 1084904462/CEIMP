package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/14.
 */
public class AwardBean {
    private String awardName;
    private String subName;

    public AwardBean() {
    }

    public AwardBean(String awardName, String subName) {
        this.awardName = awardName;
        this.subName = subName;
    }

    @Override
    public String toString() {
        return "AwardBean{" +
                "awardName='" + awardName + '\'' +
                ", subName='" + subName + '\'' +
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
}
