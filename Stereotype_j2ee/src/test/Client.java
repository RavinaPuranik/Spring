package test;
//setter DI for Secondary data type and how to pass multiple xml files to Application Context


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		//check xml document and create instances to singleton beans
		Car c=(Car)ap.getBean(Car.class);
		c.printData();
        
	}

}
