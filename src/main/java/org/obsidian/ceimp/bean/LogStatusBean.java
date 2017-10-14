package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/9/7.
 */
public class LogStatusBean {
    private String status;

    private String type;

    @Override
    public String toString() {
        return "LogStatusBean{" +
                "status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LogStatusBean() {
    }

    public LogStatusBean(String status) {
        this.status = status;
    }

    public LogStatusBean(String status, String type) {
        this.status = status;
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
