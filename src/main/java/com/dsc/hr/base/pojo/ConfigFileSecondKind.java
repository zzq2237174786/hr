package com.dsc.hr.base.pojo;

import java.io.Serializable;


/**
 * The persistent class for the config_file_second_kind database table.
 * 
 */
public class ConfigFileSecondKind implements Serializable {
	private static final long serialVersionUID = 1L;

	private String firstKindId;

	private String firstKindName;

	private short fskId;

	private String secondKindId;

	private String secondKindName;

	private String secondSalaryId;

	private String secondSaleId;

	public ConfigFileSecondKind() {
	}

	public String getFirstKindId() {
		return this.firstKindId;
	}

	public void setFirstKindId(String firstKindId) {
		this.firstKindId = firstKindId;
	}

	public String getFirstKindName() {
		return this.firstKindName;
	}

	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}

	public short getFskId() {
		return this.fskId;
	}

	public void setFskId(short fskId) {
		this.fskId = fskId;
	}

	public String getSecondKindId() {
		return this.secondKindId;
	}

	public void setSecondKindId(String secondKindId) {
		this.secondKindId = secondKindId;
	}

	public String getSecondKindName() {
		return this.secondKindName;
	}

	public void setSecondKindName(String secondKindName) {
		this.secondKindName = secondKindName;
	}

	public String getSecondSalaryId() {
		return this.secondSalaryId;
	}

	public void setSecondSalaryId(String secondSalaryId) {
		this.secondSalaryId = secondSalaryId;
	}

	public String getSecondSaleId() {
		return this.secondSaleId;
	}

	public void setSecondSaleId(String secondSaleId) {
		this.secondSaleId = secondSaleId;
	}

}