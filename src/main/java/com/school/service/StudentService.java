package com.school.service;

import java.util.List;
import java.util.Optional;

import com.school.entity.Student;

public interface StudentService {

	public Student addStudent(Student student);
	
	public Optional<Student> getStudentById(int id);
	
	public List<Student> getAllStudents();
	
	public Optional< Student> updateStudent(Student student,int id);
	
	public void deleteStudentById(int id);
}
