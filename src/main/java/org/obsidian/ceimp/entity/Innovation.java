package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Innovation {
    private Integer innovationId;

    private String content;

    private Integer type;

    private Long createTime;

    @Override
    public String toString() {
        return "Innovation{" +
                "innovationId=" + innovationId +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Innovation() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Innovation(String content, Integer type) {
        this.content = content;
        this.type = type;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Innovation(Integer innovationId, String content, Integer type) {
        this.innovationId = innovationId;
        this.content = content;
        this.type = type;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getInnovationId() {
        return innovationId;
    }

    public void setInnovationId(Integer innovationId) {
        this.innovationId = innovationId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}