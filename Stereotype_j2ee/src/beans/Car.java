package beans;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Car {
   
@Resource
   private Engine engine;
   
   
   public void printData(){
	   System.out.println("Engine namer "+engine.getEngName());
   }
}
