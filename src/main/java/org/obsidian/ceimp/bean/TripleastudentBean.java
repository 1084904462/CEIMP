package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/14.
 */
public class TripleastudentBean {
    private String classId;

    private String username;

    private String userId;

    private String sex;

    private String nation;

    private String political;

    private String job;

    private String character;

    private String study;

    private String ability;

    private String all;

    private String rank;

    private String reason;

    @Override
    public String toString() {
        return "TripleastudentBean{" +
                "classId='" + classId + '\'' +
                ", username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", political='" + political + '\'' +
                ", job='" + job + '\'' +
                ", character='" + character + '\'' +
                ", study='" + study + '\'' +
                ", ability='" + ability + '\'' +
                ", all='" + all + '\'' +
                ", rank='" + rank + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
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

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
