package com.controle.studentservice.repositories;

import com.controle.studentservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    public List<Student> getStudentsByCourseId(int courseId);
}
