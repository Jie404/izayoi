package com.jie.entity;

import java.io.Serializable;

public class Categorys implements Serializable{
	private Integer categoryID;
	private String category_name;
	private String category_desc;
	
	
	public Categorys() {
	}


	
	public Categorys(Integer categoryID, String category_name, String category_desc) {
		super();
		this.categoryID = categoryID;
		this.category_name = category_name;
		this.category_desc = category_desc;
	}

	


public Categorys(String category_name, String category_desc) {
		super();
		this.category_name = category_name;
		this.category_desc = category_desc;
	}



	public Categorys(Integer categoryID, String category_name) {
		super();
		this.categoryID = categoryID;
		this.category_name = category_name;
	}


	public Categorys(String category_name) {
		super();
		this.category_name = category_name;
	}

	public String getCategory_desc() {
		return category_desc;
	}



	public void setCategory_desc(String category_desc) {
		this.category_desc = category_desc;
	}



	public Categorys(Integer categoryID) {
		super();
		this.categoryID = categoryID;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}



	@Override
	public String toString() {
		return "Categorys [categoryID=" + categoryID + ", category_name=" + category_name + ", category_desc="
				+ category_desc + "]";
	}

	
}
