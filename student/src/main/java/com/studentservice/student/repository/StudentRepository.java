package com.studentservice.student.repository;

import com.studentservice.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByStudentId(Integer studentId);
    //Student findByStudentId(Integer studentId);
}
