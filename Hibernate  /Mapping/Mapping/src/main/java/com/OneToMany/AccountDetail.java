package com.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AccountDetail")
public class AccountDetail {

	@Id
	private long AccountNo;
	private String BankName;
	private String BranchName;
	
	@ManyToOne
	private PersonDetail person_detail;
	
	public AccountDetail() {
		// TODO Auto-generated constructor stub
	}

	public AccountDetail(long accountNo, String bankName, String branchName, PersonDetail person_detail) {
		super();
		AccountNo = accountNo;
		BankName = bankName;
		BranchName = branchName;
		this.person_detail = person_detail;
	}

	public long getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public PersonDetail getPerson_detail() {
		return person_detail;
	}

	public void setPerson_detail(PersonDetail person_detail) {
		this.person_detail = person_detail;
	}

	@Override
	public String toString() {
		return "AccountDetail [AccountNo=" + AccountNo + ", BankName=" + BankName + ", BranchName=" + BranchName
				+ ", person_detail=" + person_detail + "]";
	}
	
	
	
}
