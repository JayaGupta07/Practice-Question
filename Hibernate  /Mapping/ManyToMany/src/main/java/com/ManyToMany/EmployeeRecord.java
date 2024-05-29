package com.ManyToMany;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table(name="EmployeeRecord")
public class EmployeeRecord {

	@Id
	private int Employee_id;
	
	private String Employee_Name;
	@ManyToMany
 	private List<Project> projects;
	
	public EmployeeRecord() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeRecord(int employee_id, String employee_Name, List<Project> projects) {
		super();
		this.Employee_id = employee_id;
		this.Employee_Name = employee_Name;
		this.projects = projects;
	}

	public int getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [Employee_id=" + Employee_id + ", Employee_Name=" + Employee_Name + ", projects=" + projects
				+ "]";
	}
	
	
}
