package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/14.
 */
public class UserssBean {
    private String userId;

    private int isChangedPassword;

    @Override
    public String toString() {
        return "UserssBean{" +
                "userId='" + userId + '\'' +
                ", isChangedPassword=" + isChangedPassword +
                '}';
    }

    public int getIsChangedPassword() {
        return isChangedPassword;
    }

    public void setIsChangedPassword(int isChangedPassword) {
        this.isChangedPassword = isChangedPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
