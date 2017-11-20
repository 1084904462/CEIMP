package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/20.
 */
public class ScholarshipOpinionBean {
    private String nisOpinion;
    private String pgsRecommend;
    private String pgsOpinion;
    private String ssOpinion;
    private String tasOpinion;

    public ScholarshipOpinionBean() {
    }

    public ScholarshipOpinionBean(String nisOpinion, String pgsRecommend, String pgsOpinion, String ssOpinion, String tasOpinion) {
        this.nisOpinion = nisOpinion;
        this.pgsRecommend = pgsRecommend;
        this.pgsOpinion = pgsOpinion;
        this.ssOpinion = ssOpinion;
        this.tasOpinion = tasOpinion;
    }

    @Override
    public String toString() {
        return "ScholarshipOpinionBean{" +
                "nisOpinion='" + nisOpinion + '\'' +
                ", pgsRecommend='" + pgsRecommend + '\'' +
                ", pgsOpinion='" + pgsOpinion + '\'' +
                ", ssOpinion='" + ssOpinion + '\'' +
                ", tasOpinion='" + tasOpinion + '\'' +
                '}';
    }

    public String getNisOpinion() {
        return nisOpinion;
    }

    public void setNisOpinion(String nisOpinion) {
        this.nisOpinion = nisOpinion;
    }

    public String getPgsRecommend() {
        return pgsRecommend;
    }

    public void setPgsRecommend(String pgsRecommend) {
        this.pgsRecommend = pgsRecommend;
    }

    public String getPgsOpinion() {
        return pgsOpinion;
    }

    public void setPgsOpinion(String pgsOpinion) {
        this.pgsOpinion = pgsOpinion;
    }

    public String getSsOpinion() {
        return ssOpinion;
    }

    public void setSsOpinion(String ssOpinion) {
        this.ssOpinion = ssOpinion;
    }

    public String getTasOpinion() {
        return tasOpinion;
    }

    public void setTasOpinion(String tasOpinion) {
        this.tasOpinion = tasOpinion;
    }
}
