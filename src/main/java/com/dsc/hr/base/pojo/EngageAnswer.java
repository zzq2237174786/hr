package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.sql.Timestamp;



/**
 * The persistent class for the engage_answer database table.
 * 
 */

public class EngageAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	private short ansId;

	private String answerNumber;

	private String examNumber;

	
	private String humanIdcard;


	private String humanName;


	private short interviewId;

	private String majorId;

	private String majorKindId;

	
	private String majorKindName;


	private String majorName;

	
	private short resumeId;

	
	private Timestamp testTime;


	private double totalPoint;

	
	private String useTime;

	public EngageAnswer() {
	}

	public short getAnsId() {
		return this.ansId;
	}

	public void setAnsId(short ansId) {
		this.ansId = ansId;
	}

	public String getAnswerNumber() {
		return this.answerNumber;
	}

	public void setAnswerNumber(String answerNumber) {
		this.answerNumber = answerNumber;
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
	}

	public String getHumanIdcard() {
		return this.humanIdcard;
	}

	public void setHumanIdcard(String humanIdcard) {
		this.humanIdcard = humanIdcard;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public short getInterviewId() {
		return this.interviewId;
	}

	public void setInterviewId(short interviewId) {
		this.interviewId = interviewId;
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

	public short getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(short resumeId) {
		this.resumeId = resumeId;
	}

	public Timestamp getTestTime() {
		return this.testTime;
	}

	public void setTestTime(Timestamp testTime) {
		this.testTime = testTime;
	}

	public double getTotalPoint() {
		return this.totalPoint;
	}

	public void setTotalPoint(double totalPoint) {
		this.totalPoint = totalPoint;
	}

	public String getUseTime() {
		return this.useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

}