package com.example.demo.service;

import com.example.demo.Employee;
import com.example.demo.projection.EmployeeInfo;
import com.example.demo.projection.EmployeeNameDepartmentProjection;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    
    public List<EmployeeNameDepartmentProjection> getEmployeeNamesByDepartment(String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }

    public List<EmployeeInfo> getEmployeeInfoByDepartment(String departmentName) {
        return employeeRepository.findEmployeeInfoByDepartment(departmentName);
    }
}