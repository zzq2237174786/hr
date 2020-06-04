package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the salary_standard_details database table.
 * 
 */
public class SalaryStandardDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private short itemId;

	private String itemName;

	private BigDecimal salary;

	private short sdtId;

	private String standardId;

	private String standardName;

	public SalaryStandardDetail() {
	}

	public short getItemId() {
		return this.itemId;
	}

	public void setItemId(short itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public short getSdtId() {
		return this.sdtId;
	}

	public void setSdtId(short sdtId) {
		this.sdtId = sdtId;
	}

	public String getStandardId() {
		return this.standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStandardName() {
		return this.standardName;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}