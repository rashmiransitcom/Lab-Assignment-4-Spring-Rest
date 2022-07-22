package com.greatlearning.service;

import java.util.List;

import com.greatlearning.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public void save(Employee employee);

	public void deleteById(int id);

	public Employee findById(int employeeId);

}
