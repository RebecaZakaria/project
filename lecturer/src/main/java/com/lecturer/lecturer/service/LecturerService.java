package com.lecturer.lecturer.service;

import com.lecturer.lecturer.VO.Department;
import com.lecturer.lecturer.VO.ResponseTemplateVO;
import com.lecturer.lecturer.entity.Lecturer;
import com.lecturer.lecturer.repository.LecturerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j

public class LecturerService {
    @Autowired
    private LecturerRepository lecturerRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Lecturer saveLecturer(Lecturer lecturer) {
        log.info("inside saveLecturer of service");
        return lecturerRepository.save(lecturer);
    }
   // public ResponseTemplateVO getDepartmentById(Integer lecturerId)
    //{}public ResponseTemplateVO getDepartmentById(Integer lecturerId) {



    public ResponseTemplateVO getByDepartmentId(String lecturerId) {
            log.info("inside getStudentWithDepartment of UserService");
            ResponseTemplateVO vo= new ResponseTemplateVO();
            Lecturer lecturer = lecturerRepository.findByLecturerId(String.valueOf(lecturerId));
            Department department = restTemplate.getForObject("localhost:8080/department/" +lecturer.getDepName(),Department.class);

            vo.setLecturer(lecturer);
            vo.setDepartment(department);

            return vo;
        }
        }

