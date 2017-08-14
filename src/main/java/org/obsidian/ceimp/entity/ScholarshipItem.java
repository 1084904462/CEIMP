package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ScholarshipItem {
    private Integer scholarshipItemId;

    private String scholarshipItemName;

    private Integer scholarshipBlockId;

    private Integer fillInTypeId;

    private String fillInHint;

    private Long createTime;

    @Override
    public String toString() {
        return "ScholarshipItem{" +
                "scholarshipItemId=" + scholarshipItemId +
                ", scholarshipItemName='" + scholarshipItemName + '\'' +
                ", scholarshipBlockId=" + scholarshipBlockId +
                ", fillInTypeId=" + fillInTypeId +
                ", fillInHint='" + fillInHint + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ScholarshipItem() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ScholarshipItem(Integer scholarshipItemId, String scholarshipItemName, Integer scholarshipBlockId, Integer fillInTypeId, String fillInHint) {
        this.scholarshipItemId = scholarshipItemId;
        this.scholarshipItemName = scholarshipItemName;
        this.scholarshipBlockId = scholarshipBlockId;
        this.fillInTypeId = fillInTypeId;
        this.fillInHint = fillInHint;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getScholarshipItemId() {
        return scholarshipItemId;
    }

    public void setScholarshipItemId(Integer scholarshipItemId) {
        this.scholarshipItemId = scholarshipItemId;
    }

    public String getScholarshipItemName() {
        return scholarshipItemName;
    }

    public void setScholarshipItemName(String scholarshipItemName) {
        this.scholarshipItemName = scholarshipItemName == null ? null : scholarshipItemName.trim();
    }

    public Integer getScholarshipBlockId() {
        return scholarshipBlockId;
    }

    public void setScholarshipBlockId(Integer scholarshipBlockId) {
        this.scholarshipBlockId = scholarshipBlockId;
    }

    public Integer getFillInTypeId() {
        return fillInTypeId;
    }

    public void setFillInTypeId(Integer fillInTypeId) {
        this.fillInTypeId = fillInTypeId;
    }

    public String getFillInHint() {
        return fillInHint;
    }

    public void setFillInHint(String fillInHint) {
        this.fillInHint = fillInHint == null ? null : fillInHint.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}