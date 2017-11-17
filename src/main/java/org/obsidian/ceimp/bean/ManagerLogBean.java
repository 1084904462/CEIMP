package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/14.
 */
public class ManagerLogBean {
    private Long managerId;

    @Override
    public String toString() {
        return "ManagerLogBean{" +
                "managerId=" + managerId +
                '}';
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }
}
