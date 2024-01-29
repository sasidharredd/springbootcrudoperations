package com.example.demo.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceimpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository EmpRep;

	@Transactional
	public List<Employee> getAllEmployees() {
		return EmpRep.findAll();
	}

	@Transactional
	public Optional<Employee> getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return EmpRep.findById(id);
	}

//	@Override
//	public Employee saveEmployee(Employee employee) {
//		return EmpRep.save(employee);
//	}

	@Transactional
	public void deleteEmployee(Integer id) {
		EmpRep.deleteById(id);
		
	}

	@Transactional
public Employee saveEmployee(Employee e) {
	 
		return EmpRep.save(e);
	 
}

	@Override
	public Employee UpdateEmployee(Employee e,Integer empid) {
		Employee emp=EmpRep.findById(empid).get();
		System.out.println(emp);
		if(Objects.nonNull(e.getEmployeeName())&&!" ".equalsIgnoreCase(e.getEmployeeName())) {
			emp.setEmployeeName(e.getEmployeeName());
			
		}
		if(Objects.nonNull(e.getDesgination())&&!" ".equalsIgnoreCase(e.getDesgination())) {
			emp.setEmployeeName(e.getEmployeeName());
		}
		if (Objects.nonNull(e.getEmployeeSalary()) && e.getEmployeeSalary() != 0.0) {
		
			emp.setEmployeeName(e.getEmployeeName());
			
		}
		return EmpRep.save(emp);
	}

	
}
