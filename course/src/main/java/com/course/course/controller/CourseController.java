package com.course.course.controller;

import com.course.course.VO.ResponseTemplateVO;
import com.course.course.entity.Course;
import com.course.course.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
@Slf4j
@AllArgsConstructor

public class CourseController {
    @Autowired
    private final CourseService courseService;


    @PostMapping("/")
    public String saveCourse (@RequestBody Course course)
    {

        return courseService.saveCourse(course);
    }

   // @GetMapping("{id}")
   // public ResponseTemplateVO getByDepartmentId(@PathVariable("id")  String lecturerId)
   // {
      //  log.info("inside getStudentWithDepartment of StudentController");
      //  return lecturerService.getByDepartmentId(lecturerId);}

    @GetMapping("{id}")
    public Course findCourseById(@PathVariable("id") Integer id) {
        log.info("inside findDepartmentById method of DepartmentController");
        return courseService.findCourseById(id);
    }
    @GetMapping("{id}")
    public ResponseTemplateVO getStudentById(@PathVariable("id") Integer courseId) {
        log.info("course fetch");
        return courseService.getStudentById(courseId);
    }
    @GetMapping("{id}")
    public ResponseTemplateVO getLecturerById(@PathVariable("id") Integer courseId) {
        log.info("course fetch");
        return courseService.getLecturerById(courseId);
    }

}

