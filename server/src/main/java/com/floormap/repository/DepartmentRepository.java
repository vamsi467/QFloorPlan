package com.floormap.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.floormap.model.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long>{

	
}
