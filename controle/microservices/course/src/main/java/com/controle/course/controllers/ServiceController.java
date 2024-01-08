package com.controle.course.controllers;

import com.controle.course.models.StudentsOfaCourse;
import com.controle.course.service.StudentsOfCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    private StudentsOfCourse studentsOfCourse;

    @GetMapping(path="service/{courseId}")
    public StudentsOfaCourse getStudentsOfCourse(@PathVariable int courseId){
        return studentsOfCourse.getStudentsOfaCourse(courseId);
    }
}
