package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controller.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	
@Autowired
StudentRepository studentRepository;

public Student saveStudent(Student student) {
	
	return studentRepository.save(student);
	
}

}
