package com.studentmicro.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
	
	@Id
	private Long stuRollNo;
	private String stuName;
	private String stuCity;
	private Double stuMarks;

}
