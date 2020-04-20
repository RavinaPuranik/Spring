package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.StudentBo;
import model.Student;

public class Client {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/spring.xml");
		StudentBo stbo=(StudentBo) cap.getBean("bo");
		int i=stbo.createStudent(new Student(1111,"a","a@gmail.com","aa"));
		System.out.println(i);
		cap.close();

	}

}
