package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2018/5/27.
 */
public class ResetPasswordBean {
    private List<String> accountList;

    public ResetPasswordBean() {
    }

    public ResetPasswordBean(List<String> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return "ResetPasswordBean{" +
                "accountList=" + accountList +
                '}';
    }

    public List<String> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<String> accountList) {
        this.accountList = accountList;
    }
}
