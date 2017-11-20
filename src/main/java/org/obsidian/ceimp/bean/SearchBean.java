package org.obsidian.ceimp.bean;

/**
 * Created by Administrator on 2017/11/20.
 */
public class SearchBean {

    private String searchKey;

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public String toString() {
        return "SearchBean{" +
                "searchKey='" + searchKey + '\'' +
                '}';
    }
}
