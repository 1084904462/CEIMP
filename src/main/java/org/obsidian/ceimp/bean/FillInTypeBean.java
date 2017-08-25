package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/25.
 */
public class FillInTypeBean {
    private int typeId;

    private String type;

    @Override
    public String toString() {
        return "FillInTypeBean{" +
                "typeId=" + typeId +
                ", type='" + type + '\'' +
                '}';
    }

    public FillInTypeBean() {
    }

    public FillInTypeBean(int typeId, String type) {
        this.typeId = typeId;
        this.type = type;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
