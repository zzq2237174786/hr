package com.dsc.hr.base.pojo;

import java.io.Serializable;



/**
 * The persistent class for the config_major database table.
 * 
 */
public class ConfigMajor implements Serializable {
	private static final long serialVersionUID = 1L;

	private String majorId;

	private String majorKindId;


	private String majorKindName;


	private String majorName;

	
	private short makId;

	private short testAmount;

	public ConfigMajor() {
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

	public short getMakId() {
		return this.makId;
	}

	public void setMakId(short makId) {
		this.makId = makId;
	}

	public short getTestAmount() {
		return this.testAmount;
	}

	public void setTestAmount(short testAmount) {
		this.testAmount = testAmount;
	}

}