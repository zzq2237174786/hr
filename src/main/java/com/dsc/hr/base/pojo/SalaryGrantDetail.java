package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the salary_grant_details database table.
 * 
 */

public class SalaryGrantDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bounsSum;

	private BigDecimal deductSum;

	private short grdId;

	private String humanId;

	private String humanName;

	private String salaryGrantId;


	private BigDecimal salaryPaidSum;


	private BigDecimal salaryStandardSum;

	private BigDecimal saleSum;

	public SalaryGrantDetail() {
	}

	public BigDecimal getBounsSum() {
		return this.bounsSum;
	}

	public void setBounsSum(BigDecimal bounsSum) {
		this.bounsSum = bounsSum;
	}

	public BigDecimal getDeductSum() {
		return this.deductSum;
	}

	public void setDeductSum(BigDecimal deductSum) {
		this.deductSum = deductSum;
	}

	public short getGrdId() {
		return this.grdId;
	}

	public void setGrdId(short grdId) {
		this.grdId = grdId;
	}

	public String getHumanId() {
		return this.humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getSalaryGrantId() {
		return this.salaryGrantId;
	}

	public void setSalaryGrantId(String salaryGrantId) {
		this.salaryGrantId = salaryGrantId;
	}

	public BigDecimal getSalaryPaidSum() {
		return this.salaryPaidSum;
	}

	public void setSalaryPaidSum(BigDecimal salaryPaidSum) {
		this.salaryPaidSum = salaryPaidSum;
	}

	public BigDecimal getSalaryStandardSum() {
		return this.salaryStandardSum;
	}

	public void setSalaryStandardSum(BigDecimal salaryStandardSum) {
		this.salaryStandardSum = salaryStandardSum;
	}

	public BigDecimal getSaleSum() {
		return this.saleSum;
	}

	public void setSaleSum(BigDecimal saleSum) {
		this.saleSum = saleSum;
	}

}