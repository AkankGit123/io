package com.rays.io;

import java.io.Serializable;

public class EmployeeSer implements Serializable{
	
	private int id;
	private String fName;
	private String lName;
	private String add;
	private transient String tempValue;
	
	public EmployeeSer() {}

	public EmployeeSer(int id, String fName, String lName, String add) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}

	
	public int getId() {
		return id;
	}

	

	public String getfName() {
		return fName;
	}

	

	public String getlName() {
		return lName;
	}

	

	public String getAdd() {
		return add;
	}

	

	public String getTempValue() {
		return tempValue;
	}

	

}
