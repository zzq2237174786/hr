package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bonus database table.
 * 
 */
public class Bonus implements Serializable {
	private static final long serialVersionUID = 1L;


	private short bonId;


	private String bonusDegree;


	private String bonusItem;

	private BigDecimal bonusWorth;


	private short checkStatus;

	
	private Timestamp checkTime;

	private String checker;


	private String humanId;


	private String humanName;


	private String majorId;

	
	private String majorKindId;

	private String majorKindName;


	private String majorName;


	private Timestamp registTime;

	private String register;

	private Object remark;

	public Bonus() {
	}

	public short getBonId() {
		return this.bonId;
	}

	public void setBonId(short bonId) {
		this.bonId = bonId;
	}

	public String getBonusDegree() {
		return this.bonusDegree;
	}

	public void setBonusDegree(String bonusDegree) {
		this.bonusDegree = bonusDegree;
	}

	public String getBonusItem() {
		return this.bonusItem;
	}

	public void setBonusItem(String bonusItem) {
		this.bonusItem = bonusItem;
	}

	public BigDecimal getBonusWorth() {
		return this.bonusWorth;
	}

	public void setBonusWorth(BigDecimal bonusWorth) {
		this.bonusWorth = bonusWorth;
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

	public Object getRemark() {
		return this.remark;
	}

	public void setRemark(Object remark) {
		this.remark = remark;
	}

}