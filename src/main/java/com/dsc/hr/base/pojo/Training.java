package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the training database table.
 * 
 */
public class Training implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp checkTime;

	private String checker;

	private short checkstatus;

	private String humanId;

	private String humanName;

	private String majorId;

	private String majorKindId;

	private String majorKindName;

	private String majorName;

	private Timestamp registTime;

	private String register;

	private String remark;

	private short traId;

	private String trainingDegree;

	private int trainingHour;

	private String trainingItem;

	private Timestamp trainingTime;

	public Training() {
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

	public short getCheckstatus() {
		return this.checkstatus;
	}

	public void setCheckstatus(short checkstatus) {
		this.checkstatus = checkstatus;
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

	public short getTraId() {
		return this.traId;
	}

	public void setTraId(short traId) {
		this.traId = traId;
	}

	public String getTrainingDegree() {
		return this.trainingDegree;
	}

	public void setTrainingDegree(String trainingDegree) {
		this.trainingDegree = trainingDegree;
	}

	public int getTrainingHour() {
		return this.trainingHour;
	}

	public void setTrainingHour(int trainingHour) {
		this.trainingHour = trainingHour;
	}

	public String getTrainingItem() {
		return this.trainingItem;
	}

	public void setTrainingItem(String trainingItem) {
		this.trainingItem = trainingItem;
	}

	public Timestamp getTrainingTime() {
		return this.trainingTime;
	}

	public void setTrainingTime(Timestamp trainingTime) {
		this.trainingTime = trainingTime;
	}

}