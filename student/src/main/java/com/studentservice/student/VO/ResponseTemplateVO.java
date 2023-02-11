package com.studentservice.student.VO;

import com.studentservice.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ResponseTemplateVO {
    private Student student;
    private Department department;
}