package com.fdmgroup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.model.Student;
import com.fdmgroup.service.IStudentService;
import com.fdmgroup.dto.PersonDto;

@RestController
@RequestMapping("/students")
public class StudentController {

	private IStudentService studentService;

	public StudentController(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	  @PostMapping
	    public Student saveStudent(@RequestBody Student student) {
	        return studentService.save(student);
	    }
	  @GetMapping("/{id}")
	    public Student getStudent(@PathVariable Long id) {
	        return studentService.findById(id);
	    }

	@PostMapping("/from-dto")
	public Student saveStudentFromDto(@RequestBody PersonDto dto) {
		Student student = new Student(dto.getName(), dto.getGrade());
		return studentService.save(student);
	}
}