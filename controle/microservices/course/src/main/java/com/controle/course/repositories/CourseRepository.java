package com.controle.course.repositories;

import com.controle.course.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    List<Course> getCourseByStudentId(int studentId);
}
