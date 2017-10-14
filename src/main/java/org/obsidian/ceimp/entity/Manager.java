package org.obsidian.ceimp.entity;

public class Manager {
    private Integer id;

    private String managerId;

    private String password;

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", managerId='" + managerId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}