package com.Hibernate;


import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Certification {

	private String Course;
	private String Duration;
	
	public Certification() {
		super();
	}

	public Certification(String course, String duration) {
		super();
		
		Course = course;
		Duration = duration;
	}



	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	@Override
	public String toString() {
		return "Certification [ Course=" + Course + ", Duration=" + Duration + "]";
	}

}
