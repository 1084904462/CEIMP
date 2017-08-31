package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/18.
 */
public class UserLogBean {
    private String userId;

    private int status;

    @Override
    public String toString() {
        return "UserLogBean{" +
                "userId='" + userId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public UserLogBean() {
    }

    public UserLogBean(String userId, int status) {
        this.userId = userId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
