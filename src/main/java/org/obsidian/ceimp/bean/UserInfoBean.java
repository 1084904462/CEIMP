package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/19.
 */
public class UserInfoBean {
    private String charact;
    private String study;
    private String ability;
    private String total;
    private String gpRank;
    private String ceRank;
    private String passSum;
    private String classSum;

    @Override
    public String toString() {
        return "UserInfoBean{" +
                "charact='" + charact + '\'' +
                ", study='" + study + '\'' +
                ", ability='" + ability + '\'' +
                ", total='" + total + '\'' +
                ", gpRank='" + gpRank + '\'' +
                ", ceRank='" + ceRank + '\'' +
                ", passSum='" + passSum + '\'' +
                ", classSum='" + classSum + '\'' +
                '}';
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

    public String getGpRank() {
        return gpRank;
    }

    public void setGpRank(String gpRank) {
        this.gpRank = gpRank;
    }

    public String getCeRank() {
        return ceRank;
    }

    public void setCeRank(String ceRank) {
        this.ceRank = ceRank;
    }

    public String getPassSum() {
        return passSum;
    }

    public void setPassSum(String passSum) {
        this.passSum = passSum;
    }

    public String getClassSum() {
        return classSum;
    }

    public void setClassSum(String classSum) {
        this.classSum = classSum;
    }
}
