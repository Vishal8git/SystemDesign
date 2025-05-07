package com.example.systemDesign.SystemDesign.AdapterDesignPattern;

public class CollegeStudent implements Student{
    private String FirstName;
    private String SurName;
    private String Email;

    public CollegeStudent(String firstName, String surName, String email) {
        FirstName = firstName;
        SurName = surName;
        Email = email;
    }

    @Override
    public String getFirstName() {
        return this.FirstName;
    }

    @Override
    public String getSurName() {
        return this.SurName;
    }

    @Override
    public String getEmail() {
        return this.Email;
    }
}
