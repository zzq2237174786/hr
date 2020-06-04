package com.dsc.hr.base.pojo;

import java.io.Serializable;


/**
 * The persistent class for the config_file_first_kind database table.
 * 
 */
public class ConfigFileFirstKind implements Serializable {
	private static final long serialVersionUID = 1L;


	private short ffkId;


	private String firstKindId;


	private String firstKindName;


	private String firstKindSalaryId;


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