package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Railworld_Table")
public class Railworld {
 
	@Id
	private int Employee_id;
	private String company_name;
	private String branch;
	
	@OneToOne
	@JoinColumn(name = "EmployeeWithId")
    private Employee Employee;
	public Railworld() {
		// TODO Auto-generated constructor stub
	}
	public Railworld(int employee_id, String company_name, String branch, com.Hibernate.Employee employee) {
		super();
		Employee_id = employee_id;
		this.company_name = company_name;
		this.branch = branch;
		Employee = employee;
	}
	public int getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Employee getEmployee() {
		return Employee;
	}
	public void setEmployee(Employee employee) {
		Employee = employee;
	}
	@Override
	public String toString() {
		return "Railworld [Employee_id=" + Employee_id + ", company_name=" + company_name + ", branch=" + branch
				+ ", Employee=" + Employee + "]";
	}
	
    
	
}
