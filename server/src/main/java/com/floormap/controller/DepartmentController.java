package com.floormap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floormap.model.Department;
import com.floormap.model.Employee;
import com.floormap.repository.DepartmentRepository;
import com.floormap.service.SequenceGeneratorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@PostMapping("/createDepartment")
	public Department createDepartment(@RequestBody Department department) {
		department.setId(sequenceGeneratorService.generateSequence(Department.DEPARTMENT_SEQUENCE));
		departmentRepository.save(department);
		return department;
	}
	
	@GetMapping("/getDepartments")
	public List<Department> getDepartments() {
		return departmentRepository.findAll();
	}

}
