package com.vishal.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.EmployeeManagementSystem.entity.Employee;
import com.vishal.EmployeeManagementSystem.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employees){
		return repository.saveAll(employees);
	}
	
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Employee> deleteEmployee(int id){
		repository.deleteById(id);
		return repository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee existingEmp = repository.findById(employee.getId()).orElse(null);
		existingEmp.setName(employee.getName());
		existingEmp.setSalary(employee.getSalary());
		return repository.save(existingEmp);
	}
	
	
}
