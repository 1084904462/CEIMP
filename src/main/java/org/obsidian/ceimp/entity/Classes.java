package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Classes {
    private Integer classId;

    private String className;

    private Integer classNum;

    private Integer schoolId;

    private Long createTime;

    @Override
    public String toString() {
        return "Classes{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classNum=" + classNum +
                ", schoolId=" + schoolId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Classes() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Classes(String className, Integer classNum, Integer schoolId) {
        this.className = className;
        this.classNum = classNum;
        this.schoolId = schoolId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Classes(Integer classId, String className, Integer classNum, Integer schoolId) {
        this.classId = classId;
        this.className = className;
        this.classNum = classNum;
        this.schoolId = schoolId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
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