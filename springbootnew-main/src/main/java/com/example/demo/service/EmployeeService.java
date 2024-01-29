package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

//@Service
public interface EmployeeService {
	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(Integer id);

	public Employee UpdateEmployee(Employee e, Integer empid);

	void deleteEmployee(Integer id);

	public Employee saveEmployee(Employee e);

}
