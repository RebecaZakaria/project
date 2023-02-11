package com.lecturer.lecturer.repository;

import com.lecturer.lecturer.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {
    Lecturer findByLecturerId(String lecturerId);

    //Lecturer findByLecturerId(String lecturerId);
}
