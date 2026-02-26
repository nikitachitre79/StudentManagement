package com.fdmgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.model.Teacher;

public interface Teacherrepository extends JpaRepository<Teacher, Long> {

}
