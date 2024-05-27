package com.HibernateBank;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name= "EmployeeDetail")
public class EmployeeDetail {

	private String Company_Name;
	private String Employee_Name;
	private String Employee_Id;
	private String Designation;
	private int Salary;

	public EmployeeDetail() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetail(String company_Name, String employee_Name, String employee_Id, String designation,
			int salary) {
		super();
		Company_Name = company_Name;
		Employee_Name = employee_Name;
		Employee_Id = employee_Id;
		Designation = designation;
		Salary = salary;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

	public String getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(String employee_Id) {
		Employee_Id = employee_Id;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetail [Company_Name=" + Company_Name + ", Employee_Name=" + Employee_Name + ", Employee_Id="
				+ Employee_Id + ", Designation=" + Designation + ", Salary=" + Salary + "]";
	}

	
}
