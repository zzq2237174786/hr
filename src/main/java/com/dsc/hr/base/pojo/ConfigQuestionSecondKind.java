package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_question_second_kind database table.
 * 
 */
@Table(name="config_question_second_kind")
public class ConfigQuestionSecondKind implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="first_kind_id")
	private String firstKindId;

	@Column(name="first_kind_name")
	private String firstKindName;

	@Column(name="qsk_id")
	private short qskId;

	@Column(name="second_kind_id")
	private String secondKindId;

	@Column(name="second_kind_name")
	private String secondKindName;

	public ConfigQuestionSecondKind() {
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

	public short getQskId() {
		return this.qskId;
	}

	public void setQskId(short qskId) {
		this.qskId = qskId;
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