package org.obsidian.ceimp.entity;

public class Opinion {
    private Long opinionId;

    private String grade;

    private Long schoolId;

    private Integer yearScope;

    private String nisOpinion;

    private String pgsRecommend;

    private String pgsOpinion;

    private String ssOpinion;

    private String tasOpinion;

    @Override
    public String toString() {
        return "Opinion{" +
                "opinionId=" + opinionId +
                ", grade='" + grade + '\'' +
                ", schoolId=" + schoolId +
                ", yearScope=" + yearScope +
                ", nisOpinion='" + nisOpinion + '\'' +
                ", pgsRecommend='" + pgsRecommend + '\'' +
                ", pgsOpinion='" + pgsOpinion + '\'' +
                ", ssOpinion='" + ssOpinion + '\'' +
                ", tasOpinion='" + tasOpinion + '\'' +
                '}';
    }

    public Long getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(Long opinionId) {
        this.opinionId = opinionId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }

    public String getNisOpinion() {
        return nisOpinion;
    }

    public void setNisOpinion(String nisOpinion) {
        this.nisOpinion = nisOpinion == null ? null : nisOpinion.trim();
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