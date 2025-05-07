package com.example.systemDesign.SystemDesign.AdapterDesignPattern;

public class SchoolStudentAdapter implements Student {

    private SchoolStudent student;

    SchoolStudentAdapter(SchoolStudent student){
        this.student = student;
    }

    @Override
    public String getFirstName() {
        return this.student.getName();
    }

    @Override
    public String getSurName() {
        return this.student.getLastName();
    }

    @Override
    public String getEmail() {
        return this.student.getEmailAddress();
    }
}
