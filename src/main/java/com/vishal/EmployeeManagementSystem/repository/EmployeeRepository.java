package com.vishal.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.EmployeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
