package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_file_second_kind database table.
 * 
 */
@Table(name="config_file_second_kind")
public class ConfigFileSecondKind implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="first_kind_id")
	private String firstKindId;

	@Column(name="first_kind_name")
	private String firstKindName;

	@Column(name="fsk_id")
	private short fskId;

	@Column(name="second_kind_id")
	private String secondKindId;

	@Column(name="second_kind_name")
	private String secondKindName;

	@Lob
	@Column(name="second_salary_id")
	private String secondSalaryId;

	@Lob
	@Column(name="second_sale_id")
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