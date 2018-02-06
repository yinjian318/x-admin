package com.model;

import java.util.Date;

public class Resource {
    private Long resourceId;

    private Long parentId;

    private String resourceCode;

    private String resourceName;

    private Short resourceType;

    private String resourceUrl;

    private String iconUrl;

    private String iconName;

    private Short hasChild;

    private Short delFlag;

    private Date createTime;

    private Long createuserId;

    private String createuserAccount;

    private String createuserName;

    private Date updateTime;

    private Long updateuserId;

    private String updateuserAccount;

    private String updateuserName;

    private String reserve01;

    private String reserve02;

    private String reserve03;

    private String reserve04;

    private String reserve05;

    private String reserve06;

    private String reserve07;

    private String reserve08;

    private String reserve09;

    private String reserve10;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Short getResourceType() {
        return resourceType;
    }

    public void setResourceType(Short resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public Short getHasChild() {
        return hasChild;
    }

    public void setHasChild(Short hasChild) {
        this.hasChild = hasChild;
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(Long createuserId) {
        this.createuserId = createuserId;
    }

    public String getCreateuserAccount() {
        return createuserAccount;
    }

    public void setCreateuserAccount(String createuserAccount) {
        this.createuserAccount = createuserAccount;
    }

    public String getCreateuserName() {
        return createuserName;
    }

    public void setCreateuserName(String createuserName) {
        this.createuserName = createuserName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateuserId() {
        return updateuserId;
    }

    public void setUpdateuserId(Long updateuserId) {
        this.updateuserId = updateuserId;
    }

    public String getUpdateuserAccount() {
        return updateuserAccount;
    }

    public void setUpdateuserAccount(String updateuserAccount) {
        this.updateuserAccount = updateuserAccount;
    }

    public String getUpdateuserName() {
        return updateuserName;
    }

    public void setUpdateuserName(String updateuserName) {
        this.updateuserName = updateuserName;
    }

    public String getReserve01() {
        return reserve01;
    }

    public void setReserve01(String reserve01) {
        this.reserve01 = reserve01;
    }

    public String getReserve02() {
        return reserve02;
    }

    public void setReserve02(String reserve02) {
        this.reserve02 = reserve02;
    }

    public String getReserve03() {
        return reserve03;
    }

    public void setReserve03(String reserve03) {
        this.reserve03 = reserve03;
    }

    public String getReserve04() {
        return reserve04;
    }

    public void setReserve04(String reserve04) {
        this.reserve04 = reserve04;
    }

    public String getReserve05() {
        return reserve05;
    }

    public void setReserve05(String reserve05) {
        this.reserve05 = reserve05;
    }

    public String getReserve06() {
        return reserve06;
    }

    public void setReserve06(String reserve06) {
        this.reserve06 = reserve06;
    }

    public String getReserve07() {
        return reserve07;
    }

    public void setReserve07(String reserve07) {
        this.reserve07 = reserve07;
    }

    public String getReserve08() {
        return reserve08;
    }

    public void setReserve08(String reserve08) {
        this.reserve08 = reserve08;
    }

    public String getReserve09() {
        return reserve09;
    }

    public void setReserve09(String reserve09) {
        this.reserve09 = reserve09;
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", parentId=" + parentId +
                ", resourceCode='" + resourceCode + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", resourceType=" + resourceType +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", iconName='" + iconName + '\'' +
                ", hasChild=" + hasChild +
                ", delFlag=" + delFlag +
                ", createTime=" + createTime +
                ", createuserId=" + createuserId +
                ", createuserAccount='" + createuserAccount + '\'' +
                ", createuserName='" + createuserName + '\'' +
                ", updateTime=" + updateTime +
                ", updateuserId=" + updateuserId +
                ", updateuserAccount='" + updateuserAccount + '\'' +
                ", updateuserName='" + updateuserName + '\'' +
                ", reserve01='" + reserve01 + '\'' +
                ", reserve02='" + reserve02 + '\'' +
                ", reserve03='" + reserve03 + '\'' +
                ", reserve04='" + reserve04 + '\'' +
                ", reserve05='" + reserve05 + '\'' +
                ", reserve06='" + reserve06 + '\'' +
                ", reserve07='" + reserve07 + '\'' +
                ", reserve08='" + reserve08 + '\'' +
                ", reserve09='" + reserve09 + '\'' +
                ", reserve10='" + reserve10 + '\'' +
                '}';
    }
}