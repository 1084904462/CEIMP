package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/14.
 */
public class UserLogBean {
    private Long userId;
    private Long classNumId;

    @Override
    public String toString() {
        return "UserLogBean{" +
                "userId=" + userId +
                ", classNumId=" + classNumId +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getClassNumId() {
        return classNumId;
    }

    public void setClassNumId(Long classNumId) {
        this.classNumId = classNumId;
    }
}
