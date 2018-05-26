package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/25.
 */
public class ExcelUserBean {
    private String schoolName;
    private String majorName;
    private String grade;
    private String classNum;
    private String account;
    private String username;
    private String sex;
    private String entrance;
    private String charact;
    private String study;
    private String ability;
    private String total;
    private String ceRank;
    private String gpRank;
    private String majorSum;

    public ExcelUserBean() {
    }

    public ExcelUserBean(String[] strings) {
        this.schoolName = strings[0];
        this.majorName = strings[1];
        this.grade = strings[2];
        this.classNum = strings[3];
        this.account = strings[4];
        this.username = strings[5];
        this.sex = strings[6];
        this.entrance = strings[7];
        this.charact = strings[8];
        this.study = strings[9];
        this.ability = strings[10];
        this.total = strings[11];
        this.ceRank = strings[12];
        this.gpRank = strings[13];
        this.majorSum = strings[14];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcelUserBean that = (ExcelUserBean) o;

        return account != null ? account.equals(that.account) : that.account == null;
    }

    @Override
    public int hashCode() {
        return account != null ? account.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ExcelUserBean{" +
                "schoolName='" + schoolName + '\'' +
                ", majorName='" + majorName + '\'' +
                ", grade='" + grade + '\'' +
                ", classNum='" + classNum + '\'' +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", entrance='" + entrance + '\'' +
                ", charact='" + charact + '\'' +
                ", study='" + study + '\'' +
                ", ability='" + ability + '\'' +
                ", total='" + total + '\'' +
                ", ceRank='" + ceRank + '\'' +
                ", gpRank='" + gpRank + '\'' +
                ", majorSum='" + majorSum + '\'' +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
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

    public String getCeRank() {
        return ceRank;
    }

    public void setCeRank(String ceRank) {
        this.ceRank = ceRank;
    }

    public String getGpRank() {
        return gpRank;
    }

    public void setGpRank(String gpRank) {
        this.gpRank = gpRank;
    }

    public String getMajorSum() {
        return majorSum;
    }

    public void setMajorSum(String majorSum) {
        this.majorSum = majorSum;
    }
}
