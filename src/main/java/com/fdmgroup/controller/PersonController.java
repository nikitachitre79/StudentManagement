package com.fdmgroup.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.dto.PersonDto;
import com.fdmgroup.model.Student;
import com.fdmgroup.model.Teacher;
import com.fdmgroup.repository.Teacherrepository;
import com.fdmgroup.service.IStudentService;

@RestController
@RequestMapping
public class PersonController {

    private final IStudentService studentService;
    private final Teacherrepository teacherRepository;

    public PersonController(IStudentService studentService, Teacherrepository teacherRepository) {
        this.studentService = studentService;
        this.teacherRepository = teacherRepository;
    }

    @PostMapping("/persons")
    public ResponseEntity<?> savePersonFromDto(@RequestBody PersonDto dto) {
        if (dto.getPersonType() == null) {
            return ResponseEntity.badRequest().body("personType is required");
        }

        String type = dto.getPersonType().trim().toUpperCase();
        switch (type) {
            case "STUDENT":
                Student student = new Student(dto.getName(), dto.getGrade());
                Student savedStudent = studentService.save(student);
                return ResponseEntity.ok(savedStudent);
            case "TEACHER":
                Teacher teacher = new Teacher(dto.getName(), dto.getSubject());
                Teacher savedTeacher = teacherRepository.save(teacher);
                return ResponseEntity.ok(savedTeacher);
            default:
                return ResponseEntity.badRequest().body("unknown personType: " + dto.getPersonType());
        }
    }
}
