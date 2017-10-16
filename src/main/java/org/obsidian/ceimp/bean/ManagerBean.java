package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/10/14.
 */
public class ManagerBean {
    private String managerId;

    @Override
    public String toString() {
        return "ManagerBean{" +
                "managerId='" + managerId + '\'' +
                '}';
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
}
