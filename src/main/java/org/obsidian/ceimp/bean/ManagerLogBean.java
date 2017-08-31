package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/18.
 */
public class ManagerLogBean {
    private String managerId;

    private int managerType;

    private int status;

    @Override
    public String toString() {
        return "ManagerLogBean{" +
                "managerId='" + managerId + '\'' +
                ", managerType='" + managerType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public ManagerLogBean() {
    }

    public ManagerLogBean(String managerId, int managerType, int status) {
        this.managerId = managerId;
        this.managerType = managerType;
        this.status = status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
