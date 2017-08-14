package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class EvaluationClass {
    private Integer classId;

    private String className;

    private Integer formId;

    private String content;

    private Double weight;

    private Long createTime;

    @Override
    public String toString() {
        return "EvaluationClass{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", formId=" + formId +
                ", content='" + content + '\'' +
                ", weight=" + weight +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public EvaluationClass() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public EvaluationClass(Integer classId, String className, Integer formId, String content, Double weight) {
        this.classId = classId;
        this.className = className;
        this.formId = formId;
        this.content = content;
        this.weight = weight;
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

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}