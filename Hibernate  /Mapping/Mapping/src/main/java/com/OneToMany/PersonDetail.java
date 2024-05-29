package com.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PersonTable")
public class PersonDetail {

	@Id
	private long AadharCardNo;
	private String Name;
	
	@OneToMany(mappedBy = "person_detail")
	private List<AccountDetail> account_detail;

	public PersonDetail() {
		// TODO Auto-generated constructor stub
	}

	public PersonDetail(long aadharCardNo, String name, List<AccountDetail> account_detail) {
		super();
		AadharCardNo = aadharCardNo;
		Name = name;
		this.account_detail = account_detail;
	}

	public long getAadharCardNo() {
		return AadharCardNo;
	}

	public void setAadharCardNo(long aadharCardNo) {
		AadharCardNo = aadharCardNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<AccountDetail> getAccount_detail() {
		return account_detail;
	}

	public void setAccount_detail(List<AccountDetail> account_detail) {
		this.account_detail = account_detail;
	}

	@Override
	public String toString() {
		return "PersonDetail [AadharCardNo=" + AadharCardNo + ", Name=" + Name + ", account_detail=" + account_detail
				+ "]";
	}
	
	
}
