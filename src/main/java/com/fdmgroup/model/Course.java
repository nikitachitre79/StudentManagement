package com.fdmgroup.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

	   @Id
	    @GeneratedValue
	    private Long id;

	    private String courseName;

	    @ManyToOne
	    private Teacher teacher;
	    
	    @ManyToMany(mappedBy = "courses")
	    private List<Student> students;
	    
	    public Course() {
	        super();
	    }
	    public Course(Long id, String courseName, Teacher teacher) {
	        super();
	        this.id = id;
	        this.courseName = courseName;
	        this.teacher = teacher;
	    }
	    
	    public Course(String courseName, Teacher teacher) {
	        super();
	        this.courseName = courseName;
	        this.teacher = teacher;
	    }
	    public Course(String courseName ) {
	        super();
	        this.courseName = courseName;
	      
	    }
	    
	    public Long getId() {
	        return id;
	    }
	    	
	    public void setId(Long id) {
	        this.id = id;
	    }
	    public String getCourseName() {
	        return courseName;
	    }
	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }
	    public Teacher getTeacher() {
	        return teacher;
	    }
	    public void setTeacher(Teacher teacher) {
	        this.teacher = teacher;
	    }
		public List<Student> getStudents() {
			return students;
		}
		public void setStudents(List<Student> students) {
			this.students = students;
		}
	    
	    
}
