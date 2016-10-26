package com.sms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the role_types_config database table.
 * 
 */
public class RoleTypesConfig implements Serializable {

	private static final long serialVersionUID = 7800027378724398638L;

	private Long roleId;

	private Long createdBy;

	private String dummy1;

	private String dummy2;

	private Long institutionId;

	private String roleDescInsLevel;

	private String roleDescription;

	private String roleName;

	private String roleNameInsLevel;

	private String role_Type;

	private Long updatedBy;
	
	private Date createdDate;
	
	private Date updatedDate;

	//bi-directional many-to-one association to UserRole
	private List<UserRole> userRoles;

	public RoleTypesConfig() {
		super();
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getDummy1() {
		return this.dummy1;
	}

	public void setDummy1(String dummy1) {
		this.dummy1 = dummy1;
	}

	public String getDummy2() {
		return this.dummy2;
	}

	public void setDummy2(String dummy2) {
		this.dummy2 = dummy2;
	}

	public String getRoleDescInsLevel() {
		return this.roleDescInsLevel;
	}

	public void setRoleDescInsLevel(String roleDescInsLevel) {
		this.roleDescInsLevel = roleDescInsLevel;
	}

	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleNameInsLevel() {
		return this.roleNameInsLevel;
	}

	public void setRoleNameInsLevel(String roleNameInsLevel) {
		this.roleNameInsLevel = roleNameInsLevel;
	}

	public String getRole_Type() {
		return this.role_Type;
	}

	public void setRole_Type(String role_Type) {
		this.role_Type = role_Type;
	}

	public List<UserRole> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(Long institutionId) {
		this.institutionId = institutionId;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public UserRole addUserRole(UserRole userRole) {
		getUserRoles().add(userRole);
		userRole.setRoleTypesConfig(this);

		return userRole;
	}

	public UserRole removeUserRole(UserRole userRole) {
		getUserRoles().remove(userRole);
		userRole.setRoleTypesConfig(null);

		return userRole;
	}

	@Override
	public String toString() {
		return "RoleTypesConfig [roleId=" + roleId + ", createdBy=" + createdBy + ", dummy1=" + dummy1 + ", dummy2="
				+ dummy2 + ", institutionId=" + institutionId + ", roleDescInsLevel=" + roleDescInsLevel
				+ ", roleDescription=" + roleDescription + ", roleName=" + roleName + ", roleNameInsLevel="
				+ roleNameInsLevel + ", role_Type=" + role_Type + ", updatedBy=" + updatedBy + ", userRoles="
				+ userRoles + "]";
	}
	

}