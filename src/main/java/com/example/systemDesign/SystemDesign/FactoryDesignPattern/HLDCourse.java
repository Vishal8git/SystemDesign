package com.example.systemDesign.SystemDesign.FactoryDesignPattern;

public class HLDCourse extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}
