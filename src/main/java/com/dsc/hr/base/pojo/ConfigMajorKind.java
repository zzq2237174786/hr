package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_major_kind database table.
 * 
 */
@Table(name="config_major_kind")
public class ConfigMajorKind implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="major_kind_id")
	private String majorKindId;

	@Column(name="major_kind_name")
	private String majorKindName;

	@Column(name="mfk_id")
	private short mfkId;

	public ConfigMajorKind() {
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

	public short getMfkId() {
		return this.mfkId;
	}

	public void setMfkId(short mfkId) {
		this.mfkId = mfkId;
	}

}