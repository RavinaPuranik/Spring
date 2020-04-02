package beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {
   private String carName;
   private Engine engine;
   
   @SuppressWarnings("deprecation")
@Required
   public void setCarName(String carName) {
	this.carName = carName;
}
   @Required 
   public void setEngine(Engine engine) {
	this.engine = engine;
}
   
   public void printCarData(){
	   System.out.println("car name: "+carName);
	   System.out.println("model year: "+engine.getModelYear());
   }
}
