package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the engage_interview database table.
 * 
 */
@Table(name="engage_interview")
public class EngageInterview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="check_comment")
	private String checkComment;

	@Column(name="check_status")
	private short checkStatus;

	@Column(name="check_time")
	private Timestamp checkTime;

	private String checker;

	@Column(name="ein_id")
	private short einId;

	private String EQ_degree;

	@Column(name="foreign_language_degree")
	private String foreignLanguageDegree;

	@Column(name="human_major_id")
	private String humanMajorId;

	@Column(name="human_major_kind_id")
	private String humanMajorKindId;

	@Column(name="human_major_kind_name")
	private String humanMajorKindName;

	@Column(name="human_major_name")
	private String humanMajorName;

	@Column(name="human_name")
	private String humanName;

	@Column(name="image_degree")
	private String imageDegree;

	@Column(name="interview_amount")
	private short interviewAmount;

	@Lob
	@Column(name="interview_comment")
	private String interviewComment;

	@Column(name="interview_status")
	private short interviewStatus;

	private String IQ_degree;

	@Column(name="multi_quality_degree")
	private String multiQualityDegree;

	@Column(name="native_language_degree")
	private String nativeLanguageDegree;

	@Column(name="registe_time")
	private Timestamp registeTime;

	private String register;

	@Column(name="response_speed_degree")
	private String responseSpeedDegree;

	private String result;

	@Column(name="resume_id")
	private short resumeId;

	public EngageInterview() {
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

	public short getEinId() {
		return this.einId;
	}

	public void setEinId(short einId) {
		this.einId = einId;
	}

	public String getEQ_degree() {
		return this.EQ_degree;
	}

	public void setEQ_degree(String EQ_degree) {
		this.EQ_degree = EQ_degree;
	}

	public String getForeignLanguageDegree() {
		return this.foreignLanguageDegree;
	}

	public void setForeignLanguageDegree(String foreignLanguageDegree) {
		this.foreignLanguageDegree = foreignLanguageDegree;
	}

	public String getHumanMajorId() {
		return this.humanMajorId;
	}

	public void setHumanMajorId(String humanMajorId) {
		this.humanMajorId = humanMajorId;
	}

	public String getHumanMajorKindId() {
		return this.humanMajorKindId;
	}

	public void setHumanMajorKindId(String humanMajorKindId) {
		this.humanMajorKindId = humanMajorKindId;
	}

	public String getHumanMajorKindName() {
		return this.humanMajorKindName;
	}

	public void setHumanMajorKindName(String humanMajorKindName) {
		this.humanMajorKindName = humanMajorKindName;
	}

	public String getHumanMajorName() {
		return this.humanMajorName;
	}

	public void setHumanMajorName(String humanMajorName) {
		this.humanMajorName = humanMajorName;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getImageDegree() {
		return this.imageDegree;
	}

	public void setImageDegree(String imageDegree) {
		this.imageDegree = imageDegree;
	}

	public short getInterviewAmount() {
		return this.interviewAmount;
	}

	public void setInterviewAmount(short interviewAmount) {
		this.interviewAmount = interviewAmount;
	}

	public String getInterviewComment() {
		return this.interviewComment;
	}

	public void setInterviewComment(String interviewComment) {
		this.interviewComment = interviewComment;
	}

	public short getInterviewStatus() {
		return this.interviewStatus;
	}

	public void setInterviewStatus(short interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public String getIQ_degree() {
		return this.IQ_degree;
	}

	public void setIQ_degree(String IQ_degree) {
		this.IQ_degree = IQ_degree;
	}

	public String getMultiQualityDegree() {
		return this.multiQualityDegree;
	}

	public void setMultiQualityDegree(String multiQualityDegree) {
		this.multiQualityDegree = multiQualityDegree;
	}

	public String getNativeLanguageDegree() {
		return this.nativeLanguageDegree;
	}

	public void setNativeLanguageDegree(String nativeLanguageDegree) {
		this.nativeLanguageDegree = nativeLanguageDegree;
	}

	public Timestamp getRegisteTime() {
		return this.registeTime;
	}

	public void setRegisteTime(Timestamp registeTime) {
		this.registeTime = registeTime;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getResponseSpeedDegree() {
		return this.responseSpeedDegree;
	}

	public void setResponseSpeedDegree(String responseSpeedDegree) {
		this.responseSpeedDegree = responseSpeedDegree;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public short getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(short resumeId) {
		this.resumeId = resumeId;
	}

}