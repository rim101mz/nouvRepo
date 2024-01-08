package com.controle.course.controllers;

import com.controle.course.entities.Course;
import com.controle.course.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping(path="/course/add")
    public Course courseAdd(@RequestBody Course course){
        return courseRepository.save(course);
    }

    @GetMapping(path="/courses")
    public List<Course> getCourses (){
        return courseRepository.findAll();
    }

    @GetMapping(path="/courses/{id}")
    public Course getCourseById(@PathVariable int id){
        return  courseRepository.findById(id).get();
    }
    @GetMapping(path="/courses/{studentId}")
    List<Course> getCourseByStudentId(@PathVariable int studentId){
        return  courseRepository.getCourseByStudentId(studentId);
    }
}
