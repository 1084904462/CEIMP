package org.obsidian.ceimp.entity;

public class Manager {
    private Long managerId;

    private String account;

    private String password;

    private Integer managerType;

    private Long schoolId;

    private String grade;

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", managerType=" + managerType +
                ", schoolId=" + schoolId +
                ", grade='" + grade + '\'' +
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
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}