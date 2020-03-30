package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		Resource r= new ClassPathResource("resources/spring.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory= new XmlBeanFactory(r);
		factory.getBean("t");
		
        
        
	}

}
