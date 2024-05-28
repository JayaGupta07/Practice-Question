package com.HibernateBank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BankDetail")
public class BankDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String BankName;
	private String IFSC_Code;
	private String BranchName;
	
	private EmployeeDetail EmployeeDetail;
	
	public BankDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankDetail(int id, String bankName, String iFSC_Code, String branchName,
			com.HibernateBank.EmployeeDetail employeeDetail) {
		super();
		this.id = id;
		BankName = bankName;
		IFSC_Code = iFSC_Code;
		BranchName = branchName;
		EmployeeDetail = employeeDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getIFSC_Code() {
		return IFSC_Code;
	}

	public void setIFSC_Code(String iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public EmployeeDetail getEmployeeDetail() {
		return EmployeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		EmployeeDetail = employeeDetail;
	}

	@Override
	public String toString() {
		return "BankDetail [id=" + id + ", BankName=" + BankName + ", IFSC_Code=" + IFSC_Code + ", BranchName="
				+ BranchName + ", EmployeeDetail=" + EmployeeDetail + "]";
	}

	

}
