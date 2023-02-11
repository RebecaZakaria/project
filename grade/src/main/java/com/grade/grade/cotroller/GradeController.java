package com.grade.grade.cotroller;

import com.grade.grade.Entity.Grade;
import com.grade.grade.service.GradeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/grade")
@Slf4j
@AllArgsConstructor
public class GradeController {


        private final GradeService gradeService;
        @PostMapping("/add")
        public String saveGrade(@RequestBody Grade grade) {
            return  GradeService.saveGrade(grade);
        }

        @GetMapping("{id}")
        public Grade findGradeById(@PathVariable("id") Integer gradeId) {
            log.info("grade");
            return gradeService.findGradeById(gradeId);
        }


    }

