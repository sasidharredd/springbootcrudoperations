package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="EmployeeNew")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer EmployeeId;
   private String EmployeeName;
   private Double EmployeeSalary;
   private String Desgination;
   
   
public Integer getEmployeeId() {
	return EmployeeId;
}


public String getEmployeeName() {
	return EmployeeName;
}


public Double getEmployeeSalary() {
	return EmployeeSalary;
}


public String getDesgination() {
	return Desgination;
}


public void setEmployeeId(Integer employeeId) {
	EmployeeId = employeeId;
}


public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}


public void setEmployeeSalary(Double employeeSalary) {
	EmployeeSalary = employeeSalary;
}


public void setDesgination(String desgination) {
	Desgination = desgination;
}


@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
			+ EmployeeSalary + ", Desgination=" + Desgination + "]";
}
   
   
   
   
   
   
   
   
   
}
