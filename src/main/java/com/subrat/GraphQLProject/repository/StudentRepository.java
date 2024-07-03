package com.subrat.GraphQLProject.repository;

import com.subrat.GraphQLProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
