package com.department.department.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "department")

public class Department {


        @Id
        @GeneratedValue(strategy =  GenerationType.AUTO)
        private Integer depId;
        private String depName;
        private String depAddress;

    }
