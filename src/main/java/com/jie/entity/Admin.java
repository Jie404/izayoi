package com.jie.entity;

import java.util.Date;

public class Admin {
	private Integer admin_id;
	private String admin_name;
	private String admin_password;
	private String date;

	private Date dddd;

	public Date getDddd() {
		return dddd;
	}

	public void setDddd(Date dddd) {
		this.dddd = dddd;
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(String admin_name, String admin_password) {
		super();
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}
	

	public Admin(Integer admin_id, String admin_name, String admin_password, String date) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
		this.date = date;
	}
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_password=" + admin_password
				+ ", date=" + date + "]";
	}
	
}
