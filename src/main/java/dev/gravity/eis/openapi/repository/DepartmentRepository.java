package dev.gravity.eis.openapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dev.gravity.eis.openapi.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
