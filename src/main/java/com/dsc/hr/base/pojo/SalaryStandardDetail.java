package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the salary_standard_details database table.
 * 
 */
@Table(name="salary_standard_details")
public class SalaryStandardDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="item_id")
	private short itemId;

	@Column(name="item_name")
	private String itemName;

	private BigDecimal salary;

	@Column(name="sdt_id")
	private short sdtId;

	@Column(name="standard_id")
	private String standardId;

	@Column(name="standard_name")
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