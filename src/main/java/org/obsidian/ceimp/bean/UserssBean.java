package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/14.
 */
public class UserssBean {
    private String userId;

    @Override
    public String toString() {
        return "UserssBean{" +
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
