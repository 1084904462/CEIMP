package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/26.
 */
public class ExcelScholarshipBean {
    private String account;
    private String scholarship;
    private String subName;

    public ExcelScholarshipBean() {
    }

    public ExcelScholarshipBean(String account, String scholarship,String subName) {
        this.account = account;
        this.scholarship = scholarship;
        this.subName = subName;
    }

    public ExcelScholarshipBean(String[] strings){
        if(strings!= null && strings.length>0){
            this.account = strings[0];
            this.scholarship = strings[1];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcelScholarshipBean bean = (ExcelScholarshipBean) o;

        if (account != null ? !account.equals(bean.account) : bean.account != null) return false;
        if (scholarship != null ? !scholarship.equals(bean.scholarship) : bean.scholarship != null) return false;
        return subName != null ? subName.equals(bean.subName) : bean.subName == null;
    }

    @Override
    public int hashCode() {
        int result = account != null ? account.hashCode() : 0;
        result = 31 * result + (scholarship != null ? scholarship.hashCode() : 0);
        result = 31 * result + (subName != null ? subName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExcelScholarshipBean{" +
                "account='" + account + '\'' +
                ", scholarship='" + scholarship + '\'' +
                ", subName='" + subName + '\'' +
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

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
