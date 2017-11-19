package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/19.
 */
public class UserAccountBean {
    private String account;

    public UserAccountBean() {
    }

    public UserAccountBean(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "UserAccountBean{" +
                "account='" + account + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
