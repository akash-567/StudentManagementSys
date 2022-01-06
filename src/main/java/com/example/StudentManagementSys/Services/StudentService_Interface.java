package com.example.StudentManagementSys.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.StudentManagementSys.Entities.Student;

@Service
public interface StudentService_Interface {

	public List<Student> getStudents();

	public Optional<Student> getStudent(long id);

	public Student addStudent(Student student);

	public Student updateStudent(Student student);

	public String removeStudent(long id);
	
	
	
}
