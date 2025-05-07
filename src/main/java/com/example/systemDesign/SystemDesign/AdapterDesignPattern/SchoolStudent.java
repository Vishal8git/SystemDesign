package com.example.systemDesign.SystemDesign.AdapterDesignPattern;

public class SchoolStudent {
    private String Name;
    private String LastName;
    private String EmailAddress;

    public SchoolStudent(String name, String lastName, String emailAddress) {
        Name = name;
        LastName = lastName;
        EmailAddress = emailAddress;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
}
