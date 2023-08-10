package com.ivoyant.departmentservice.service;

import com.ivoyant.departmentservice.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
