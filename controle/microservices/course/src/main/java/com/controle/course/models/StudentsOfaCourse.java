package com.controle.course.models;

import com.controle.course.entities.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentsOfaCourse {
    private Course course;
    private List<Student> students;

}
