package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/14.
 */
public class ManagerLogBean {
    private Long managerId;
    private String account;
    private Long schoolId;
    private Integer ManagerType;

    public ManagerLogBean() {
    }

    public ManagerLogBean(Long managerId, String account, Long schoolId, Integer managerType) {
        this.managerId = managerId;
        this.account = account;
        this.schoolId = schoolId;
        ManagerType = managerType;
    }

    @Override
    public String toString() {
        return "ManagerLogBean{" +
                "managerId=" + managerId +
                ", account='" + account + '\'' +
                ", schoolId=" + schoolId +
                ", ManagerType=" + ManagerType +
                '}';
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getManagerType() {
        return ManagerType;
    }

    public void setManagerType(Integer managerType) {
        ManagerType = managerType;
    }
}
