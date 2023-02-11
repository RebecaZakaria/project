package com.course.course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "course")


public class Course {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)

    private Integer courseId;
    private String courseName;
    private String courseCode;
   private Integer studentName;
    private  Integer lecturerName;


}
