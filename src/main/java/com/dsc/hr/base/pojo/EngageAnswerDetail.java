package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the engage_answer_details database table.
 * 
 */
@Table(name="engage_answer_details")
public class EngageAnswerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="and_id")
	private short andId;

	private String answer;

	@Column(name="answer_number")
	private String answerNumber;

	@Column(name="subject_id")
	private short subjectId;

	public EngageAnswerDetail() {
	}

	public short getAndId() {
		return this.andId;
	}

	public void setAndId(short andId) {
		this.andId = andId;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerNumber() {
		return this.answerNumber;
	}

	public void setAnswerNumber(String answerNumber) {
		this.answerNumber = answerNumber;
	}

	public short getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(short subjectId) {
		this.subjectId = subjectId;
	}

}