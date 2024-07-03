package com.subrat.GraphQLProject.resolver;

import com.subrat.GraphQLProject.entity.Subject;
import com.subrat.GraphQLProject.enums.SubjectNameFilter;
import com.subrat.GraphQLProject.response.StudentResponse;
import com.subrat.GraphQLProject.response.SubjectResponse;
import graphql.kickstart.tools.GraphQLResolver;

import java.util.ArrayList;
import java.util.List;

public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {
    public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse, SubjectNameFilter subjectNameFilter) {
        List<SubjectResponse> learningSubjects = new ArrayList<>();
        if (studentResponse.getStudent().getLearningSubjects() != null) {
            for (Subject subject : studentResponse.getStudent().getLearningSubjects()) {
                if (subjectNameFilter.name().equalsIgnoreCase("All")) {
                    learningSubjects.add(new SubjectResponse(subject));
                } else if (subjectNameFilter.name().equalsIgnoreCase(subject.getSubjectName())) {
                    learningSubjects.add(new SubjectResponse(subject));
                }
            }
        }
        return learningSubjects;
    }

    public String getFullName(StudentResponse studentResponse) {
        return studentResponse.getFirstName() + " " + studentResponse.getLastName();
    }
}
