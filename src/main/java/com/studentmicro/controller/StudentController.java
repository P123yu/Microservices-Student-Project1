package com.studentmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmicro.model.StudentModel;
import com.studentmicro.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/getByStudentId/{studentId}")
	public ResponseEntity<?>getBystudentId(@PathVariable Long studentId){
		StudentModel student=studentServiceImpl.getBystudentId(studentId);
		if(student!=null) {
			return ResponseEntity.ok(student);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found student based on given studentId");
		}
	}
	
	
	@PostMapping("/post")
	public ResponseEntity<String>insert(@RequestBody StudentModel studentModel){
		StudentModel student=studentServiceImpl.insert(studentModel);
		if(student!=null) {
			return ResponseEntity.ok("inserted");
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found student based on given studentId");
		}
	}
	
	
	

}
