package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public class ScholarshipBeanList {
    private int sum;

    private List<ScholarshipBean> scholarshipBeans;

    @Override
    public String toString() {
        return "ScholarshipBeanList{" +
                "sum=" + sum +
                ", scholarshipBeans=" + scholarshipBeans +
                '}';
    }

    public ScholarshipBeanList() {
    }

    public ScholarshipBeanList(int sum, List<ScholarshipBean> scholarshipBeans) {
        this.sum = sum;
        this.scholarshipBeans = scholarshipBeans;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public List<ScholarshipBean> getScholarshipBeans() {
        return scholarshipBeans;
    }

    public void setScholarshipBeans(List<ScholarshipBean> scholarshipBeans) {
        this.scholarshipBeans = scholarshipBeans;
    }
}
