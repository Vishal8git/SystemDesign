package com.example.systemDesign.SystemDesign.AdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("Vishal", "Kumar", "vishalkumar2211@gmail.com");
        Student schoolStudent = new SchoolStudentAdapter(new SchoolStudent("Neha", "yadav", "nehayadav0803@gmail.com"));
        students.add(collegeStudent);
        students.add(schoolStudent);
        return students;
    }

}
