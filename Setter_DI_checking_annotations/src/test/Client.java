package test;
//setter DI for Array data type (primitive and secondary)

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		//check xml document and create instances to singleton beans
		Car c=(Car)ap.getBean("c");
		c.printCarData();
        
	}

}
