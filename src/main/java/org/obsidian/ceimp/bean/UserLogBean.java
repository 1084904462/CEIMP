package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/18.
 */
public class UserLogBean {
    private String userId;

    private String status;

    @Override
    public String toString() {
        return "UserLogBean{" +
                "userId='" + userId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public UserLogBean() {
    }

    public UserLogBean(String userId, String status) {
        this.userId = userId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
