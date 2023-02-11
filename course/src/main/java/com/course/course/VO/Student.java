package com.course.course.VO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")

public class Student {
    @Id
    private Integer studentId;
    private  String studentName;
    private  String studentAddress;
    private String studentRegNo;



}