package com.studentmicro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.studentmicro.model.StudentModel;

public interface StudentRepository extends MongoRepository<StudentModel,Long>{

}
