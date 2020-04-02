package beans;

public class Bus {
   private Engine engine;
  /* 
   public Bus() {
	System.out.println("default constructor");
}
  */ 
   public Bus(Engine engine) {
	this.engine=engine;
	System.out.println("parametrized constructor");
}
   public void setEngine(Engine engine) {
	this.engine = engine;
}
   public void printData() {
	   System.out.println("Bus engine model year: "+engine.getModelYear());
   }
}
