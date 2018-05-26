package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/26.
 */
public class ExcelScholarshipBean {
    private String account;
    private String scholarship;

    public ExcelScholarshipBean() {
    }

    public ExcelScholarshipBean(String[] strings){
        this.account = strings[0];
        this.scholarship = strings[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcelScholarshipBean that = (ExcelScholarshipBean) o;

        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        return scholarship != null ? scholarship.equals(that.scholarship) : that.scholarship == null;
    }

    @Override
    public int hashCode() {
        int result = account != null ? account.hashCode() : 0;
        result = 31 * result + (scholarship != null ? scholarship.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExcelScholarshipBean{" +
                "account='" + account + '\'' +
                ", scholarship='" + scholarship + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }
}
