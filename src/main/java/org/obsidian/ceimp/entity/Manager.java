package org.obsidian.ceimp.entity;

public class Manager {
    private Integer id;

    private String managerid;

    private String password;

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", managerid='" + managerid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid == null ? null : managerid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}