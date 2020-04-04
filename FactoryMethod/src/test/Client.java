package test;


import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;


public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
          Test t=(Test)ap.getBean("t");
          
         // Calendar c=new Calendar();-- will not work.Configure in spring.xml.
          
          Calendar c=(Calendar)ap.getBean("c");
         // Calendar.getInstance();
          System.out.println(c.getCalendarType());
          
	}

}
