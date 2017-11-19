package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/19.
 */
public class ZipInfoBean {
    private String account;
    private String username;
    private String scholarshipName;

    public ZipInfoBean() {
    }

    public ZipInfoBean(String account, String username, String scholarshipName) {
        this.account = account;
        this.username = username;
        this.scholarshipName = scholarshipName;
    }

    @Override
    public String toString() {
        return "ZipInfoBean{" +
                "account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", scholarshipName='" + scholarshipName + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }
}
