package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/25.
 */
public class InsertUserBasicBean {
    private String account;
    private String password;
    private String username;
    private String sex;
    private String entrance;

    public InsertUserBasicBean() {
    }

    public InsertUserBasicBean(String account, String password, String username, String sex, String entrance) {
        this.account = account;
        this.password = password;
        this.username = username;
        this.sex = sex;
        this.entrance = entrance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsertUserBasicBean that = (InsertUserBasicBean) o;

        return account != null ? account.equals(that.account) : that.account == null;
    }

    @Override
    public int hashCode() {
        return account != null ? account.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "InsertUserBasicBean{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", entrance='" + entrance + '\'' +
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }
}
