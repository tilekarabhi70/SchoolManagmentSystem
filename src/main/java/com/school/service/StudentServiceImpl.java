package com.school.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entity.Student;
import com.school.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> updateStudent(Student student, int id) {
		Optional<Student> existingStudent =studentRepository.findById(id);
		 
		if(existingStudent.isPresent()) {
			Student std=existingStudent.get();
			
			std.setName(std.getName());
			std.setEmail(std.getEmail());
			std.setPhoneNumber(std.getPhoneNumber());
			
			Student updatedStudent=studentRepository.save(std);
			return Optional.of(updatedStudent);
		}
		else {
	        return Optional.empty();
	    } 
	}

	@Override
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
		
	}

}
