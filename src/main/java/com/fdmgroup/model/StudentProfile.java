package com.fdmgroup.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StudentProfile {
	
	@Id
	@GeneratedValue
	private Long id;
	private String address;
	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	public StudentProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentProfile(Long id, String address, Student student) {
		super();
		this.id = id;
		this.address = address;
		this.student = student;
	}
		
	public StudentProfile(String address, Student student) {
		super();
		this.address = address;
		this.student = student;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
