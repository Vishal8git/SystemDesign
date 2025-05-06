package com.example.systemDesign.SystemDesign.AbstractFactoryDesignPattern;

public class IvyLeagueUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "Math":
                return new MITAdmitCard();
            case "Physics":
                return new CalTechAdmitCard();
            case "CS":
                return new GeorgiaTechAdmitCard();
            default:
                return null;
        }
    }
}
