package com.example.systemDesign.SystemDesign.FactoryDesignPattern;

public class CourseFactory {
    public static Course getCourse(String courseType){
        switch (courseType){
            case "LLD":
                return new LLDCourse();
            case "HLD":
                return new HLDCourse();
            default:
                return null;
        }
    }
}
