package com.lecturer.lecturer.VO;

import com.lecturer.lecturer.entity.Lecturer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor


    public class ResponseTemplateVO {
        private Lecturer lecturer;
        private Department department;
}
