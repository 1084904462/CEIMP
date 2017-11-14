package org.obsidian.ceimp.entity;

public class UserInfo {
    private Long infoId;

    private Long userId;

    private Integer yearScope;

    private String character;

    private String study;

    private String ability;

    private String all;

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