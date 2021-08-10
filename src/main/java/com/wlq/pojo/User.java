package com.wlq.pojo;
import java.util.Date;

/**
 * tableName: smbms_user
 *
 * @author by wlq on 2021/08/09
 * @version Java1.8 IntelliJ IDEA
 */

public class User {

	/**
	 * 主键ID
	 */
	private Long id;

	/**
	 * 用户编码
	 */
	private String userCode;

	/**
	 * 用户名称
	 */
	private String userName;

	/**
	 * 用户密码
	 */
	private String userPassword;

	/**
	 * 性别（1:女、 2:男）
	 */
	private Integer gender;

	/**
	 * 出生日期
	 */
	private Date birthday;

	/**
	 * 手机
	 */
	private String phone;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 用户角色（取自角色表-角色id）
	 */
	private Integer userRole;

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
	 * get 用户编码
	 * @return userCode 用户编码
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * set 用户编码
	 * @param userCode 用户编码
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * get 用户名称
	 * @return userName 用户名称
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * set 用户名称
	 * @param userName 用户名称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * get 用户密码
	 * @return userPassword 用户密码
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * set 用户密码
	 * @param userPassword 用户密码
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * get 性别（1:女、 2:男）
	 * @return gender 性别（1:女、 2:男）
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * set 性别（1:女、 2:男）
	 * @param gender 性别（1:女、 2:男）
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * get 出生日期
	 * @return birthday 出生日期
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * set 出生日期
	 * @param birthday 出生日期
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * get 手机
	 * @return phone 手机
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * set 手机
	 * @param phone 手机
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * get 地址
	 * @return address 地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * set 地址
	 * @param address 地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * get 用户角色（取自角色表-角色id）
	 * @return userRole 用户角色（取自角色表-角色id）
	 */
	public Integer getUserRole() {
		return userRole;
	}

	/**
	 * set 用户角色（取自角色表-角色id）
	 * @param userRole 用户角色（取自角色表-角色id）
	 */
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	/**
	 * get 创建者（userId）
	 * @return createdBy 创建者（userId）
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * set 创建者（userId）
	 * @param createdBy 创建者（userId）
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
	 * get 更新者（userId）
	 * @return modifyBy 更新者（userId）
	 */
	public Long getModifyBy() {
		return modifyBy;
	}

	/**
	 * set 更新者（userId）
	 * @param modifyBy 更新者（userId）
	 */
	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}

	/**
	 * get 更新时间
	 * @return modifyDate 更新时间
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * set 更新时间
	 * @param modifyDate 更新时间
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}


	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"userCode='" + userCode + '\'' +
					"userName='" + userName + '\'' +
					"userPassword='" + userPassword + '\'' +
					"gender='" + gender + '\'' +
					"birthday='" + birthday + '\'' +
					"phone='" + phone + '\'' +
					"address='" + address + '\'' +
					"userRole='" + userRole + '\'' +
					"createdBy='" + createdBy + '\'' +
					"creationDate='" + creationDate + '\'' +
					"modifyBy='" + modifyBy + '\'' +
					"modifyDate='" + modifyDate + '\'' +
				'}';
	}
}
