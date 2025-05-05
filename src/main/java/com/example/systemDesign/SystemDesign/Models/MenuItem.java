package com.example.systemDesign.SystemDesign.Models;

public class MenuItem {
    public String Title;
    public String Description;
    public double Price;

    public MenuItem(String title, String description, Integer price) {
        this.Title = title;
        this.Description = description;
        this.Price = price;
    }

    public double getPrice(){
        return this.Price;
    }
    public double getDiscountedPrice(){
        return this.Price - this.getDiscount();
    }
    private double getDiscount(){
        return 0;
    }
}
