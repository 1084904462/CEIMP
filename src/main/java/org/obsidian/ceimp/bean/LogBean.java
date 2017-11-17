package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/17.
 */
public class LogBean {
    private String account;
    private String password;

    @Override
    public String toString() {
        return "LogBean{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
