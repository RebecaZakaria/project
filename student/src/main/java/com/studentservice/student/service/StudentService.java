package com.studentservice.student.service;

import com.studentservice.student.VO.Department;
import com.studentservice.student.VO.ResponseTemplateVO;
import com.studentservice.student.entity.Student;
import com.studentservice.student.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "added";
    }

     public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }


    public ResponseTemplateVO getDepartmentById(Integer studentId) {

        log.info("inside getStudentWithDepartment of StudentService");
        ResponseTemplateVO vo= new ResponseTemplateVO();
        Student student = studentRepository.findByStudentId(studentId);

        Department department = restTemplate.getForObject("localhost:8080/department/1" +student.getDepName(),Department.class);

        vo.setStudent(student);
        vo.setDepartment(department);
        System.out.println(vo);
        return vo;
    }
}