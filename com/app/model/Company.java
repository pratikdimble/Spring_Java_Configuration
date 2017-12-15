package com.app.model;

import java.util.Properties;

public class Company {
	private int compid;
	private Properties dept=new Properties();
	private float salary;
	public int getCompid() {
		return compid;
	}
	public void setCompid(int compid) {
		this.compid = compid;
	}
	public Properties getDept() {
		return dept;
	}
	public void setDept(Properties dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n\tCompany [compid=" + compid + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
}
