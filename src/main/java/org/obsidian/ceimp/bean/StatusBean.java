package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/14.
 */
public class StatusBean {
    private String status;

    public StatusBean() {
    }

    public StatusBean(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusBean{" +
                "status='" + status + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
