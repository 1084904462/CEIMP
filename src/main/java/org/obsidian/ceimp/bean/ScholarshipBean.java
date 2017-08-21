package org.obsidian.ceimp.bean;

import org.obsidian.ceimp.entity.Scholarship;

import java.util.List;

/**
 * Created by BillChen on 2017/8/20.
 */
public class ScholarshipBean {
    private Scholarship scholarship;

    private List<ScholarshipBlockBean> scholarshipBlockBeanList;

    @Override
    public String toString() {
        return "ScholarshipBean{" +
                "scholarship=" + scholarship +
                ", scholarshipBlockBeanList=" + scholarshipBlockBeanList +
                '}';
    }

    public ScholarshipBean() {
    }

    public ScholarshipBean(Scholarship scholarship, List<ScholarshipBlockBean> scholarshipBlockBeanList) {
        this.scholarship = scholarship;
        this.scholarshipBlockBeanList = scholarshipBlockBeanList;
    }

    public Scholarship getScholarship() {
        return scholarship;
    }

    public void setScholarship(Scholarship scholarship) {
        this.scholarship = scholarship;
    }

    public List<ScholarshipBlockBean> getScholarshipBlockBeanList() {
        return scholarshipBlockBeanList;
    }

    public void setScholarshipBlockBeanList(List<ScholarshipBlockBean> scholarshipBlockBeanList) {
        this.scholarshipBlockBeanList = scholarshipBlockBeanList;
    }
}
