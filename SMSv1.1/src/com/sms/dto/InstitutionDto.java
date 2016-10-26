package com.sms.dto;

import java.util.Date;


/**
 * The persistent class for the institution database table.
 * 
 */
public class InstitutionDto {

	private Long institutionId;

	private Long createdBy;

	private Date createdDate = new Date();

	private String insAddressLine1;

	private String insAddressLine2;

	private String insAltPhone;

	private String insBoard;

	private String insCountry;

	private String insCity;

	private String insDateOfInception;

	private String insEmail;

	private String insExaminationCode;

	private String insFax;

	private String insHeadEmailId;

	private Long insHeadId;

	private String insHeadName;

	private String insHeadOfficeNo;

	private String insHeadPersonalNo;

	private String insMediumOfEducation;

	private Long insParentId;
	private String insParentName;

	private String insPhone;

	private String insPinCode;

	private String insState;

	private String insStatus;

	private String insType;

	private String insWebsiteUrl;

	private String institutionName;

	private String institutionRegistraionCode;

	private Long updatedBy;

	private Date updatedDate = new Date();

	public InstitutionDto() {
		super();
	}

	public String getInsParentName() {
		return insParentName;
	}

	public void setInsParentName(String insParentName) {
		this.insParentName = insParentName;
	}
	
	public String getInsCity() {
		return insCity;
	}

	public void setInsCity(String insCity) {
		this.insCity = insCity;
	}

	public Long getInstitutionId() {
		return this.institutionId;
	}

	public void setInstitutionId(Long institutionId) {
		this.institutionId = institutionId;
	}

	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getInsAddressLine1() {
		return this.insAddressLine1;
	}

	public void setInsAddressLine1(String insAddressLine1) {
		this.insAddressLine1 = insAddressLine1;
	}

	public String getInsAddressLine2() {
		return this.insAddressLine2;
	}

	public void setInsAddressLine2(String insAddressLine2) {
		this.insAddressLine2 = insAddressLine2;
	}

	public String getInsAltPhone() {
		return this.insAltPhone;
	}

	public void setInsAltPhone(String insAltPhone) {
		this.insAltPhone = insAltPhone;
	}

	public String getInsBoard() {
		return this.insBoard;
	}

	public void setInsBoard(String insBoard) {
		this.insBoard = insBoard;
	}

	public String getInsCountry() {
		return this.insCountry;
	}

	public void setInsCountry(String insCountry) {
		this.insCountry = insCountry;
	}

	public String getInsDateOfInception() {
		return this.insDateOfInception;
	}

	public void setInsDateOfInception(String insDateOfInception) {
		this.insDateOfInception = insDateOfInception;
	}

	public String getInsEmail() {
		return this.insEmail;
	}

	public void setInsEmail(String insEmail) {
		this.insEmail = insEmail;
	}

	public String getInsExaminationCode() {
		return this.insExaminationCode;
	}

	public void setInsExaminationCode(String insExaminationCode) {
		this.insExaminationCode = insExaminationCode;
	}

	public String getInsFax() {
		return this.insFax;
	}

	public void setInsFax(String insFax) {
		this.insFax = insFax;
	}

	public String getInsHeadEmailId() {
		return this.insHeadEmailId;
	}

	public void setInsHeadEmailId(String insHeadEmailId) {
		this.insHeadEmailId = insHeadEmailId;
	}

	public Long getInsHeadId() {
		return this.insHeadId;
	}

	public void setInsHeadId(Long insHeadId) {
		this.insHeadId = insHeadId;
	}

	public String getInsHeadName() {
		return this.insHeadName;
	}

	public void setInsHeadName(String insHeadName) {
		this.insHeadName = insHeadName;
	}

	public String getInsHeadOfficeNo() {
		return this.insHeadOfficeNo;
	}

	public void setInsHeadOfficeNo(String insHeadOfficeNo) {
		this.insHeadOfficeNo = insHeadOfficeNo;
	}

	public String getInsHeadPersonalNo() {
		return this.insHeadPersonalNo;
	}

	public void setInsHeadPersonalNo(String insHeadPersonalNo) {
		this.insHeadPersonalNo = insHeadPersonalNo;
	}

	public String getInsMediumOfEducation() {
		return this.insMediumOfEducation;
	}

	public void setInsMediumOfEducation(String insMediumOfEducation) {
		this.insMediumOfEducation = insMediumOfEducation;
	}

	public Long getInsParentId() {
		return this.insParentId;
	}

	public void setInsParentId(Long insParentId) {
		this.insParentId = insParentId;
	}

	public String getInsPhone() {
		return this.insPhone;
	}

	public void setInsPhone(String insPhone) {
		this.insPhone = insPhone;
	}

	public String getInsPinCode() {
		return this.insPinCode;
	}

	public void setInsPinCode(String insPinCode) {
		this.insPinCode = insPinCode;
	}

	public String getInsState() {
		return this.insState;
	}

	public void setInsState(String insState) {
		this.insState = insState;
	}

	public String getInsStatus() {
		return this.insStatus;
	}

	public void setInsStatus(String insStatus) {
		this.insStatus = insStatus;
	}

	public String getInsType() {
		return this.insType;
	}

	public void setInsType(String insType) {
		this.insType = insType;
	}

	public String getInsWebsiteUrl() {
		return this.insWebsiteUrl;
	}

	public void setInsWebsiteUrl(String insWebsiteUrl) {
		this.insWebsiteUrl = insWebsiteUrl;
	}

	public String getInstitutionName() {
		return this.institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getInstitutionRegistraionCode() {
		return this.institutionRegistraionCode;
	}

	public void setInstitutionRegistraionCode(String institutionRegistraionCode) {
		this.institutionRegistraionCode = institutionRegistraionCode;
	}

	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "InstitutionDto [institutionId=" + institutionId + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", insAddressLine1=" + insAddressLine1 + ", insAddressLine2=" + insAddressLine2
				+ ", insAltPhone=" + insAltPhone + ", insBoard=" + insBoard + ", insCountry=" + insCountry
				+ ", insCity=" + insCity + ", insDateOfInception=" + insDateOfInception + ", insEmail=" + insEmail
				+ ", insExaminationCode=" + insExaminationCode + ", insFax=" + insFax + ", insHeadEmailId="
				+ insHeadEmailId + ", insHeadId=" + insHeadId + ", insHeadName=" + insHeadName + ", insHeadOfficeNo="
				+ insHeadOfficeNo + ", insHeadPersonalNo=" + insHeadPersonalNo + ", insMediumOfEducation="
				+ insMediumOfEducation + ", insParentId=" + insParentId + ", insParentName=" + insParentName
				+ ", insPhone=" + insPhone + ", insPinCode=" + insPinCode + ", insState=" + insState + ", insStatus="
				+ insStatus + ", insType=" + insType + ", insWebsiteUrl=" + insWebsiteUrl + ", institutionName="
				+ institutionName + ", institutionRegistraionCode=" + institutionRegistraionCode + ", updatedBy="
				+ updatedBy + ", updatedDate=" + updatedDate + "]";
	}

}