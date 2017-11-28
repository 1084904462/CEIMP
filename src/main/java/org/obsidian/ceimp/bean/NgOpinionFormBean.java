package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/24.
 */
public class NgOpinionFormBean {
    private String major;
    private String classNum;
    private String account;
    private String username;
    private String opinion;

    @Override
    public String toString() {
        return "NgOpinionFormBean{" +
                "major='" + major + '\'' +
                ", classNum='" + classNum + '\'' +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
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

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
