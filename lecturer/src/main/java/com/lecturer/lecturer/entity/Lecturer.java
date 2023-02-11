package com.lecturer.lecturer.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Var;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="lecturer")
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lecturerId;
    private  String lecturerName;
    private String lecturerEmail;
    private  String depName;


}
