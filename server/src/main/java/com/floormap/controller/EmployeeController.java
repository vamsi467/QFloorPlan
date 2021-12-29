package com.floormap.controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floormap.dto.DepartmentDto;
import com.floormap.model.Department;
import com.floormap.model.Employee;
import com.floormap.repository.DepartmentRepository;
import com.floormap.repository.EmployeeRepository;
import com.floormap.service.SequenceGeneratorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@PostMapping("/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		employee.setId(sequenceGeneratorService.generateSequence(Employee.EMPLOYEE_SEQUENCE));
		employeeRepository.save(employee);
		return employee;
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getBooks() {
		List<Employee> employes=	employeeRepository.findAll();
		
		
		for (Employee employe : employes) {
			List<DepartmentDto>  department=employe.getDepartments();
			List<Department> departmentobj=new ArrayList<>();
			List<Long> ids = department.stream()
	                .map(x->Long.valueOf(x.getDepartmentId())).collect(Collectors.toList());
		       for(Long id:ids){
		    	Optional<Department> dp= departmentRepository.findById(id); 
		    	
		    	if(dp.isPresent()) {
		    		Department depEntity = dp.get();
		    		departmentobj.add(depEntity);
		    	} 
		       }
		       employe.setDeptobj(departmentobj);
		}
		
	       
		return employes;
	}
	
}
