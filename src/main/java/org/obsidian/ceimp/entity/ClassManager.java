package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ClassManager {
    private String classManagerId;

    private String password;

    private Integer classId;

    private Long createTime;

    @Override
    public String toString() {
        return "ClassManager{" +
                "classManagerId='" + classManagerId + '\'' +
                ", password='" + password + '\'' +
                ", classId=" + classId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ClassManager() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ClassManager(String classManagerId, String password, Integer classId) {
        this.classManagerId = classManagerId;
        this.password = password;
        this.classId = classId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public String getClassManagerId() {
        return classManagerId;
    }

    public void setClassManagerId(String classManagerId) {
        this.classManagerId = classManagerId == null ? null : classManagerId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}