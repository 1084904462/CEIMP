package org.obsidian.ceimp.entity;

public class Opinion {
    private Long opinionId;

    private Long managerId;

    private Integer yearScope;

    private String ngOpinion;

    private String pgsRecommend;

    private String pgsOpinion;

    private String ssOpinion;

    private String tasOpinion;

    public Long getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(Long opinionId) {
        this.opinionId = opinionId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }

    public String getNgOpinion() {
        return ngOpinion;
    }

    public void setNgOpinion(String ngOpinion) {
        this.ngOpinion = ngOpinion == null ? null : ngOpinion.trim();
    }

    public String getPgsRecommend() {
        return pgsRecommend;
    }

    public void setPgsRecommend(String pgsRecommend) {
        this.pgsRecommend = pgsRecommend == null ? null : pgsRecommend.trim();
    }

    public String getPgsOpinion() {
        return pgsOpinion;
    }

    public void setPgsOpinion(String pgsOpinion) {
        this.pgsOpinion = pgsOpinion == null ? null : pgsOpinion.trim();
    }

    public String getSsOpinion() {
        return ssOpinion;
    }

    public void setSsOpinion(String ssOpinion) {
        this.ssOpinion = ssOpinion == null ? null : ssOpinion.trim();
    }

    public String getTasOpinion() {
        return tasOpinion;
    }

    public void setTasOpinion(String tasOpinion) {
        this.tasOpinion = tasOpinion == null ? null : tasOpinion.trim();
    }
}