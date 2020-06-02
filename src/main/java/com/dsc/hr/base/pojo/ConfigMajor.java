package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_major database table.
 * 
 */
@Table(name="config_major")
public class ConfigMajor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="major_id")
	private String majorId;

	@Column(name="major_kind_id")
	private String majorKindId;

	@Column(name="major_kind_name")
	private String majorKindName;

	@Column(name="major_name")
	private String majorName;

	@Column(name="mak_id")
	private short makId;

	@Column(name="test_amount")
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