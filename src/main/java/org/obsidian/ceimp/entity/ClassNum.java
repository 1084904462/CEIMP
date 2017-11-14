package org.obsidian.ceimp.entity;

public class ClassNum {
    private Long classNumId;

    private String num;

    private Long majorId;

    public Long getClassNumId() {
        return classNumId;
    }

    public void setClassNumId(Long classNumId) {
        this.classNumId = classNumId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }
}