package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/14.
 */
public class ChangePasswordBean {
    private String status;

    @Override
    public String toString() {
        return "ChangePasswordBean{" +
                "status='" + status + '\'' +
                '}';
    }

    public ChangePasswordBean() {
    }

    public ChangePasswordBean(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
