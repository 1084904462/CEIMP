package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/18.
 */
public class UserLogBean {
    private String userId;

    public UserLogBean() {
    }

    public UserLogBean(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserLogBean{" +
                "userId='" + userId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
