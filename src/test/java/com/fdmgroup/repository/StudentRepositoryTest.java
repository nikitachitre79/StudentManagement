//package com.fdmgroup.repository;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
//
//import com.fdmgroup.dto.PersonDto;
//import com.fdmgroup.model.Student;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.FlushModeType;
//
//@DataJpaTest
//class StudentRepositoryTest {
//	@Autowired
//	EntityManager em;
//    private Studentrepository studentRepository;
//
//    @Autowired
//    public StudentRepositoryTest(Studentrepository studentRepository) {
//		super();
//		this.studentRepository = studentRepository;
//	}
//
//
//	@Test
//    void whenSaveStudent_thenIdGeneratedAndStudentFound() {
////		em.setFlushMode(FlushModeType.COMMIT);
//		PersonDto dto = new PersonDto();
//		dto.setPersonType("Student");
//		dto.setName("Test Student");
//		dto.setGrade("B");	
//		Student student = null;
//		if ("Student".equals(dto.getPersonType())) {
//			 student = new Student(dto.getName(), dto.getGrade());
//		}
//
//        Student saved = studentRepository.save(student);
//        em.flush();   // forces INSERT
//        em.clear();
//        System.out.println("Saved Student ID: " + saved.getId());
//        assertTrue(studentRepository.existsById(saved.getId()));
//        
//    }
//}