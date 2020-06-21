package com.idefav.idefavcd.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
/**
 * <p>
 * 参数表
 * </p>
 *
 * @author idefav
 * @since 2020-06-21
 */
@TableName("tb_params")
public class Params implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自动增长ID
     */
    private Long id;

    /**
     * 资源ID
     */
    private Long resId;

    /**
     * 参数名称
     */
    private String paramName;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 参数描述
     */
    private String paramDesc;

    /**
     * 参数默认值
     */
    private String paramDefault;

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

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

    public String getParamDefault() {
        return paramDefault;
    }

    public void setParamDefault(String paramDefault) {
        this.paramDefault = paramDefault;
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
        return "Params{" +
        ", id=" + id +
        ", resId=" + resId +
        ", paramName=" + paramName +
        ", paramValue=" + paramValue +
        ", paramDesc=" + paramDesc +
        ", paramDefault=" + paramDefault +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
