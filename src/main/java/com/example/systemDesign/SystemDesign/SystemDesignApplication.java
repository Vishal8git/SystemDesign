package com.example.systemDesign.SystemDesign;

import com.example.systemDesign.SystemDesign.FactoryDesignPattern.Course;
import com.example.systemDesign.SystemDesign.FactoryDesignPattern.CourseFactory;
import com.example.systemDesign.SystemDesign.Models.BeverageItem;
import com.example.systemDesign.SystemDesign.Models.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class SystemDesignApplication {


	public static void main(String[] args) {
		SpringApplication.run(SystemDesignApplication.class, args);
		runLiscovSubstitutionPrinciple();
		runFactoryDesignPatterExample();

	}

	public static void runLiscovSubstitutionPrinciple(){
		MenuItem menu = new MenuItem("Maggi", "Fresh Maggi", 100);

		BeverageItem beverage = new BeverageItem("Coffee", "Fresh Coffee", 1000);
		printDiscountedPrice(menu);
		printDiscountedPrice(beverage);
	}

	public static void printDiscountedPrice(MenuItem menu){
		//if getDiscounted not there in derived class than we can't able to replace menu with beverage
		// here we violated Liscov substitution principle
		System.out.println(menu.getDiscountedPrice());
	}

	public static void runFactoryDesignPatterExample(){
		Course hldCourse = CourseFactory.getCourse("HLD");
		Course lldCourse = CourseFactory.getCourse("LLD");
		System.out.println(hldCourse.getModules());
		System.out.println(lldCourse.getModules());
	}


}
