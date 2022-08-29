package com.example.demo;

import org.springframework.stereotype.Component;

//using this annotation we do not need to use bean.xml file
@Component
public class Employee 
{
	private int emp_id;
	private String emp_name;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public Employee()
	{
		System.out.println("Employee Details :");
	}
	public void print()
	{
		System.out.println("IT Department");
	}

}
