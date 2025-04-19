package com.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.Student;
import com.school.service.StudentServiceImpl;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	private StudentServiceImpl studentServiceImpl;
     @PostMapping
	public ResponseEntity<Student> addStudent( @RequestBody Student student){
		return new  ResponseEntity<Student>(studentServiceImpl.addStudent(student),HttpStatus.CREATED);
	}
     //get Student By Id
     @GetMapping("/{id}")
     public ResponseEntity<Optional<Student>> getStudentById(@PathVariable int id){
    	 Optional<Student> std=studentServiceImpl.getStudentById(id);
    	 return ResponseEntity.ok(std);
     }
     @GetMapping
     public ResponseEntity< List< Student>> getAllstudent(){
    	 List<Student> allStudent=studentServiceImpl.getAllStudents();
    	 return ResponseEntity.ok(allStudent);
     }
     
     @PutMapping("/{id}/update")
     public ResponseEntity<Optional<Student>> updateStudent(@RequestBody  Student student,
    		                                                 @PathVariable int id){
    	 
    	// Optional<Student> std=studentServiceImpl.getStudentById(id);
    	  Optional<Student> std2=studentServiceImpl.updateStudent(student, id);
    	  return ResponseEntity.ok(std2);
    	 
     }
     @DeleteMapping("/delete/{id}")
     public ResponseEntity<String> deleteStudentById(@PathVariable int id){
    	 studentServiceImpl.deleteStudentById(id);
    	 return ResponseEntity.ok("Student Of Given Id "+id+" Delete Succsfully");
     }
	
}
