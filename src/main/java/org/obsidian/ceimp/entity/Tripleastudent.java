package org.obsidian.ceimp.entity;

public class Tripleastudent {
    private Integer id;

    private String userid;

    private String reason;

    @Override
    public String toString() {
        return "Tripleastudent{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}