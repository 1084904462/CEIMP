package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/18.
 */
public class ManagerLogBean {
    private String managerId;

    private String managerType;

    private String status;

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

    public ManagerLogBean(String managerId, String managerType, String status) {
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

    public String getManagerType() {
        return managerType;
    }

    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
