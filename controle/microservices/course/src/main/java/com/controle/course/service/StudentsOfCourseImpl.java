package com.controle.course.service;

import com.controle.course.models.StudentsOfaCourse;
import com.controle.course.repositories.CourseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service @Transactional
public class StudentsOfCourseImpl implements StudentsOfCourse {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public StudentsOfaCourse getStudentsOfaCourse(int courseId) {
        StudentsOfaCourse studentsOfaCourse=new StudentsOfaCourse();
        studentsOfaCourse.setCourse(courseRepository.findById(courseId).get());
        studentsOfaCourse.setStudents(restTemplate.getForObject("http://localhost:8082/student/"+courseId, List.class));
        return  studentsOfaCourse;
    }
}
