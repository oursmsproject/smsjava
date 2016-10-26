package com.sms.model;

import java.io.Serializable;


/**
 * The persistent class for the cg_ref_code database table.
 * 
 */
public class CgRefCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8809238148191273057L;

	private String description;

	private String domain_label;

	private String domain_type;

	private String domain_value;

	public CgRefCode() {
		super();
	}

	public CgRefCode(String description, String domain_label, String domain_type, String domain_value) {
		super();
		this.description = description;
		this.domain_label = domain_label;
		this.domain_type = domain_type;
		this.domain_value = domain_value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain_label() {
		return domain_label;
	}

	public void setDomain_label(String domain_label) {
		this.domain_label = domain_label;
	}

	public String getDomain_type() {
		return domain_type;
	}

	public void setDomain_type(String domain_type) {
		this.domain_type = domain_type;
	}

	public String getDomain_value() {
		return domain_value;
	}

	public void setDomain_value(String domain_value) {
		this.domain_value = domain_value;
	}

	@Override
	public String toString() {
		return "CgRefCode [description=" + description + ", domain_label=" + domain_label + ", domain_type="
				+ domain_type + ", domain_value=" + domain_value + "]";
	}

		
}