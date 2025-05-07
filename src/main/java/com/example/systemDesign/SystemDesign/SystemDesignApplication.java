package com.example.systemDesign.SystemDesign;

import com.example.systemDesign.SystemDesign.AbstractFactoryDesignPattern.AdmitCard;
import com.example.systemDesign.SystemDesign.AbstractFactoryDesignPattern.UniversityFactory;
import com.example.systemDesign.SystemDesign.AdapterDesignPattern.StudentClient;
import com.example.systemDesign.SystemDesign.BuilderDesignPattern.UrlBuilder;
import com.example.systemDesign.SystemDesign.FactoryDesignPattern.Course;
import com.example.systemDesign.SystemDesign.FactoryDesignPattern.CourseFactory;
import com.example.systemDesign.SystemDesign.FlyweightDesignPattern.Ball;
import com.example.systemDesign.SystemDesign.FlyweightDesignPattern.BallFactory;
import com.example.systemDesign.SystemDesign.Models.BeverageItem;
import com.example.systemDesign.SystemDesign.Models.MenuItem;
import com.example.systemDesign.SystemDesign.SingletonDesignPattern.LoggerSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.*;
import java.util.List;

@SpringBootApplication
public class SystemDesignApplication {

	private static final String colors[]  = {"green", "blue", "pink"};
	private static final Map<String,String> urlMap = Map.ofEntries(
			new AbstractMap.SimpleEntry<>("green", "url1"),
			new AbstractMap.SimpleEntry<>("blue", "url2"),
			new AbstractMap.SimpleEntry<>("pink", "url3")
	);



	public static void main(String[] args) {
		SpringApplication.run(SystemDesignApplication.class, args);
		runLiscovSubstitutionPrinciple();
		runFactoryDesignPatterExample();
		runBuilderDesignPatternExample();
		runAbstractFactoryMethodDesignPatter();
		runSingletonDesignPattern();
		runAdapterDesignPattern();
		runFlyweightDesignPatter();
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

	public static void runBuilderDesignPatternExample(){
		UrlBuilder.Builder url = new UrlBuilder.Builder();
		url.protocol("https://")
				.hostName("localhost:")
				.pathParams("/cities")
				.queryParams("?india");
		UrlBuilder urlBuilder = url.build();
		System.out.print(urlBuilder.protocol);
		System.out.print(urlBuilder.hostName);
		System.out.print(urlBuilder.pathParams);
		System.out.print(urlBuilder.queryParams);
	}

	public static void runAbstractFactoryMethodDesignPatter(){
		int score = 125;
		UniversityFactory university = UniversityFactory.getUniversityFactory(score);
		AdmitCard admitCard = university.getAdmitCard("Math");
		System.out.println(admitCard);
		int score1 = 108;
		UniversityFactory university1 = UniversityFactory.getUniversityFactory(score1);
		AdmitCard admitCard1 = university1.getAdmitCard("Math");
		System.out.println(admitCard1);
	}

	public static void runSingletonDesignPattern(){
		LoggerSingleton instance = LoggerSingleton.getInstance();
		LoggerSingleton instance1 = LoggerSingleton.getInstance();
		System.out.println(instance);
		System.out.println(instance1);
	}

	public static void runAdapterDesignPattern(){
		StudentClient studentClient = new StudentClient();
		System.out.println(studentClient.getStudents());
	}

	public static void runFlyweightDesignPatter(){
		for(int i=0;i<10;i++){

			String color = colors[(int)(Math.random()*colors.length)];
			String url = urlMap.get(color);
			Ball ball = BallFactory.getBall(color,url);
			ball.setxCordinate((int)Math.random()*50);
			ball.setyCordinate((int)Math.random()*50);
			ball.setRadius(75);
			ball.draw();
			System.out.println(ball.hashCode());
		}
	}

}
