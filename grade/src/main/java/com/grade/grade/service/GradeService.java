package com.grade.grade.service;

import com.grade.grade.Entity.Grade;
import com.grade.grade.repository.GradeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class GradeService {


    private static SessionDelegatorBaseImpl gradeRepository;
    @Autowired
        private final GradeRepository gradeRepository;

        @Autowired
        public static String saveGrade(Grade grade) {
            gradeRepository.save(grade);
            return "new data added";
        }

        public Grade findGradeById(Integer gradeId) {
            log.info("inside savaDepartment of DepartmentService");
            return gradeRepository.findById(gradeId).orElseThrow(null);
        }
        public List<Grade> getAllGrade()
        {
            return gradeRepository.findAll();
        }
    }

