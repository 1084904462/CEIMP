package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class SchoolManager {
    private String schoolManagerId;

    private String password;

    private Integer schoolId;

    private Long createTime;

    @Override
    public String toString() {
        return "SchoolManager{" +
                "schoolManagerId='" + schoolManagerId + '\'' +
                ", password='" + password + '\'' +
                ", schoolId=" + schoolId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public SchoolManager() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public SchoolManager(String schoolManagerId, String password, Integer schoolId) {
        this.schoolManagerId = schoolManagerId;
        this.password = password;
        this.schoolId = schoolId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public String getSchoolManagerId() {
        return schoolManagerId;
    }

    public void setSchoolManagerId(String schoolManagerId) {
        this.schoolManagerId = schoolManagerId == null ? null : schoolManagerId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}