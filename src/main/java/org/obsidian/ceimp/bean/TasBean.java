package org.obsidian.ceimp.bean;

/**
 * Created by Administrator on 2017/11/20.
 */
public class TasBean {

    private Integer ts;

    private Integer te;

    private String major;

    private String classNum;

    private String username;

    private String sex;

    private String account;

    private String nation;

    private String political;

    private String job;

    private String charact;

    private String study;

    private String ability;

    private String total;

    private String ceRank;

    private String majorSum;

    private String reason;

    private String opinion;

    @Override
    public String toString() {
        return "TasBean{" +
                "ts=" + ts +
                ", te=" + te +
                ", major='" + major + '\'' +
                ", classNum='" + classNum + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", account='" + account + '\'' +
                ", nation='" + nation + '\'' +
                ", political='" + political + '\'' +
                ", job='" + job + '\'' +
                ", charact='" + charact + '\'' +
                ", study='" + study + '\'' +
                ", ability='" + ability + '\'' +
                ", total='" + total + '\'' +
                ", ceRank='" + ceRank + '\'' +
                ", majorSum='" + majorSum + '\'' +
                ", reason='" + reason + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    public Integer getTe() {
        return te;
    }

    public void setTe(Integer te) {
        this.te = te;
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

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
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

    public String getCeRank() {
        return ceRank;
    }

    public void setCeRank(String ceRank) {
        this.ceRank = ceRank;
    }

    public String getMajorSum() {
        return majorSum;
    }

    public void setMajorSum(String majorSum) {
        this.majorSum = majorSum;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
