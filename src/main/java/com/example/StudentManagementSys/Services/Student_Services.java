package com.example.StudentManagementSys.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagementSys.Entities.Student;
import com.example.StudentManagementSys.dao.StudentDao;

@Service
public class Student_Services implements StudentService_Interface{
	
	@Autowired 
	private StudentDao studentDao;

	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Optional<Student> getStudent(long id) {
		return studentDao.findById(id);
	}

	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public String removeStudent(long id) {
		studentDao.deleteById(id);
		return "Student Data Removed";
	}
}
