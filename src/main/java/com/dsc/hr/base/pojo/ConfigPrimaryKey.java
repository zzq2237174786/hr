package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the config_primary_key database table.
 * 
 */
@Table(name="config_primary_key")
public class ConfigPrimaryKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="key_name")
	private String keyName;

	@Column(name="primary_key")
	private String primaryKey;

	@Column(name="primary_key_status")
	private byte primaryKeyStatus;

	@Column(name="primary_key_table")
	private String primaryKeyTable;

	@Column(name="prk_id")
	private short prkId;

	public ConfigPrimaryKey() {
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public byte getPrimaryKeyStatus() {
		return this.primaryKeyStatus;
	}

	public void setPrimaryKeyStatus(byte primaryKeyStatus) {
		this.primaryKeyStatus = primaryKeyStatus;
	}

	public String getPrimaryKeyTable() {
		return this.primaryKeyTable;
	}

	public void setPrimaryKeyTable(String primaryKeyTable) {
		this.primaryKeyTable = primaryKeyTable;
	}

	public short getPrkId() {
		return this.prkId;
	}

	public void setPrkId(short prkId) {
		this.prkId = prkId;
	}

}