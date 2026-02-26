package com.fdmgroup.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher extends Person {
	
 private String subject;
  @OneToMany(mappedBy = "teacher")
 private List<Course> courses;

 public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
 public Teacher(Long id, String name, String subject) {
		super(id, name);
		this.subject = subject;
	}
 public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
 public String getSubject() {
		return subject;
	}
  	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}	

  	
}
