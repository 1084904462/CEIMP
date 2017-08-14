package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ScholarshipBlock {
    private Integer scholarshipBlockId;

    private String scholarshipBlockName;

    private Integer scholarshipId;

    private Long createTime;

    @Override
    public String toString() {
        return "ScholarshipBlock{" +
                "scholarshipBlockId=" + scholarshipBlockId +
                ", scholarshipBlockName='" + scholarshipBlockName + '\'' +
                ", scholarshipId=" + scholarshipId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ScholarshipBlock() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ScholarshipBlock(String scholarshipBlockName, Integer scholarshipId) {
        this.scholarshipBlockName = scholarshipBlockName;
        this.scholarshipId = scholarshipId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ScholarshipBlock(Integer scholarshipBlockId, String scholarshipBlockName, Integer scholarshipId) {
        this.scholarshipBlockId = scholarshipBlockId;
        this.scholarshipBlockName = scholarshipBlockName;
        this.scholarshipId = scholarshipId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getScholarshipBlockId() {
        return scholarshipBlockId;
    }

    public void setScholarshipBlockId(Integer scholarshipBlockId) {
        this.scholarshipBlockId = scholarshipBlockId;
    }

    public String getScholarshipBlockName() {
        return scholarshipBlockName;
    }

    public void setScholarshipBlockName(String scholarshipBlockName) {
        this.scholarshipBlockName = scholarshipBlockName == null ? null : scholarshipBlockName.trim();
    }

    public Integer getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(Integer scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}