package com.subrat.GraphQLProject.response;

import com.subrat.GraphQLProject.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;
    private List<SubjectResponse> learningSubjects;
    //This is internal, so don't put in the schema
    private Student student;
    private String fullName;

    public StudentResponse(Student student) {
        this.student = student;
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
        this.street = student.getAddress().getStreet();
        this.city = student.getAddress().getCity();
        /*if (student.getLearningSubjects() != null) {
            learningSubjects = new ArrayList<SubjectResponse>();
            for (Subject subject : student.getLearningSubjects()) {
                learningSubjects.add(new SubjectResponse(subject));
            }
        }*/
    }
}
