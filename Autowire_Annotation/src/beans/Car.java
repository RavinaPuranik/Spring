package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
   private Engine engine;
   //no need to have setters or constructors fir DI when @autowired is used
   public void printCarData(){
	   
	   System.out.println("model year: "+engine.getModelYear());
   }
}
