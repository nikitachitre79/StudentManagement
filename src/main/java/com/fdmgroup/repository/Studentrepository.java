package com.fdmgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.model.Student;

public interface Studentrepository extends JpaRepository<Student, Long> {

}
