package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/19.
 */
public class UserInfoBean {
    private String account;
    private String username;

    public UserInfoBean() {
    }

    public UserInfoBean(String account, String username) {
        this.account = account;
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserInfoBean{" +
                "account='" + account + '\'' +
                ", username='" + username + '\'' +
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
}
