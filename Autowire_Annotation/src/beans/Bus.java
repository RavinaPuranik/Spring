package beans;

public class Bus {
   private Engine engine;
   
   public void printData() {
	   System.out.println("Bus engine model year: "+engine.getModelYear());
   }
}
