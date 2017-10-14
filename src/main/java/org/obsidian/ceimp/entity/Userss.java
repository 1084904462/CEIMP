package org.obsidian.ceimp.entity;

public class Userss {
    private Integer id;

    private String userId;

    private String password;

    private String username;

    private String major;

    private String classId;

    private String majorSum;

    private String character;

    private String study;

    private String ability;

    private String all;

    private String gp;

    private String ce;

    private String sex;

    private String birth;

    private String nation;

    private String entrance;

    private String political;

    private String phone;

    private String identity;

    private String passSum;

    private String subSum;

    private String job;

    @Override
    public String toString() {
        return "Userss{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", major='" + major + '\'' +
                ", classId='" + classId + '\'' +
                ", majorSum='" + majorSum + '\'' +
                ", character='" + character + '\'' +
                ", study='" + study + '\'' +
                ", ability='" + ability + '\'' +
                ", all='" + all + '\'' +
                ", gp='" + gp + '\'' +
                ", ce='" + ce + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", nation='" + nation + '\'' +
                ", entrance='" + entrance + '\'' +
                ", political='" + political + '\'' +
                ", phone='" + phone + '\'' +
                ", identity='" + identity + '\'' +
                ", passSum='" + passSum + '\'' +
                ", subSum='" + subSum + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getMajorSum() {
        return majorSum;
    }

    public void setMajorSum(String majorSum) {
        this.majorSum = majorSum == null ? null : majorSum.trim();
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

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp == null ? null : gp.trim();
    }

    public String getCe() {
        return ce;
    }

    public void setCe(String ce) {
        this.ce = ce == null ? null : ce.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance == null ? null : entrance.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getPassSum() {
        return passSum;
    }

    public void setPassSum(String passSum) {
        this.passSum = passSum == null ? null : passSum.trim();
    }

    public String getSubSum() {
        return subSum;
    }

    public void setSubSum(String subSum) {
        this.subSum = subSum == null ? null : subSum.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }
}