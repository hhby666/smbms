package com.wlq.pojo;

import java.util.Date;

/**
 * tableName: smbms_provider
 *
 * @author by wlq on 2021/08/09
 * @version Java1.8 IntelliJ IDEA
 */

public class Provider {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 供应商编码
     */
    private String proCode;

    /**
     * 供应商名称
     */
    private String proName;

    /**
     * 供应商详细描述
     */
    private String proDesc;

    /**
     * 供应商联系人
     */
    private String proContact;

    /**
     * 联系电话
     */
    private String proPhone;

    /**
     * 地址
     */
    private String proAddress;

    /**
     * 传真
     */
    private String proFax;

    /**
     * 创建者（userId）
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date creationDate;

    /**
     * 更新时间
     */
    private Date modifyDate;

    /**
     * 更新者（userId）
     */
    private Long modifyBy;


    /**
     * get 主键ID
     *
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * set 主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 供应商编码
     *
     * @return proCode 供应商编码
     */
    public String getProCode() {
        return proCode;
    }

    /**
     * set 供应商编码
     *
     * @param proCode 供应商编码
     */
    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    /**
     * get 供应商名称
     *
     * @return proName 供应商名称
     */
    public String getProName() {
        return proName;
    }

    /**
     * set 供应商名称
     *
     * @param proName 供应商名称
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * get 供应商详细描述
     *
     * @return proDesc 供应商详细描述
     */
    public String getProDesc() {
        return proDesc;
    }

    /**
     * set 供应商详细描述
     *
     * @param proDesc 供应商详细描述
     */
    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    /**
     * get 供应商联系人
     *
     * @return proContact 供应商联系人
     */
    public String getProContact() {
        return proContact;
    }

    /**
     * set 供应商联系人
     *
     * @param proContact 供应商联系人
     */
    public void setProContact(String proContact) {
        this.proContact = proContact;
    }

    /**
     * get 联系电话
     *
     * @return proPhone 联系电话
     */
    public String getProPhone() {
        return proPhone;
    }

    /**
     * set 联系电话
     *
     * @param proPhone 联系电话
     */
    public void setProPhone(String proPhone) {
        this.proPhone = proPhone;
    }

    /**
     * get 地址
     *
     * @return proAddress 地址
     */
    public String getProAddress() {
        return proAddress;
    }

    /**
     * set 地址
     *
     * @param proAddress 地址
     */
    public void setProAddress(String proAddress) {
        this.proAddress = proAddress;
    }

    /**
     * get 传真
     *
     * @return proFax 传真
     */
    public String getProFax() {
        return proFax;
    }

    /**
     * set 传真
     *
     * @param proFax 传真
     */
    public void setProFax(String proFax) {
        this.proFax = proFax;
    }

    /**
     * get 创建者（userId）
     *
     * @return createdBy 创建者（userId）
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * set 创建者（userId）
     *
     * @param createdBy 创建者（userId）
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * get 创建时间
     *
     * @return creationDate 创建时间
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * set 创建时间
     *
     * @param creationDate 创建时间
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * get 更新时间
     *
     * @return modifyDate 更新时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * set 更新时间
     *
     * @param modifyDate 更新时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * get 更新者（userId）
     *
     * @return modifyBy 更新者（userId）
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * set 更新者（userId）
     *
     * @param modifyBy 更新者（userId）
     */
    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }


    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                "proCode='" + proCode + '\'' +
                "proName='" + proName + '\'' +
                "proDesc='" + proDesc + '\'' +
                "proContact='" + proContact + '\'' +
                "proPhone='" + proPhone + '\'' +
                "proAddress='" + proAddress + '\'' +
                "proFax='" + proFax + '\'' +
                "createdBy='" + createdBy + '\'' +
                "creationDate='" + creationDate + '\'' +
                "modifyDate='" + modifyDate + '\'' +
                "modifyBy='" + modifyBy + '\'' +
                '}';
    }
}
