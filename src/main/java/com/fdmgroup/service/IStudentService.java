package com.fdmgroup.service;

import java.util.List;

import com.fdmgroup.model.Student;

public interface IStudentService {

	List<Student> findAll();
	Student findById(long id);
	Student save(Student student);
	void deleteById(long id);
	Student updateStudent(Student student);
}
