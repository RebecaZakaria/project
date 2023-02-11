package com.department.department.service;

import com.department.department.entity.Department;
import com.department.department.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DepartmentService {
    @Autowired
    private final DepartmentRepository departmentRepository;

    public String saveDepartment(Department department) {
        departmentRepository.save(department);
        return "new data added";
    }

    public Department findDepartmentById(Integer depId) {
        log.info("inside savaDepartment of DepartmentService");
        return departmentRepository.findById(depId).orElseThrow(null);
    }
    public List<Department> getAllDepartment()
    {
        return departmentRepository.findAll();
    }
}
