package com.fdmgroup.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue("Student")
public class Student extends Person {
	
 private String grade;
@JsonManagedReference
 @OneToOne(mappedBy = "student", cascade = jakarta.persistence.CascadeType.ALL)
 private StudentProfile studentProfile;
 
 @ManyToMany 
 
 @JoinTable(
	        name = "student_course",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "course_id")
	    )
 private List<Course> courses;
 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
 public Student(Long id, String name, String grade) {
		super(id, name);
		this.grade = grade;
	}
 public Student(String name, String grade) {
		super(name);
		this.grade = grade;
	}
 public String getGrade() {
		return grade;
	}
 	public void setGrade(String grade) {
		this.grade = grade;
	}
	public StudentProfile getStudentProfile() {
		return studentProfile;
	}
	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
 	
}
