//package com.fdmgroup.controller;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fdmgroup.dto.PersonDto;
//import com.fdmgroup.model.Student;
//import com.fdmgroup.model.Teacher;
//import com.fdmgroup.repository.Studentrepository;
//import com.fdmgroup.repository.Teacherrepository;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class PersonControllerIntegrationTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    private Studentrepository studentRepository;
//
//    @Autowired
//    private Teacherrepository teacherRepository;
//
//    @BeforeEach
//    void setUp() {
//        studentRepository.deleteAll();
//        teacherRepository.deleteAll();
//    }
//
//    @Test
//    void whenPostStudentDto_thenStudentSaved() throws Exception {
//        PersonDto dto = new PersonDto();
//        dto.setPersonType("STUDENT");
//        dto.setName("Dto Student");
//        dto.setGrade("A");
//
//        mockMvc.perform(post("/persons")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(dto)))
//                .andExpect(status().isOk());
//
//        List<Student> students = studentRepository.findAll();
//        assertThat(students).hasSize(1);
//        Student s = students.get(0);
//        assertThat(s.getName()).isEqualTo("Dto Student");
//        assertThat(s.getGrade()).isEqualTo("A");
//    }
//
//    @Test
//    void whenPostTeacherDto_thenTeacherSaved() throws Exception {
//        PersonDto dto = new PersonDto();
//        dto.setPersonType("TEACHER");
//        dto.setName("Dto Teacher");
//        dto.setSubject("Math");
//
//        mockMvc.perform(post("/persons")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(dto)))
//                .andExpect(status().isOk());
//
//        List<Teacher> teachers = teacherRepository.findAll();
//        assertThat(teachers).hasSize(1);
//        Teacher t = teachers.get(0);
//        assertThat(t.getName()).isEqualTo("Dto Teacher");
//        assertThat(t.getSubject()).isEqualTo("Math");
//    }
//}
