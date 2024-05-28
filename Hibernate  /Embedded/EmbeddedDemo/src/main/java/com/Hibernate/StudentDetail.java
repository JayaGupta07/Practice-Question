package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Student_Detail")
public class StudentDetail {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	private Certification certificate;

	public StudentDetail() {
		super();
	}

	public StudentDetail(int id, String name, Certification certificate) {
		super();
		this.id = id;
		this.name = name;
		this.certificate = certificate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certification getCertificate() {
		return certificate;
	}

	public void setCertificate(Certification certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", name=" + name + ", certificate=" + certificate + "]";
	}

	public void setCertificate(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
