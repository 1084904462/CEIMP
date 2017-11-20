package org.obsidian.ceimp.bean;

/**
 * Created by Administrator on 2017/11/20.
 */
public class UserSearchBean {

    private String major;

    private String classNum;

    private String account;

    private String username;

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

    @Override
    public String toString() {
        return "UserSearchBean{" +
                "major='" + major + '\'' +
                ", classNum='" + classNum + '\'' +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
