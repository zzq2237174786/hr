package com.dsc.hr.base.pojo;

import java.io.Serializable;



/**
 * The persistent class for the engage_exam_details database table.
 * 
 */

public class EngageExamDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private String examNumber;

	
	private short exdId;


	private String firstKindId;


	private String firstKindName;


	private short questionAmount;

	
	private String secondKindId;


	private String secondKindName;

	public EngageExamDetail() {
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
	}

	public short getExdId() {
		return this.exdId;
	}

	public void setExdId(short exdId) {
		this.exdId = exdId;
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

	public short getQuestionAmount() {
		return this.questionAmount;
	}

	public void setQuestionAmount(short questionAmount) {
		this.questionAmount = questionAmount;
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

}