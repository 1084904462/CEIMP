package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2017/10/19.
 */
public class NationalGrantOpinionAjaxBean {
    private Integer code;
    private String msg;
    private Integer count;
    private List<NationalGrantOpinionBean> data;

    @Override
    public String toString() {
        return "NationalGrantOpinionAjaxBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<NationalGrantOpinionBean> getData() {
        return data;
    }

    public void setData(List<NationalGrantOpinionBean> data) {
        this.data = data;
    }
}
