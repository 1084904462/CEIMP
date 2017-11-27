package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/19.
 */
public class UserInfoBean {
    private String school;
    private String major;
    private Integer majorSum;
    private String classNum;
    private String political;
    private String phone;
    private String job;
    private String charact;
    private String study;
    private String ability;
    private String total;
    private String gpRank;
    private String ceRank;
    private String passSum;
    private String classSum;

    @Override
    public String toString() {
        return "UserInfoBean{" +
                "school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", majorSum=" + majorSum +
                ", classNum='" + classNum + '\'' +
                ", political='" + political + '\'' +
                ", phone='" + phone + '\'' +
                ", job='" + job + '\'' +
                ", charact='" + charact + '\'' +
                ", study='" + study + '\'' +
                ", ability='" + ability + '\'' +
                ", total='" + total + '\'' +
                ", gpRank='" + gpRank + '\'' +
                ", ceRank='" + ceRank + '\'' +
                ", passSum='" + passSum + '\'' +
                ", classSum='" + classSum + '\'' +
                '}';
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getMajorSum() {
        return majorSum;
    }

    public void setMajorSum(Integer majorSum) {
        this.majorSum = majorSum;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCharact() {
        return charact;
    }

    public void setCharact(String charact) {
        this.charact = charact;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getGpRank() {
        return gpRank;
    }

    public void setGpRank(String gpRank) {
        this.gpRank = gpRank;
    }

    public String getCeRank() {
        return ceRank;
    }

    public void setCeRank(String ceRank) {
        this.ceRank = ceRank;
    }

    public String getPassSum() {
        return passSum;
    }

    public void setPassSum(String passSum) {
        this.passSum = passSum;
    }

    public String getClassSum() {
        return classSum;
    }

    public void setClassSum(String classSum) {
        this.classSum = classSum;
    }
}
