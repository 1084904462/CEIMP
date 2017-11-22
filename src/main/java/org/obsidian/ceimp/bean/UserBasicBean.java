package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/20.
 */
public class UserBasicBean {
    private String school;
    private String major;
    private Integer majorSum;
    private String classNum;
    private String username;
    private String sex;
    private String birth;
    private String account;
    private String nation;
    private String entrance;
    private String political;
    private String phone;
    private String identity;
    private String job;

    @Override
    public String toString() {
        return "UserBasicBean{" +
                "school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", majorSum=" + majorSum +
                ", classNum='" + classNum + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", account='" + account + '\'' +
                ", nation='" + nation + '\'' +
                ", entrance='" + entrance + '\'' +
                ", political='" + political + '\'' +
                ", phone='" + phone + '\'' +
                ", identity='" + identity + '\'' +
                ", job='" + job + '\'' +
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
