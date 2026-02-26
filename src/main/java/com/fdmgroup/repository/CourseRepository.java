package com.fdmgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
