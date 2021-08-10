package com.wlq.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * tableName: smbms_bill
 *
 * @author by wlq on 2021/08/09
 * @version Java1.8 IntelliJ IDEA
 */

public class Bill {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 账单编码
     */
    private String billCode;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品描述
     */
    private String productDesc;

    /**
     * 商品单位
     */
    private String productUnit;

    /**
     * 商品数量
     */
    private BigDecimal productCount;

    /**
     * 商品总额
     */
    private BigDecimal totalPrice;

    /**
     * 是否支付（1：未支付 2：已支付）
     */
    private Integer isPayment;

    /**
     * 创建者（userId）
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date creationDate;

    /**
     * 更新者（userId）
     */
    private Long modifyBy;

    /**
     * 更新时间
     */
    private Date modifyDate;

    /**
     * 供应商ID
     */
    private Integer providerId;


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
     * get 账单编码
     *
     * @return billCode 账单编码
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * set 账单编码
     *
     * @param billCode 账单编码
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    /**
     * get 商品名称
     *
     * @return productName 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get 商品描述
     *
     * @return productDesc 商品描述
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * set 商品描述
     *
     * @param productDesc 商品描述
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * get 商品单位
     *
     * @return productUnit 商品单位
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * set 商品单位
     *
     * @param productUnit 商品单位
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    /**
     * get 商品数量
     *
     * @return productCount 商品数量
     */
    public BigDecimal getProductCount() {
        return productCount;
    }

    /**
     * set 商品数量
     *
     * @param productCount 商品数量
     */
    public void setProductCount(BigDecimal productCount) {
        this.productCount = productCount;
    }

    /**
     * get 商品总额
     *
     * @return totalPrice 商品总额
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * set 商品总额
     *
     * @param totalPrice 商品总额
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * get 是否支付（1：未支付 2：已支付）
     *
     * @return isPayment 是否支付（1：未支付 2：已支付）
     */
    public Integer getIsPayment() {
        return isPayment;
    }

    /**
     * set 是否支付（1：未支付 2：已支付）
     *
     * @param isPayment 是否支付（1：未支付 2：已支付）
     */
    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
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
     * get 供应商ID
     *
     * @return providerId 供应商ID
     */
    public Integer getProviderId() {
        return providerId;
    }

    /**
     * set 供应商ID
     *
     * @param providerId 供应商ID
     */
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }


    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                "billCode='" + billCode + '\'' +
                "productName='" + productName + '\'' +
                "productDesc='" + productDesc + '\'' +
                "productUnit='" + productUnit + '\'' +
                "productCount='" + productCount + '\'' +
                "totalPrice='" + totalPrice + '\'' +
                "isPayment='" + isPayment + '\'' +
                "createdBy='" + createdBy + '\'' +
                "creationDate='" + creationDate + '\'' +
                "modifyBy='" + modifyBy + '\'' +
                "modifyDate='" + modifyDate + '\'' +
                "providerId='" + providerId + '\'' +
                '}';
    }
}
