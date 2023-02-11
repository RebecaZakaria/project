package com.grade.grade.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer gradeId;
    private String gradeCode;
    private String grade;

}
