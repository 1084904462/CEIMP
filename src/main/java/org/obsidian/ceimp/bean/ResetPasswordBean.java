package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/16.
 */
public class ResetPasswordBean {
    private String userId;

    @Override
    public String toString() {
        return "ResetPasswordBean{" +
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
