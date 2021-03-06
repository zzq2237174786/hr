package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the salary_standard database table.
 * 
 */
public class SalaryStandard implements Serializable {
	private static final long serialVersionUID = 1L;

	private short changeStatus;

	private Timestamp changeTime;

	private String changer;

	private String checkComment;

	private short checkStatus;

	private Timestamp checkTime;

	private String checker;

	private String designer;

	private Timestamp registTime;

	private String register;

	private String remark;

	private BigDecimal salarySum;

	private short ssdId;

	private String standardId;

	private String standardName;

	public SalaryStandard() {
	}

	public short getChangeStatus() {
		return this.changeStatus;
	}

	public void setChangeStatus(short changeStatus) {
		this.changeStatus = changeStatus;
	}

	public Timestamp getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public String getCheckComment() {
		return this.checkComment;
	}

	public void setCheckComment(String checkComment) {
		this.checkComment = checkComment;
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

	public String getDesigner() {
		return this.designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getSalarySum() {
		return this.salarySum;
	}

	public void setSalarySum(BigDecimal salarySum) {
		this.salarySum = salarySum;
	}

	public short getSsdId() {
		return this.ssdId;
	}

	public void setSsdId(short ssdId) {
		this.ssdId = ssdId;
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