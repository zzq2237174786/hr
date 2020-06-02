package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the salary_grant database table.
 * 
 */
@Table(name="salary_grant")
public class SalaryGrant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="check_status")
	private short checkStatus;

	@Column(name="check_time")
	private Timestamp checkTime;

	private String checker;

	@Column(name="first_kind_id")
	private String firstKindId;

	@Column(name="first_kind_name")
	private String firstKindName;

	@Column(name="human_amount")
	private short humanAmount;

	@Column(name="regist_time")
	private Timestamp registTime;

	private String register;

	@Column(name="salary_grant_id")
	private String salaryGrantId;

	@Column(name="salary_paid_sum")
	private BigDecimal salaryPaidSum;

	@Column(name="salary_standard_id")
	private String salaryStandardId;

	@Column(name="salary_standard_sum")
	private BigDecimal salaryStandardSum;

	@Column(name="second_kind_id")
	private String secondKindId;

	@Column(name="second_kind_name")
	private String secondKindName;

	@Column(name="sgr_id")
	private short sgrId;

	@Column(name="third_kind_id")
	private String thirdKindId;

	@Column(name="third_kind_name")
	private String thirdKindName;

	public SalaryGrant() {
	}

	public short getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(short checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
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

	public short getHumanAmount() {
		return this.humanAmount;
	}

	public void setHumanAmount(short humanAmount) {
		this.humanAmount = humanAmount;
	}

	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
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

	public String getSalaryStandardId() {
		return this.salaryStandardId;
	}

	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
	}

	public BigDecimal getSalaryStandardSum() {
		return this.salaryStandardSum;
	}

	public void setSalaryStandardSum(BigDecimal salaryStandardSum) {
		this.salaryStandardSum = salaryStandardSum;
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

	public short getSgrId() {
		return this.sgrId;
	}

	public void setSgrId(short sgrId) {
		this.sgrId = sgrId;
	}

	public String getThirdKindId() {
		return this.thirdKindId;
	}

	public void setThirdKindId(String thirdKindId) {
		this.thirdKindId = thirdKindId;
	}

	public String getThirdKindName() {
		return this.thirdKindName;
	}

	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}

}