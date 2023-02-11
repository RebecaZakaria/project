package com.studentservice.student.controller;


import com.studentservice.student.VO.Department;
import com.studentservice.student.VO.ResponseTemplateVO;
import com.studentservice.student.entity.Student;
import com.studentservice.student.repository.StudentRepository;
import com.studentservice.student.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@Slf4j
@AllArgsConstructor

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public String saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getDepartmentById(@PathVariable("id") Integer studentId){

       return studentService.getDepartmentById(studentId);
   }
}