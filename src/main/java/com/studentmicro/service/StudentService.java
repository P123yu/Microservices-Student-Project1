
package com.studentmicro.service;

import org.springframework.stereotype.Service;

import com.studentmicro.model.StudentModel;

@Service
public interface StudentService {
	
	StudentModel getBystudentId(Long studentId);
	StudentModel insert(StudentModel studentModel);

}
