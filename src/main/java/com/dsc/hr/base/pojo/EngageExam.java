package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the engage_exam database table.
 * 
 */

public class EngageExam implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private short exaId;

	
	private String examNumber;


	private short limiteTime;

	
	private String majorId;


	private String majorKindId;


	private String majorKindName;


	private String majorName;


	private Timestamp registTime;

	private String register;

	public EngageExam() {
	}

	public short getExaId() {
		return this.exaId;
	}

	public void setExaId(short exaId) {
		this.exaId = exaId;
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
	}

	public short getLimiteTime() {
		return this.limiteTime;
	}

	public void setLimiteTime(short limiteTime) {
		this.limiteTime = limiteTime;
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

}