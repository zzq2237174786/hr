package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_file_first_kind database table.
 * 
 */
@Table(name="config_file_first_kind")
public class ConfigFileFirstKind implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ffk_id")
	private short ffkId;

	@Column(name="first_kind_id")
	private String firstKindId;

	@Column(name="first_kind_name")
	private String firstKindName;

	@Lob
	@Column(name="first_kind_salary_id")
	private String firstKindSalaryId;

	@Lob
	@Column(name="first_kind_sale_id")
	private String firstKindSaleId;

	public ConfigFileFirstKind() {
	}

	public short getFfkId() {
		return this.ffkId;
	}

	public void setFfkId(short ffkId) {
		this.ffkId = ffkId;
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

	public String getFirstKindSalaryId() {
		return this.firstKindSalaryId;
	}

	public void setFirstKindSalaryId(String firstKindSalaryId) {
		this.firstKindSalaryId = firstKindSalaryId;
	}

	public String getFirstKindSaleId() {
		return this.firstKindSaleId;
	}

	public void setFirstKindSaleId(String firstKindSaleId) {
		this.firstKindSaleId = firstKindSaleId;
	}

}