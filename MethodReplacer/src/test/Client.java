package test;
//non static methods to implement factory class


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c=(Car)ap.getBean("c");
		System.out.println(c.getClass().getCanonicalName());
		System.out.println(c.myCarEngine().getEngName());
		
		Bus b=(Bus)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.myBusEngine().getEngName());
		
		Truck t=(Truck)ap.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTruckEngine().getEngName());

        
	}

}
