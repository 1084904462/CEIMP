package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/18.
 */
public class ScholarshipFormBean {
    private String major;
    private String classNum;
    private String account;
    private String username;
    private String scholarshipName;

    @Override
    public String toString() {
        return "ScholarshipFormBean{" +
                "major='" + major + '\'' +
                ", classNum='" + classNum + '\'' +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", scholarshipName='" + scholarshipName + '\'' +
                '}';
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }
}
