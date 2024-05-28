package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Email")
public class Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String email;
	

	public Info() {
		// TODO Auto-generated constructor stub
	}

	public Info(String email) {
		super();
		this.id = id;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", email=" + email + "]";
	}

}