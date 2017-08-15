package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ImportItem {
    private Integer importId;

    private String userId;

    private Integer examFail;

    private Integer makeUp;

    private Integer cet4;

    private Double pe;

    private Double gpa;

    private Long createTime;

    @Override
    public String toString() {
        return "ImportItem{" +
                "importId=" + importId +
                ", userId='" + userId + '\'' +
                ", examFail=" + examFail +
                ", makeUp=" + makeUp +
                ", cet4=" + cet4 +
                ", pe=" + pe +
                ", gpa=" + gpa +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ImportItem() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ImportItem(String userId, Integer examFail, Integer makeUp, Integer cet4, Double pe, Double gpa) {
        this.userId = userId;
        this.examFail = examFail;
        this.makeUp = makeUp;
        this.cet4 = cet4;
        this.pe = pe;
        this.gpa = gpa;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ImportItem(Integer importId, String userId, Integer examFail, Integer makeUp, Integer cet4, Double pe, Double gpa) {
        this.importId = importId;
        this.userId = userId;
        this.examFail = examFail;
        this.makeUp = makeUp;
        this.cet4 = cet4;
        this.pe = pe;
        this.gpa = gpa;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getImportId() {
        return importId;
    }

    public void setImportId(Integer importId) {
        this.importId = importId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getExamFail() {
        return examFail;
    }

    public void setExamFail(Integer examFail) {
        this.examFail = examFail;
    }

    public Integer getMakeUp() {
        return makeUp;
    }

    public void setMakeUp(Integer makeUp) {
        this.makeUp = makeUp;
    }

    public Integer getCet4() {
        return cet4;
    }

    public void setCet4(Integer cet4) {
        this.cet4 = cet4;
    }

    public Double getPe() {
        return pe;
    }

    public void setPe(Double pe) {
        this.pe = pe;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}