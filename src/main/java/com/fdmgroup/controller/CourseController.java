package com.fdmgroup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.model.Course;
import com.fdmgroup.service.ICourseService;
 

@RestController
@RequestMapping("/courses")
public class CourseController {

	private ICourseService courseService;

	public CourseController(ICourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	  @PostMapping
	    public Course saveCourse(@RequestBody Course course) {
	        return courseService.save(course);
	    }
	  @GetMapping("/{id}")
	    public Course getCourse(@PathVariable Long id) {
	        return courseService.findById(id);
	    }
//	  @PostMapping("/assigncourse/{studentId}/{courseId}")
//	    public Course assignCourseToStudent(@PathVariable Long studentId,@PathVariable Long courseId) {
//	        // Implementation to assign course to student goes here
//	        return courseService.save(course);
//	    }
}
