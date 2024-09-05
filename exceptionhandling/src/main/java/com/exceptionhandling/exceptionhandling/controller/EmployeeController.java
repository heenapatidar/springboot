package com.exceptionhandling.exceptionhandling.controller;

import com.exceptionhandling.exceptionhandling.exception.ResourceNotFoundException;
import com.exceptionhandling.exceptionhandling.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private static Map<Long, Employee> employeeRepository = new HashMap<>();
    
    static {
        employeeRepository.put(1L, new Employee(1L, "John", "Doe"));
        employeeRepository.put(2L, new Employee(2L, "Jane", "Smith"));
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        Employee employee = employeeRepository.get(id);
        if (employee == null) {
            throw new ResourceNotFoundException("Employee not found with id: " + id);
        }
        return employee;
    }
}
