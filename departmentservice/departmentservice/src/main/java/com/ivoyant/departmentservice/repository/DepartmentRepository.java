package com.ivoyant.departmentservice.repository;

import com.ivoyant.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
