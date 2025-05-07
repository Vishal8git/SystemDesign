package com.example.systemDesign.SystemDesign.FlyweightDesignPattern;

public class Ball {
    private String color;
    private String url;
    private Integer xCordinate;
    private Integer yCordinate;
    private Integer radius;

    public Ball(String color, String url) {
        this.color = color;
        this.url = url;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public void setxCordinate(Integer xCordinate) {
        this.xCordinate = xCordinate;
    }

    public void setyCordinate(Integer yCordinate) {
        this.yCordinate = yCordinate;
    }

    public void draw(){
        // code to draw the ball
    }
}

