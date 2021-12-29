package com.floormap.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.floormap.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
