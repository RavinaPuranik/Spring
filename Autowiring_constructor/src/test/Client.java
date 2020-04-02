package test;
//autodetect will use constructor DI first if both setter and parameterized constructor are present.
//autodetect will use setter DI first if both setter and parameterized and default constructor are present.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;

public class Client {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		//check xml document and create instances to singleton beans
		Bus b=(Bus)ap.getBean("b");
		b.printData();
        
	}

}
