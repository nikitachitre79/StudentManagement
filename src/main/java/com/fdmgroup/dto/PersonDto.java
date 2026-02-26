package com.fdmgroup.dto;

import java.util.List;
import java.util.Objects;

public class PersonDto {

    private Long id;
    private String name;
    private String personType; // e.g. "STUDENT" or "TEACHER"

    // Student-specific
    private String grade;
    private Long studentProfileId;
    private List<Long> courseIdsForStudent;

    // Teacher-specific
    private String subject;
    private List<Long> courseIdsForTeacher;

    public PersonDto() {
    }

    public PersonDto(Long id, String name, String personType) {
        this.id = id;
        this.name = name;
        this.personType = personType;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getStudentProfileId() {
        return studentProfileId;
    }

    public void setStudentProfileId(Long studentProfileId) {
        this.studentProfileId = studentProfileId;
    }

    public List<Long> getCourseIdsForStudent() {
        return courseIdsForStudent;
    }

    public void setCourseIdsForStudent(List<Long> courseIdsForStudent) {
        this.courseIdsForStudent = courseIdsForStudent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Long> getCourseIdsForTeacher() {
        return courseIdsForTeacher;
    }

    public void setCourseIdsForTeacher(List<Long> courseIdsForTeacher) {
        this.courseIdsForTeacher = courseIdsForTeacher;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseIdsForStudent, courseIdsForTeacher, grade, id, name, personProfileIdAsString(studentProfileId), personType, subject);
    }

    private static String personProfileIdAsString(Long id) {
        return id == null ? null : id.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PersonDto other = (PersonDto) obj;
        return Objects.equals(courseIdsForStudent, other.courseIdsForStudent)
                && Objects.equals(courseIdsForTeacher, other.courseIdsForTeacher)
                && Objects.equals(grade, other.grade)
                && Objects.equals(id, other.id)
                && Objects.equals(name, other.name)
                && Objects.equals(studentProfileId, other.studentProfileId)
                && Objects.equals(personType, other.personType)
                && Objects.equals(subject, other.subject);
    }

}
