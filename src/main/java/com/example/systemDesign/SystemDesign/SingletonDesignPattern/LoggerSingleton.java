package com.example.systemDesign.SystemDesign.SingletonDesignPattern;

public class LoggerSingleton {
    // assigned null for lazy loading
    // used volatile so that changes visible to all threads
    private static volatile LoggerSingleton instance = null;

    private LoggerSingleton(){

    }

    public static LoggerSingleton getInstance(){
        if(instance == null){
            // used synchronized so that no two thread access below block at the same time.
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
