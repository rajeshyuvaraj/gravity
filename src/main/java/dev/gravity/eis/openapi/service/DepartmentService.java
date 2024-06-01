package dev.gravity.eis.openapi.service;


import dev.gravity.eis.openapi.entity.Department;
import dev.gravity.eis.openapi.repository.DepartmentRepository;
import dev.gravity.eis.openapi.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Integer id) {
        return departmentRepository.getById(id);
    }
}
