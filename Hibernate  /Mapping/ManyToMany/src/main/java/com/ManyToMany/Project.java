package com.ManyToMany;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int Project_Id;
	private String ProjectName;
	
	@ManyToMany
	private List<EmployeeRecord> Employees;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int project_Id, String projectName, List<EmployeeRecord> employees) {
		super();
		Project_Id = project_Id;
		ProjectName = projectName;
		this.Employees = employees;
	}

	public int getProject_Id() {
		return Project_Id;
	}

	public void setProject_Id(int project_Id) {
		Project_Id = project_Id;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public List<EmployeeRecord> getEmployees() {
		return Employees;
	}

	public void setEmployees(List<EmployeeRecord> employees) {
		this.Employees = employees;
	}

	@Override
	public String toString() {
		return "Project [Project_Id=" + Project_Id + ", ProjectName=" + ProjectName + ", Employees=" + Employees + "]";
	}
	
	
}
