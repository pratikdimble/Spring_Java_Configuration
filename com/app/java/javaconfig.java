package com.app.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.model.Company;
import com.app.model.Employee;
@Configuration
public class javaconfig {
	@Bean
	public Employee emp() {
		Employee empobj=new Employee();
		empobj.setEmpid(111);
		List<String>skills=new ArrayList<>();
		skills.add("Java");		skills.add("Hibernate");	skills.add("Spring");
		empobj.setSkills(skills);
		empobj.setComp(mycomp());
		return empobj;
	}	// Employee bean
	
	@Bean
	public Company mycomp() {
		Company compobj=new Company();
			compobj.setCompid(111);
			compobj.setSalary(50000.0f);
			Properties prop=new Properties();
			prop.put("Testing","Development");
			compobj.setDept(prop);
			return compobj;
	}	//company bean
}//class
