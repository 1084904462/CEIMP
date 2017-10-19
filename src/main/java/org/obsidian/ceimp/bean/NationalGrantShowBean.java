package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/18.
 */
public class NationalGrantShowBean {
    private int id;
    private String major;
    private String class_id;
    private String user_id;
    private String username;
    private String sex;

    @Override
    public String toString() {
        return "NationalGrantShowBean{" +
                "id=" + id +
                ", major='" + major + '\'' +
                ", class_id='" + class_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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
}
