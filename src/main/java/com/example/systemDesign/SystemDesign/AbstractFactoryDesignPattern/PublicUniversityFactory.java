package com.example.systemDesign.SystemDesign.AbstractFactoryDesignPattern;

public class PublicUniversityFactory extends UniversityFactory{
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "Math":
                return new USCAdmitCard();
            case "Physics":
                return new VSUAdmitCard();
            case "CS":
                return new ASUAdmitCard();
            default:
                return null;
        }
    }
}
