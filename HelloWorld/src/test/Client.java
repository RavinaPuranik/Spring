package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		//find xml
		Resource r=new ClassPathResource("resources/spring.xml");
		//load xml into container
		BeanFactory factory =new XmlBeanFactory(r);
		
		//create test class object
		Object o=factory.getBean("t");
		Test t=(Test)o;
		t.hello();

	}

}
