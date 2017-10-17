package org.obsidian.ceimp.entity;

public class ScholarshipOpinion {
    private Integer id;

    private String managerId;

    private String nationalOpinion;

    private String provincialRecommend;

    private String provincialOpinion;

    private String schoolOpinion;

    private String tripleaOpinion;

    @Override
    public String toString() {
        return "ScholarshipOpinion{" +
                "id=" + id +
                ", managerId='" + managerId + '\'' +
                ", nationalOpinion='" + nationalOpinion + '\'' +
                ", provincialRecommend='" + provincialRecommend + '\'' +
                ", provincialOpinion='" + provincialOpinion + '\'' +
                ", schoolOpinion='" + schoolOpinion + '\'' +
                ", tripleaOpinion='" + tripleaOpinion + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public String getNationalOpinion() {
        return nationalOpinion;
    }

    public void setNationalOpinion(String nationalOpinion) {
        this.nationalOpinion = nationalOpinion == null ? null : nationalOpinion.trim();
    }

    public String getProvincialRecommend() {
        return provincialRecommend;
    }

    public void setProvincialRecommend(String provincialRecommend) {
        this.provincialRecommend = provincialRecommend == null ? null : provincialRecommend.trim();
    }

    public String getProvincialOpinion() {
        return provincialOpinion;
    }

    public void setProvincialOpinion(String provincialOpinion) {
        this.provincialOpinion = provincialOpinion == null ? null : provincialOpinion.trim();
    }

    public String getSchoolOpinion() {
        return schoolOpinion;
    }

    public void setSchoolOpinion(String schoolOpinion) {
        this.schoolOpinion = schoolOpinion == null ? null : schoolOpinion.trim();
    }

    public String getTripleaOpinion() {
        return tripleaOpinion;
    }

    public void setTripleaOpinion(String tripleaOpinion) {
        this.tripleaOpinion = tripleaOpinion == null ? null : tripleaOpinion.trim();
    }
}