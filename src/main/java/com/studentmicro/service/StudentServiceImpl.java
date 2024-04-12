
package com.studentmicro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmicro.model.StudentModel;
import com.studentmicro.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentModel getBystudentId(Long studentId) {
		StudentModel student=studentRepository.findById(studentId).orElse(null);
		return student;
	}

	@Override
	public StudentModel insert(StudentModel studentModel) {
		StudentModel student=studentRepository.save(studentModel);
		return student;
	}

}
