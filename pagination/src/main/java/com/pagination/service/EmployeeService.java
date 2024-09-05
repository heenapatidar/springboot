package com.pagination.service;

import com.pagination.entity.Employee;
import com.pagination.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Page<Employee> getPaginatedEmployees(int page, int size) {
		return employeeRepository.findAll(PageRequest.of(page, size));
	}
}
