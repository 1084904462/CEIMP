package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/24.
 */
public class InsertManagerBean {
    private String account;
    private String password;
    private String confirmPassword;
    private Integer managerType;
    private Long schoolId;

    public InsertManagerBean() {
    }

    public InsertManagerBean(String account, String password, String confirmPassword, Integer managerType, Long schoolId) {
        this.account = account;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.managerType = managerType;
        this.schoolId = schoolId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Integer getManagerType() {
        return managerType;
    }

    public void setManagerType(Integer managerType) {
        this.managerType = managerType;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }
}
