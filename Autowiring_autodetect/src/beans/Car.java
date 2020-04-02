package beans;

public class Car {
   
   private Engine engine;
   
   public void setEngine(Engine engine) {
	this.engine = engine;
}
   
   public void printCarData(){
	   
	   System.out.println("model year: "+engine.getModelYear());
   }
}
