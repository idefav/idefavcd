package com.idefav.idefavcd.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
/**
 * <p>
 * 应用表
 * </p>
 *
 * @author idefav
 * @since 2020-06-21
 */
@TableName("tb_app")
public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自动增长ID
     */
    private Long id;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 仓库地址
     */
    private String gitUrl;

    /**
     * 模块
     */
    private String module;

    /**
     * 项目类型
     */
    private String projectType;

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

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
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
        return "App{" +
        ", id=" + id +
        ", appName=" + appName +
        ", gitUrl=" + gitUrl +
        ", module=" + module +
        ", projectType=" + projectType +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
