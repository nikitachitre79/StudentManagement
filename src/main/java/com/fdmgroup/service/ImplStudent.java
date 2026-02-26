package com.fdmgroup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.model.Student;
import com.fdmgroup.model.StudentProfile;
import com.fdmgroup.repository.Studentrepository;
@Service
public class ImplStudent implements IStudentService {
	private Studentrepository studentrepository;
	
	public ImplStudent(Studentrepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id).orElse(null);
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		StudentProfile sf = student.getStudentProfile();
		if (sf != null) {
			sf.setStudent(student);
		}
		return studentrepository.save(student);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		studentrepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}	

}
