package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class EvaluationForm {
    private Integer formId;

    private String formName;

    private String content;

    private String publishingUnit;

    private Integer schoolId;

    private Long createTime;

    @Override
    public String toString() {
        return "EvaluationForm{" +
                "formId=" + formId +
                ", formName='" + formName + '\'' +
                ", content='" + content + '\'' +
                ", publishingUnit='" + publishingUnit + '\'' +
                ", schoolId=" + schoolId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public EvaluationForm() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public EvaluationForm(Integer formId, String formName, String content, String publishingUnit, Integer schoolId) {
        this.formId = formId;
        this.formName = formName;
        this.content = content;
        this.publishingUnit = publishingUnit;
        this.schoolId = schoolId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName == null ? null : formName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPublishingUnit() {
        return publishingUnit;
    }

    public void setPublishingUnit(String publishingUnit) {
        this.publishingUnit = publishingUnit == null ? null : publishingUnit.trim();
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