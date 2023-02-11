package com.course.course.VO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="lecturer")

public class Lecturer {
    @Id
    private Integer lecturerId;
    private  String lecturerName;
    private  String lecturerEmail;


}