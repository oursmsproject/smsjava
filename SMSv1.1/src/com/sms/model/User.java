package com.sms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1530368160763311367L;

	private Long userId;

	private Long createdBy;

	private Date dob;

	private String dummy1;

	private String dummy2;

	private String enabled;

	private String firstName;

	private String middleName;

	private String password;

	private String surname;

	private Long updatedBy;

	private String username;
	
	private Date created_date;
	
	private Date updated_date;
	
	//bi-directional many-to-one association to UserRole
	private List<UserRole> userRoles1;

	public User() {
		super();
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<UserRole> getUserRoles1() {
		return this.userRoles1;
	}

	public void setUserRoles1(List<UserRole> userRoles1) {
		this.userRoles1 = userRoles1;
	}

	public UserRole addUserRoles1(UserRole userRoles1) {
		getUserRoles1().add(userRoles1);
		userRoles1.setUser1(this);

		return userRoles1;
	}

	public UserRole removeUserRoles1(UserRole userRoles1) {
		getUserRoles1().remove(userRoles1);
		userRoles1.setUser1(null);

		return userRoles1;
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
		return "User [userId=" + userId + ", createdBy=" + createdBy + ", dob=" + dob + ", dummy1=" + dummy1
				+ ", dummy2=" + dummy2 + ", enabled=" + enabled + ", firstName=" + firstName + ", middleName="
				+ middleName + ", password=" + password + ", surname=" + surname + ", updatedBy=" + updatedBy
				+ ", username=" + username + ", created_date=" + created_date + ", updated_date=" + updated_date
				+ ", userRoles1=" + userRoles1  + "]";
	}

}