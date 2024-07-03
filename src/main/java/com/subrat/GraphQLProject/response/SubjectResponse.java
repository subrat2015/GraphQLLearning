package com.subrat.GraphQLProject.response;

import com.subrat.GraphQLProject.entity.Subject;

public class SubjectResponse {
    private Long id;
    private String subjectName;
    private Double marksObtained;

    public SubjectResponse(Subject subject) {
        this.id = subject.getId();
        this.subjectName = subject.getSubjectName();
        this.marksObtained = subject.getMarksObtained();
    }
}
