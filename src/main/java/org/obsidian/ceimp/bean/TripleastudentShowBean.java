package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/15.
 */
public class TripleastudentShowBean {
    private int id;
    private String classes;
    private String userId;
    private String username;

    @Override
    public String toString() {
        return "TripleastudentShowBean{" +
                "id=" + id +
                ", classes='" + classes + '\'' +
                ", userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
