package com.example.StudentManagementSys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentManagementSys.Entities.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
