package test;
//using constructor for DI. Using indexes when the arguments are given out of order in spring.xml file.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;
import beans.Test;
public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		//check xml document and create instances to singleton beans
		Test t=(Test)ap.getBean("t");
		t.printData();
        
	}

}
