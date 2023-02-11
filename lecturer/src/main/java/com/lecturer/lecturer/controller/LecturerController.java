package com.lecturer.lecturer.controller;

import com.lecturer.lecturer.VO.ResponseTemplateVO;
import com.lecturer.lecturer.entity.Lecturer;
import com.lecturer.lecturer.service.LecturerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lecturer")
@Slf4j
@AllArgsConstructor

public class LecturerController {

    @Autowired
    private final LecturerService lecturerService;

    @PostMapping("/")
    public Lecturer saveLecturer(@RequestBody Lecturer lecturer)
    {
        log.info("inside saveLecturer of controller");
        return lecturerService.saveLecturer(lecturer);
    }
    @GetMapping("{id}")
    public ResponseTemplateVO getByDepartmentId(@PathVariable("id")  String lecturerId)
    {
        log.info("inside getStudentWithDepartment of StudentController");
        return lecturerService.getByDepartmentId(lecturerId);
    }



}