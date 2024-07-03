package com.subrat.GraphQLProject.query;

import com.subrat.GraphQLProject.request.SampleRequest;
import com.subrat.GraphQLProject.response.StudentResponse;
import com.subrat.GraphQLProject.service.StudentService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    StudentService studentService;

    public String firstQuery() {
        return "first query";
    }

    public String secondQuery() {
        return "Second Query";
    }

    /*public String fullName1( String firstName, String lastName) {
        return firstName+" "+lastName;
    }*/

    public String fullName( SampleRequest sampleRequest) {
        return sampleRequest.getFirstName()+" "+sampleRequest.getLastName();
    }

    public StudentResponse getStudent(long id) {
        return new StudentResponse(studentService.getStudentById(id));
    }
}
