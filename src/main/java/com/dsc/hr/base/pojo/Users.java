package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the users database table.
 * 
 */
@Table(name="users")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="u_id")
	private short uId;

	@Column(name="u_name")
	private String uName;

	@Column(name="u_password")
	private String uPassword;

	@Column(name="u_true_name")
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