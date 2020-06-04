package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the salary_grant database table.
 * 
 */
public class SalaryGrant implements Serializable {
	private static final long serialVersionUID = 1L;

	private short checkStatus;

	private Timestamp checkTime;

	private String checker;

	private String firstKindId;

	private String firstKindName;

	private short humanAmount;

	private Timestamp registTime;

	private String register;

	private String salaryGrantId;

	private BigDecimal salaryPaidSum;

	private String salaryStandardId;

	private BigDecimal salaryStandardSum;

	private String secondKindId;

	private String secondKindName;

	private short sgrId;

	private String thirdKindId;

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