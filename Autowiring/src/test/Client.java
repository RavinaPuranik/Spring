package test;
//byType-->for resolving ambiguity in case of multiple engine objects, we should use autowire candidate

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
