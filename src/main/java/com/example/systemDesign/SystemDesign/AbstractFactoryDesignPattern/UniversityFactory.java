package com.example.systemDesign.SystemDesign.AbstractFactoryDesignPattern;

public abstract class UniversityFactory {
    public static int cutoff = 109;
    public static UniversityFactory getUniversityFactory(int score){
        if(score > cutoff){
            return new IvyLeagueUniversityFactory();
        }
        else{
            return new PublicUniversityFactory();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);

}
