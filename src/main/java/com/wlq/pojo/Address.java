package com.wlq.pojo;
import java.util.Date;

/**
 * tableName: smbms_address
 *
 * @author by wlq on 2021/08/09
 * @version Java1.8 IntelliJ IDEA
 */

public class Address {

	/**
	 * 主键ID
	 */
	private Long id;

	/**
	 * 联系人姓名
	 */
	private String contact;

	/**
	 * 收货地址明细
	 */
	private String addressDesc;

	/**
	 * 邮编
	 */
	private String postCode;

	/**
	 * 联系人电话
	 */
	private String tel;

	/**
	 * 创建者
	 */
	private Long createdBy;

	/**
	 * 创建时间
	 */
	private Date creationDate;

	/**
	 * 修改者
	 */
	private Long modifyBy;

	/**
	 * 修改时间
	 */
	private Date modifyDate;

	/**
	 * 用户ID
	 */
	private Long userId;



	/**
	 * get 主键ID
	 * @return id 主键ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * set 主键ID
	 * @param id 主键ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * get 联系人姓名
	 * @return contact 联系人姓名
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * set 联系人姓名
	 * @param contact 联系人姓名
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * get 收货地址明细
	 * @return addressDesc 收货地址明细
	 */
	public String getAddressDesc() {
		return addressDesc;
	}

	/**
	 * set 收货地址明细
	 * @param addressDesc 收货地址明细
	 */
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}

	/**
	 * get 邮编
	 * @return postCode 邮编
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * set 邮编
	 * @param postCode 邮编
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * get 联系人电话
	 * @return tel 联系人电话
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * set 联系人电话
	 * @param tel 联系人电话
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * get 创建者
	 * @return createdBy 创建者
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * set 创建者
	 * @param createdBy 创建者
	 */
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * get 创建时间
	 * @return creationDate 创建时间
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * set 创建时间
	 * @param creationDate 创建时间
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * get 修改者
	 * @return modifyBy 修改者
	 */
	public Long getModifyBy() {
		return modifyBy;
	}

	/**
	 * set 修改者
	 * @param modifyBy 修改者
	 */
	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}

	/**
	 * get 修改时间
	 * @return modifyDate 修改时间
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * set 修改时间
	 * @param modifyDate 修改时间
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * get 用户ID
	 * @return userId 用户ID
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * set 用户ID
	 * @param userId 用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"contact='" + contact + '\'' +
					"addressDesc='" + addressDesc + '\'' +
					"postCode='" + postCode + '\'' +
					"tel='" + tel + '\'' +
					"createdBy='" + createdBy + '\'' +
					"creationDate='" + creationDate + '\'' +
					"modifyBy='" + modifyBy + '\'' +
					"modifyDate='" + modifyDate + '\'' +
					"userId='" + userId + '\'' +
				'}';
	}
}
