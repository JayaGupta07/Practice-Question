package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Student")
public class Student {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int Id;
	    private String name;
		public Student(int id, String name) {
			super();
			Id = id;
			this.name = name;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [Id=" + Id + ", name=" + name + "]";
		}
}


	
