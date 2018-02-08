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

    private Long createUserId;

    private String createUserAccount;

    private String createUserName;

    private Date updateTime;

    private Long updateUserId;

    private String updateUserAccount;

    private String updateUserName;

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

    public Resource(Long resourceId, Long parentId, String resourceCode, String resourceName, Short resourceType, String resourceUrl, String iconUrl, String iconName, Short hasChild, Short delFlag, Date createTime, Long createUserId, String createUserAccount, String createUserName, Date updateTime, Long updateUserId, String updateUserAccount, String updateUserName, String reserve01, String reserve02, String reserve03, String reserve04, String reserve05, String reserve06, String reserve07, String reserve08, String reserve09, String reserve10) {
        this.resourceId = resourceId;
        this.parentId = parentId;
        this.resourceCode = resourceCode;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.resourceUrl = resourceUrl;
        this.iconUrl = iconUrl;
        this.iconName = iconName;
        this.hasChild = hasChild;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.createUserAccount = createUserAccount;
        this.createUserName = createUserName;
        this.updateTime = updateTime;
        this.updateUserId = updateUserId;
        this.updateUserAccount = updateUserAccount;
        this.updateUserName = updateUserName;
        this.reserve01 = reserve01;
        this.reserve02 = reserve02;
        this.reserve03 = reserve03;
        this.reserve04 = reserve04;
        this.reserve05 = reserve05;
        this.reserve06 = reserve06;
        this.reserve07 = reserve07;
        this.reserve08 = reserve08;
        this.reserve09 = reserve09;
        this.reserve10 = reserve10;
    }

    public Resource() {
        super();
    }

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
        this.resourceCode = resourceCode == null ? null : resourceCode.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
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
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName == null ? null : iconName.trim();
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

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserAccount() {
        return createUserAccount;
    }

    public void setCreateUserAccount(String createUserAccount) {
        this.createUserAccount = createUserAccount == null ? null : createUserAccount.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserAccount() {
        return updateUserAccount;
    }

    public void setUpdateUserAccount(String updateUserAccount) {
        this.updateUserAccount = updateUserAccount == null ? null : updateUserAccount.trim();
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    public String getReserve01() {
        return reserve01;
    }

    public void setReserve01(String reserve01) {
        this.reserve01 = reserve01 == null ? null : reserve01.trim();
    }

    public String getReserve02() {
        return reserve02;
    }

    public void setReserve02(String reserve02) {
        this.reserve02 = reserve02 == null ? null : reserve02.trim();
    }

    public String getReserve03() {
        return reserve03;
    }

    public void setReserve03(String reserve03) {
        this.reserve03 = reserve03 == null ? null : reserve03.trim();
    }

    public String getReserve04() {
        return reserve04;
    }

    public void setReserve04(String reserve04) {
        this.reserve04 = reserve04 == null ? null : reserve04.trim();
    }

    public String getReserve05() {
        return reserve05;
    }

    public void setReserve05(String reserve05) {
        this.reserve05 = reserve05 == null ? null : reserve05.trim();
    }

    public String getReserve06() {
        return reserve06;
    }

    public void setReserve06(String reserve06) {
        this.reserve06 = reserve06 == null ? null : reserve06.trim();
    }

    public String getReserve07() {
        return reserve07;
    }

    public void setReserve07(String reserve07) {
        this.reserve07 = reserve07 == null ? null : reserve07.trim();
    }

    public String getReserve08() {
        return reserve08;
    }

    public void setReserve08(String reserve08) {
        this.reserve08 = reserve08 == null ? null : reserve08.trim();
    }

    public String getReserve09() {
        return reserve09;
    }

    public void setReserve09(String reserve09) {
        this.reserve09 = reserve09 == null ? null : reserve09.trim();
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
    }
}