package org.obsidian.ceimp.entity;

public class Tripleastudent {
    private Integer id;

    private String classid;

    private String username;

    private String userid;

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
        return "Tripleastudent{" +
                "id=" + id +
                ", classid='" + classid + '\'' +
                ", username='" + username + '\'' +
                ", userid='" + userid + '\'' +
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study == null ? null : study.trim();
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability == null ? null : ability.trim();
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all == null ? null : all.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}