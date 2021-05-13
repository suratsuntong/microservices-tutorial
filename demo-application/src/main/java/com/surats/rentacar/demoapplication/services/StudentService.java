package com.surats.rentacar.demoapplication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surats.rentacar.demoapplication.model.Student;
import com.surats.rentacar.demoapplication.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	IStudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
	public Student fetchStudentById(int id) {
		Optional<Student> student=  studentRepository.findById(id);
		
		if(student.isPresent()) {
			return student.get();
		}
		else 
			return null;
	}
	
}
