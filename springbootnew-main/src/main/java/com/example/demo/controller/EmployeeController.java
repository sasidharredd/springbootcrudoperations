 package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.impl.EmployeeServiceimpl;

@RestController
//@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
    EmployeeServiceimpl EmpSerImp;
	

	@PostMapping("/save")
	
	public Employee SaveEmployee(@Validated @RequestBody Employee employee) {
		Employee status=EmpSerImp.saveEmployee(employee);

        return EmpSerImp.saveEmployee(employee);
		}
	
	@GetMapping("/{id}")
	@ResponseBody
	public  Optional<Employee> getEmployeeById(@PathVariable Integer id){
		Optional<Employee> emp= EmpSerImp.getEmployeeById(id);
		if(emp.isPresent()) {
		System.out.println(	emp.get());
		}else {
			System.out.println("employee data not present with this empid:"+id);
		}
		return emp;
	}
	
	@GetMapping("/gettingAllEmployee")
	@ResponseBody
	public List<Employee> getAllEmployees() {
        return EmpSerImp.getAllEmployees();
    }
	
	 @PutMapping("/update/{id}")
	    public Employee updateEmployee( @RequestBody Employee employee,@PathVariable("id") Integer id) {
	      
	         Employee status=EmpSerImp.UpdateEmployee(employee, id);
	         return  EmpSerImp.UpdateEmployee(employee, id);
	    }

	 @DeleteMapping("/delete/{id}")
	    public String deleteEmployee(@PathVariable Integer id) {
	        EmpSerImp.deleteEmployee(id);
	        System.out.println("One employee deleted succesfully"+id);
	        
	        return "Employee data is deleted sucessfully"+id;

	    }
	
	 
 
}
