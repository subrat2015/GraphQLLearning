package com.subrat.GraphQLProject.repository;

import com.subrat.GraphQLProject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
