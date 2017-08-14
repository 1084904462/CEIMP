package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Users {
    private String userId;

    private String username;

    private String password;

    private Integer classId;

    private Long createTime;

    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", classId=" + classId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Users() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Users(String userId, String username, String password, Integer classId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.classId = classId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}