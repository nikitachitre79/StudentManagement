package com.fdmgroup.service;

import java.util.List;

import com.fdmgroup.model.Course;

public interface ICourseService {

	List<Course> findAll();
	Course findById(long id);
	Course save(Course course);
	void deleteById(long id);
	Course updateCourse(Course course);
}
