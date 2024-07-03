package com.subrat.GraphQLProject.mutation;

import com.subrat.GraphQLProject.request.CreateStudentRequest;
import com.subrat.GraphQLProject.response.StudentResponse;
import com.subrat.GraphQLProject.service.StudentService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    StudentService studentService;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {
        return new StudentResponse(studentService.createStudent(createStudentRequest));
    }
}
