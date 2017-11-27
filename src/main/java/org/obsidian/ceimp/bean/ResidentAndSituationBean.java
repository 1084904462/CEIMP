package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/26.
 */
public class ResidentAndSituationBean {
    private String resident;
    private String situation;

    @Override
    public String toString() {
        return "ResidentAndSituationBean{" +
                "resident='" + resident + '\'' +
                ", situation='" + situation + '\'' +
                '}';
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
