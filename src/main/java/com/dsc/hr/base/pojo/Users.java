package com.dsc.hr.base.pojo;

import java.io.Serializable;


/**
 * The persistent class for the users database table.
 * 
 */
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	private short uId;

	private String uName;

	private String uPassword;

	private String uTrueName;

	public Users() {
	}

	public short getUId() {
		return this.uId;
	}

	public void setUId(short uId) {
		this.uId = uId;
	}

	public String getUName() {
		return this.uName;
	}

	public void setUName(String uName) {
		this.uName = uName;
	}

	public String getUPassword() {
		return this.uPassword;
	}

	public void setUPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getUTrueName() {
		return this.uTrueName;
	}

	public void setUTrueName(String uTrueName) {
		this.uTrueName = uTrueName;
	}

}