package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class School {
    private Integer schoolId;

    private String schoolName;

    private Long createTime;

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public School() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public School(Integer schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}