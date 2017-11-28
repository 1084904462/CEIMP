package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/20.
 */
public class UserBasicBean {
    private String account;
    private String username;
    private String sex;
    private String birth;
    private String nation;
    private String entrance;
    private String identity;

    @Override
    public String toString() {
        return "UserBasicBean{" +
                "account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", nation='" + nation + '\'' +
                ", entrance='" + entrance + '\'' +
                ", identity='" + identity + '\'' +
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
