package com.dsc.hr.base.pojo;

import java.io.Serializable;



/**
 * The persistent class for the config_primary_key database table.
 * 
 */

public class ConfigPrimaryKey implements Serializable {
	private static final long serialVersionUID = 1L;

	private String keyName;

	private String primaryKey;

	
	private byte primaryKeyStatus;

	
	private String primaryKeyTable;

	
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