package com.department.department.controller;

import com.department.department.entity.Department;
import com.department.department.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
@AllArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    @PostMapping("/add")
    public String saveDepartment(@RequestBody Department department) {
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("{id}")
    public Department findDepartmentById(@PathVariable("id") Integer id) {
        log.info("inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(id);
    }


}
