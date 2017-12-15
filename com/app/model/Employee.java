package com.app.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int empid;
	private List<String> skills=new ArrayList<>();
	private Company comp;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Company getComp() {
		return comp;
	}
	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", skills=" + skills + ", comp=" + comp + "]";
	}
	
	

}
