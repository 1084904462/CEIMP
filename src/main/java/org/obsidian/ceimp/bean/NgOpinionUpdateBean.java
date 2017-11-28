package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2017/11/24.
 */
public class NgOpinionUpdateBean {
    private String opinion;
    private List<String> userAccountList;

    @Override
    public String toString() {
        return "NgOpinionUpdateBean{" +
                "opinion='" + opinion + '\'' +
                ", userAccountList=" + userAccountList +
                '}';
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public List<String> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(List<String> userAccountList) {
        this.userAccountList = userAccountList;
    }
}
