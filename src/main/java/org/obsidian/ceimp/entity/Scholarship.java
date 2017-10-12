package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Scholarship {
    private Integer scholarshipId;

    private String scholarshipName;

    private String modelName;

    private Long createTime;

    @Override
    public String toString() {
        return "Scholarship{" +
                "scholarshipId=" + scholarshipId +
                ", scholarshipName='" + scholarshipName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Scholarship() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Scholarship(String scholarshipName, String modelName) {
        this.scholarshipName = scholarshipName;
        this.modelName = modelName;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Scholarship(Integer scholarshipId, String scholarshipName, String modelName) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
        this.modelName = modelName;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(Integer scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName == null ? null : scholarshipName.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}