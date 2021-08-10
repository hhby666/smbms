package com.wlq.pojo;
import java.util.Date;

/**
 * tableName: smbms_role
 *
 * @author by wlq on 2021/08/09
 * @version Java1.8 IntelliJ IDEA
 */

public class Role {

	/**
	 * 主键ID
	 */
	private Long id;

	/**
	 * 角色编码
	 */
	private String roleCode;

	/**
	 * 角色名称
	 */
	private String roleName;

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
	 * get 角色编码
	 * @return roleCode 角色编码
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * set 角色编码
	 * @param roleCode 角色编码
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	/**
	 * get 角色名称
	 * @return roleName 角色名称
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * set 角色名称
	 * @param roleName 角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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


	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"roleCode='" + roleCode + '\'' +
					"roleName='" + roleName + '\'' +
					"createdBy='" + createdBy + '\'' +
					"creationDate='" + creationDate + '\'' +
					"modifyBy='" + modifyBy + '\'' +
					"modifyDate='" + modifyDate + '\'' +
				'}';
	}
}
