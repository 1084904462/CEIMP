package org.obsidian.ceimp.entity;

public class Provincialgovernmentscholarship {
    private Integer id;

    private String userid;

    private String date1;

    private String award1;

    private String unit1;

    private String date2;

    private String award2;

    private String unit2;

    private String date3;

    private String award3;

    private String unit3;

    private String date4;

    private String award4;

    private String unit4;

    private String applyreason;

    private String recommendreason;

    private String opinion;

    @Override
    public String toString() {
        return "Provincialgovernmentscholarship{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", date1='" + date1 + '\'' +
                ", award1='" + award1 + '\'' +
                ", unit1='" + unit1 + '\'' +
                ", date2='" + date2 + '\'' +
                ", award2='" + award2 + '\'' +
                ", unit2='" + unit2 + '\'' +
                ", date3='" + date3 + '\'' +
                ", award3='" + award3 + '\'' +
                ", unit3='" + unit3 + '\'' +
                ", date4='" + date4 + '\'' +
                ", award4='" + award4 + '\'' +
                ", unit4='" + unit4 + '\'' +
                ", applyreason='" + applyreason + '\'' +
                ", recommendreason='" + recommendreason + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1 == null ? null : date1.trim();
    }

    public String getAward1() {
        return award1;
    }

    public void setAward1(String award1) {
        this.award1 = award1 == null ? null : award1.trim();
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1 == null ? null : unit1.trim();
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2 == null ? null : date2.trim();
    }

    public String getAward2() {
        return award2;
    }

    public void setAward2(String award2) {
        this.award2 = award2 == null ? null : award2.trim();
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2 == null ? null : unit2.trim();
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3 == null ? null : date3.trim();
    }

    public String getAward3() {
        return award3;
    }

    public void setAward3(String award3) {
        this.award3 = award3 == null ? null : award3.trim();
    }

    public String getUnit3() {
        return unit3;
    }

    public void setUnit3(String unit3) {
        this.unit3 = unit3 == null ? null : unit3.trim();
    }

    public String getDate4() {
        return date4;
    }

    public void setDate4(String date4) {
        this.date4 = date4 == null ? null : date4.trim();
    }

    public String getAward4() {
        return award4;
    }

    public void setAward4(String award4) {
        this.award4 = award4 == null ? null : award4.trim();
    }

    public String getUnit4() {
        return unit4;
    }

    public void setUnit4(String unit4) {
        this.unit4 = unit4 == null ? null : unit4.trim();
    }

    public String getApplyreason() {
        return applyreason;
    }

    public void setApplyreason(String applyreason) {
        this.applyreason = applyreason == null ? null : applyreason.trim();
    }

    public String getRecommendreason() {
        return recommendreason;
    }

    public void setRecommendreason(String recommendreason) {
        this.recommendreason = recommendreason == null ? null : recommendreason.trim();
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }
}