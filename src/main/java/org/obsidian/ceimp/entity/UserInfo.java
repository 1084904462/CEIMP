package org.obsidian.ceimp.entity;

public class UserInfo {
    private Long infoId;

    private Long userId;

    private Integer yearScope;

    private Long classNumId;

    private String political;

    private String phone;

    private String job;

    private String charact;

    private String study;

    private String ability;

    private String total;

    private String gp;

    private String ce;

    private String passSum;

    private String classSum;

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }

    public Long getClassNumId() {
        return classNumId;
    }

    public void setClassNumId(Long classNumId) {
        this.classNumId = classNumId;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getCharact() {
        return charact;
    }

    public void setCharact(String charact) {
        this.charact = charact == null ? null : charact.trim();
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
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

    public String getPassSum() {
        return passSum;
    }

    public void setPassSum(String passSum) {
        this.passSum = passSum == null ? null : passSum.trim();
    }

    public String getClassSum() {
        return classSum;
    }

    public void setClassSum(String classSum) {
        this.classSum = classSum == null ? null : classSum.trim();
    }
}