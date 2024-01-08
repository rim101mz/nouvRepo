package com.controle.studentservice.controllers;

import com.controle.studentservice.entities.Student;
import com.controle.studentservice.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path="/student/add")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping(path="/students")
    public List<Student> getStudents(){
        return studentRepository.findAll();

    }

    @GetMapping(path="/student/{courseId}")
    public List<Student> getStudentsByCourseId(@PathVariable int courseId){
        return studentRepository.getStudentsByCourseId(courseId);
    }
}
