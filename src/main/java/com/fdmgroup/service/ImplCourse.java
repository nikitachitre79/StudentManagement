package com.fdmgroup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.model.Course;
import com.fdmgroup.model.Student;
import com.fdmgroup.model.StudentProfile;
import com.fdmgroup.repository.CourseRepository;
 
@Service
public class ImplCourse implements ICourseService {
	private CourseRepository courserepository;
	
	public ImplCourse(CourseRepository courserepository) {
		super();
		this.courserepository = courserepository;
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return courserepository.findAll();
	}

	@Override
	public Course findById(long id) {
		// TODO Auto-generated method stub
		return courserepository.findById(id).orElse(null);
	}

	@Override
	public Course save(Course course) {
		// TODO Auto-generated method stub
		return courserepository.save(course);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		courserepository.deleteById(id);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courserepository.save(course);
	}
	

}
