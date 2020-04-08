package beans;

import javax.annotation.Resource;

public class Car {
   
//autowiring using by Name	
 @Resource
 //we can also use @Inject..we have to add jboss j2ee jar file in build path. It also uses by Name.If the name doesnt match, we will get ambiguity.We can then use @Qualifier
   private Engine engine;
   
   
   public void printData(){
	   System.out.println("Model Year "+engine.getModelYear());
   }
}
