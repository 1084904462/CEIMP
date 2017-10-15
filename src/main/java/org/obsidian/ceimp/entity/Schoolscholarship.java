package org.obsidian.ceimp.entity;

public class Schoolscholarship {
    private Integer id;

    private String userid;

    private String level;

    private String reason;

    private String opinion;

    @Override
    public String toString() {
        return "Schoolscholarship{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", level='" + level + '\'' +
                ", reason='" + reason + '\'' +
                ", opinion='" + opinion + '\'' +
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }
}