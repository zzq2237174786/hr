package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the salary_grant_details database table.
 * 
 */
@Table(name="salary_grant_details")
public class SalaryGrantDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bouns_sum")
	private BigDecimal bounsSum;

	@Column(name="deduct_sum")
	private BigDecimal deductSum;

	@Column(name="grd_id")
	private short grdId;

	@Column(name="human_id")
	private String humanId;

	@Column(name="human_name")
	private String humanName;

	@Column(name="salary_grant_id")
	private String salaryGrantId;

	@Column(name="salary_paid_sum")
	private BigDecimal salaryPaidSum;

	@Column(name="salary_standard_sum")
	private BigDecimal salaryStandardSum;

	@Column(name="sale_sum")
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