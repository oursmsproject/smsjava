package com.sms.model;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the user_roles database table.
 * 
 */
public class UserRole implements Serializable {

	private static final long serialVersionUID = -3534256678927939629L;

	private Long createdBy;

	private Long updatedBy;

	//bi-directional many-to-one association to RoleTypesConfig
	private RoleTypesConfig roleTypesConfig;

	//bi-directional many-to-one association to User
	private User user1;

	//bi-directional many-to-one association to Institution
	private Institution institution;
	
	private Date created_date;
	
	private Date updated_date;
	

	public UserRole() {
	}

	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public RoleTypesConfig getRoleTypesConfig() {
		return this.roleTypesConfig;
	}

	public void setRoleTypesConfig(RoleTypesConfig roleTypesConfig) {
		this.roleTypesConfig = roleTypesConfig;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public Institution getInstitution() {
		return this.institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}
	
	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "UserRole [createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", roleTypesConfig=" + roleTypesConfig
				+ ", user1=" + user1 + ", institution=" + institution + "]";
	}
	
}