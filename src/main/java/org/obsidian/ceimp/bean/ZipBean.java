package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/15.
 */
public class ZipBean {
    private String userId;
    private String username;
    private String award;

    @Override
    public String toString() {
        return "ZipBean{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", award='" + award + '\'' +
                '}';
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

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
