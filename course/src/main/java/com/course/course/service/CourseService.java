package com.course.course.service;

import com.course.course.VO.Lecturer;
import com.course.course.VO.ResponseTemplateVO;
import com.course.course.VO.Student;
import com.course.course.entity.Course;
import com.course.course.repository.CourseRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class CourseService {
    @Autowired
    private final CourseRepository courseRepository;

    private RestTemplate restTemplate;
    public String saveCourse(Course course) {
        courseRepository.save(course);
        return "new data added";
    }

    public Course findCourseById(Integer courseId) {
        log.info("save Service");
        return courseRepository.findById(courseId).orElseThrow(null);
    }
    //public List<Course> getAllCourse() {return courseRepository.findAll();}



    public ResponseTemplateVO getStudentById(Integer courseId) {
        log.info("return");
        ResponseTemplateVO vo= new ResponseTemplateVO();
        Course course = courseRepository.findByCourseId(courseId);

        Student student = restTemplate.getForObject("localhost:8083/student/" +course.getStudentName(),Student.class);

        vo.setCourse(course);
        vo.setStudent(student);

        return vo;
    }

    public ResponseTemplateVO getLecturerById(Integer courseId) {
        log.info("return");
        ResponseTemplateVO vo= new ResponseTemplateVO();
        Course course = courseRepository.findByCourseId(courseId);

        Lecturer lecturer = restTemplate.getForObject("localhost:8081/lecturer/" +course.getLecturerName(), Lecturer.class);

        vo.setCourse(course);
        vo.setLecturer(lecturer);

        return vo;
    }
}



