package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the major_change database table.
 * 
 */
@Table(name="major_change")
public class MajorChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="change_reason")
	private String changeReason;

	@Lob
	@Column(name="check_reason")
	private String checkReason;

	@Column(name="check_status")
	private short checkStatus;

	@Column(name="check_time")
	private Timestamp checkTime;

	private String checker;

	@Column(name="first_kind_id")
	private String firstKindId;

	@Column(name="first_kind_name")
	private String firstKindName;

	@Column(name="human_id")
	private String humanId;

	@Column(name="human_name")
	private String humanName;

	@Column(name="major_id")
	private String majorId;

	@Column(name="major_kind_id")
	private String majorKindId;

	@Column(name="major_kind_name")
	private String majorKindName;

	@Column(name="major_name")
	private String majorName;

	@Column(name="mch_id")
	private short mchId;

	@Column(name="new_first_kind_id")
	private String newFirstKindId;

	@Column(name="new_first_kind_name")
	private String newFirstKindName;

	@Column(name="new_major_id")
	private String newMajorId;

	@Column(name="new_major_kind_id")
	private String newMajorKindId;

	@Column(name="new_major_kind_name")
	private String newMajorKindName;

	@Column(name="new_major_name")
	private String newMajorName;

	@Column(name="new_salary_standard_id")
	private String newSalaryStandardId;

	@Column(name="new_salary_standard_name")
	private String newSalaryStandardName;

	@Column(name="new_salary_sum")
	private BigDecimal newSalarySum;

	@Column(name="new_second_kind_id")
	private String newSecondKindId;

	@Column(name="new_second_kind_name")
	private String newSecondKindName;

	@Column(name="new_third_kind_id")
	private String newThirdKindId;

	@Column(name="new_third_kind_name")
	private String newThirdKindName;

	@Column(name="regist_time")
	private Timestamp registTime;

	private String register;

	@Column(name="salary_standard_id")
	private String salaryStandardId;

	@Column(name="salary_standard_name")
	private String salaryStandardName;

	@Column(name="salary_sum")
	private BigDecimal salarySum;

	@Column(name="second_kind_id")
	private String secondKindId;

	@Column(name="second_kind_name")
	private String secondKindName;

	@Column(name="third_kind_id")
	private String thirdKindId;

	@Column(name="third_kind_name")
	private String thirdKindName;

	public MajorChange() {
	}

	public String getChangeReason() {
		return this.changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getCheckReason() {
		return this.checkReason;
	}

	public void setCheckReason(String checkReason) {
		this.checkReason = checkReason;
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

	public String getMajorId() {
		return this.majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String getMajorKindId() {
		return this.majorKindId;
	}

	public void setMajorKindId(String majorKindId) {
		this.majorKindId = majorKindId;
	}

	public String getMajorKindName() {
		return this.majorKindName;
	}

	public void setMajorKindName(String majorKindName) {
		this.majorKindName = majorKindName;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public short getMchId() {
		return this.mchId;
	}

	public void setMchId(short mchId) {
		this.mchId = mchId;
	}

	public String getNewFirstKindId() {
		return this.newFirstKindId;
	}

	public void setNewFirstKindId(String newFirstKindId) {
		this.newFirstKindId = newFirstKindId;
	}

	public String getNewFirstKindName() {
		return this.newFirstKindName;
	}

	public void setNewFirstKindName(String newFirstKindName) {
		this.newFirstKindName = newFirstKindName;
	}

	public String getNewMajorId() {
		return this.newMajorId;
	}

	public void setNewMajorId(String newMajorId) {
		this.newMajorId = newMajorId;
	}

	public String getNewMajorKindId() {
		return this.newMajorKindId;
	}

	public void setNewMajorKindId(String newMajorKindId) {
		this.newMajorKindId = newMajorKindId;
	}

	public String getNewMajorKindName() {
		return this.newMajorKindName;
	}

	public void setNewMajorKindName(String newMajorKindName) {
		this.newMajorKindName = newMajorKindName;
	}

	public String getNewMajorName() {
		return this.newMajorName;
	}

	public void setNewMajorName(String newMajorName) {
		this.newMajorName = newMajorName;
	}

	public String getNewSalaryStandardId() {
		return this.newSalaryStandardId;
	}

	public void setNewSalaryStandardId(String newSalaryStandardId) {
		this.newSalaryStandardId = newSalaryStandardId;
	}

	public String getNewSalaryStandardName() {
		return this.newSalaryStandardName;
	}

	public void setNewSalaryStandardName(String newSalaryStandardName) {
		this.newSalaryStandardName = newSalaryStandardName;
	}

	public BigDecimal getNewSalarySum() {
		return this.newSalarySum;
	}

	public void setNewSalarySum(BigDecimal newSalarySum) {
		this.newSalarySum = newSalarySum;
	}

	public String getNewSecondKindId() {
		return this.newSecondKindId;
	}

	public void setNewSecondKindId(String newSecondKindId) {
		this.newSecondKindId = newSecondKindId;
	}

	public String getNewSecondKindName() {
		return this.newSecondKindName;
	}

	public void setNewSecondKindName(String newSecondKindName) {
		this.newSecondKindName = newSecondKindName;
	}

	public String getNewThirdKindId() {
		return this.newThirdKindId;
	}

	public void setNewThirdKindId(String newThirdKindId) {
		this.newThirdKindId = newThirdKindId;
	}

	public String getNewThirdKindName() {
		return this.newThirdKindName;
	}

	public void setNewThirdKindName(String newThirdKindName) {
		this.newThirdKindName = newThirdKindName;
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

	public String getSalaryStandardId() {
		return this.salaryStandardId;
	}

	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
	}

	public String getSalaryStandardName() {
		return this.salaryStandardName;
	}

	public void setSalaryStandardName(String salaryStandardName) {
		this.salaryStandardName = salaryStandardName;
	}

	public BigDecimal getSalarySum() {
		return this.salarySum;
	}

	public void setSalarySum(BigDecimal salarySum) {
		this.salarySum = salarySum;
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

	public String getThirdKindName() {
		return this.thirdKindName;
	}

	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}

}