package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_question_first_kind database table.
 * 
 */
@Table(name="config_question_first_kind")
public class ConfigQuestionFirstKind implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="first_kind_id")
	private String firstKindId;

	@Column(name="first_kind_name")
	private String firstKindName;

	@Column(name="qfk_id")
	private short qfkId;

	public ConfigQuestionFirstKind() {
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

	public short getQfkId() {
		return this.qfkId;
	}

	public void setQfkId(short qfkId) {
		this.qfkId = qfkId;
	}

}