package test;
//by using reflection classes we can create instances for private constructors.

import java.lang.reflect.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		try {
			Class c=Class.forName("beans.Test");
			Constructor con[]=c.getDeclaredConstructors();
			con[0].setAccessible(true);
			con[0].newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
