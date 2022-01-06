package com.example.StudentManagementSys.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentManagementSys.Entities.Student;
import com.example.StudentManagementSys.Services.StudentService_Interface;

@RestController
public class MyController {
	
	@Autowired
	private StudentService_Interface student_Services;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Student Management System application";
	}
	
	@GetMapping("/studentDetails")
	public List<Student> getStudents(){
		return this.student_Services.getStudents();
	}
	
	@GetMapping("/studentDetails/{id}")
	public Optional<Student> getStudent(@PathVariable long id) {
		return this.student_Services.getStudent(id);
	}
	
	@PostMapping("/studentDetails")
	public Student addStudent(@RequestBody Student student) {
		return this.student_Services.addStudent(student);
	}
	
	@PutMapping("/studentDetails")
	public Student updateStudent(@RequestBody Student student) {
		return this.student_Services.updateStudent(student);
	}
	
	@DeleteMapping("/studentDetails/{id}")
	public String removeStudent(@PathVariable long id) {
		return this.student_Services.removeStudent(id);
	}

}
