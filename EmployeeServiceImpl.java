package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Employee;
import com.greatlearning.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeRepository.findById(id);
		Employee employee=null;
		
		if(result.isPresent()) {
			employee=result.get();
		}
		else {
			throw new RuntimeException("did not find employee id -" +id);
		}
		
		return employee;
	}

	@Override
	public void save(Employee employee) {

		employeeRepository.save(employee);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {

		employeeRepository.deleteById(id);
		// TODO Auto-generated method stub

	}

}
