package com.controle.studentservice.models;

import com.controle.studentservice.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CoursesOfaStudent {
    private Student student;
    private List<Course> courses;
}
