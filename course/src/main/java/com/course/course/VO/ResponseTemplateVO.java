package com.course.course.VO;

import com.course.course.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ResponseTemplateVO {
    private Course course;
    private Student student;
    private Lecturer lecturer;
}