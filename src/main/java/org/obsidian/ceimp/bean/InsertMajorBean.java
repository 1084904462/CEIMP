package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/25.
 */
public class InsertMajorBean {
    private Long schoolId;
    private String major;
    private String grade;

    public InsertMajorBean() {
    }

    public InsertMajorBean(Long schoolId,String major, String grade) {
        this.schoolId = schoolId;
        this.major = major;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsertMajorBean that = (InsertMajorBean) o;

        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (major != null ? !major.equals(that.major) : that.major != null) return false;
        return grade != null ? grade.equals(that.grade) : that.grade == null;
    }

    @Override
    public int hashCode() {
        int result = schoolId != null ? schoolId.hashCode() : 0;
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InsertMajorBean{" +
                "schoolId=" + schoolId +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
