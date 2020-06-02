package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_public_char database table.
 * 
 */
@Table(name="config_public_char")
public class ConfigPublicChar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="attribute_kind")
	private String attributeKind;

	@Column(name="attribute_name")
	private String attributeName;

	@Column(name="pbc_id")
	private short pbcId;

	public ConfigPublicChar() {
	}

	public String getAttributeKind() {
		return this.attributeKind;
	}

	public void setAttributeKind(String attributeKind) {
		this.attributeKind = attributeKind;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public short getPbcId() {
		return this.pbcId;
	}

	public void setPbcId(short pbcId) {
		this.pbcId = pbcId;
	}

}