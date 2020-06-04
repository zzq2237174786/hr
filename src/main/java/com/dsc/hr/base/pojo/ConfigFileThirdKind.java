package com.dsc.hr.base.pojo;

import java.io.Serializable;



/**
 * The persistent class for the config_file_third_kind database table.
 * 
 */
public class ConfigFileThirdKind implements Serializable {
	private static final long serialVersionUID = 1L;

	private String firstKindId;

	private String firstKindName;

	private short ftkId;

	private String secondKindId;

	private String secondKindName;

	private String thirdKindId;

	private String thirdKindIsRetail;

	private String thirdKindName;

	private String thirdKindSaleId;

	public ConfigFileThirdKind() {
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

	public short getFtkId() {
		return this.ftkId;
	}

	public void setFtkId(short ftkId) {
		this.ftkId = ftkId;
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

	public String getThirdKindId() {
		return this.thirdKindId;
	}

	public void setThirdKindId(String thirdKindId) {
		this.thirdKindId = thirdKindId;
	}

	public String getThirdKindIsRetail() {
		return this.thirdKindIsRetail;
	}

	public void setThirdKindIsRetail(String thirdKindIsRetail) {
		this.thirdKindIsRetail = thirdKindIsRetail;
	}

	public String getThirdKindName() {
		return this.thirdKindName;
	}

	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}

	public String getThirdKindSaleId() {
		return this.thirdKindSaleId;
	}

	public void setThirdKindSaleId(String thirdKindSaleId) {
		this.thirdKindSaleId = thirdKindSaleId;
	}

}