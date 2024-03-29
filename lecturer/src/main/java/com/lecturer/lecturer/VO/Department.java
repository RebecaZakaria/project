package com.lecturer.lecturer.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Integer depId;
    private String depName;
    private String depAddress;
}
