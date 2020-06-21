package com.idefav.idefavcd.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
/**
 * <p>
 * 资源表
 * </p>
 *
 * @author idefav
 * @since 2020-06-21
 */
@TableName("tb_resource")
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自动增长ID
     */
    private Long id;

    /**
     * 资源名称
     */
    private String resName;

    /**
     * 资源类型
     */
    private String resType;

    /**
     * 内容ID
     */
    private Long contentId;

    /**
     * 同步状态
     */
    private String syncStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 删除标识
     */
    private Boolean isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Resource{" +
        ", id=" + id +
        ", resName=" + resName +
        ", resType=" + resType +
        ", contentId=" + contentId +
        ", syncStatus=" + syncStatus +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
