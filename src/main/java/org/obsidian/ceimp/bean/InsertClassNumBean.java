package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/25.
 */
public class InsertClassNumBean {
    private String school;
    private String major;
    private String grade;
    private String classNum;

    public InsertClassNumBean() {
    }

    public InsertClassNumBean(String school, String major, String grade, String classNum) {
        this.school = school;
        this.major = major;
        this.grade = grade;
        this.classNum = classNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsertClassNumBean that = (InsertClassNumBean) o;

        if (school != null ? !school.equals(that.school) : that.school != null) return false;
        if (major != null ? !major.equals(that.major) : that.major != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        return classNum != null ? classNum.equals(that.classNum) : that.classNum == null;
    }

    @Override
    public int hashCode() {
        int result = school != null ? school.hashCode() : 0;
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (classNum != null ? classNum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InsertClassNumBean{" +
                "school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", classNum='" + classNum + '\'' +
                '}';
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
