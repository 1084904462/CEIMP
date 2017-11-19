package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public class ShowScholarshipBean {
    private String scholarshipName;
    private String subName;
    private List<String> grade;
    private Integer yearScope;

    public ShowScholarshipBean() {
    }

    @Override
    public String toString() {
        return "ShowScholarshipBean{" +
                "scholarshipName='" + scholarshipName + '\'' +
                ", subName='" + subName + '\'' +
                ", grade='" + grade + '\'' +
                ", yearScope=" + yearScope +
                '}';
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public List<String> getGrade() {
        return grade;
    }

    public void setGrade(List<String> grade) {
        this.grade = grade;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }
}
