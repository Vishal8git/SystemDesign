package com.example.systemDesign.SystemDesign.Models;

import com.example.systemDesign.SystemDesign.Interface.IMenu;

public class BeverageItem extends MenuItem {

    public BeverageItem(String title, String description, Integer price) {
        super(title, description, price);
    }

    @Override
    public double getPrice() {
        return this.Price;
    }
    public double getDiscountedPrice(){
        return this.Price - this.getDiscount();
    }
    private double getDiscount(){
        return 0.1*this.Price;
    }
}
