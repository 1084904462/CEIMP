package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/18.
 */
public class ManagerLogBean {
    private String managerId;

    private int managerType;

    @Override
    public String toString() {
        return "ManagerLogBean{" +
                "managerId='" + managerId + '\'' +
                ", managerType=" + managerType +
                '}';
    }

    public ManagerLogBean() {
    }

    public ManagerLogBean(String managerId, int managerType) {
        this.managerId = managerId;
        this.managerType = managerType;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public int getManagerType() {
        return managerType;
    }

    public void setManagerType(int managerType) {
        this.managerType = managerType;
    }
}
