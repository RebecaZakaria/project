package com.course.course.repository;

import com.course.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository <Course, Integer> {
    Course findByCourseId(Integer courseId);
    //Course ListAllCourse (Integer courseId);
}
