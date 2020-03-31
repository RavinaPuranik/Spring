package beans;
import java.util.*;
public class Test {
    private List<String> fruits;
    private Set<String> cricketers;
    private Map<String,String> cc;
    
    public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
    
    public void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}
    
    public void setCc(Map<String, String> cc) {
		this.cc = cc;
	}
    
    public void printData() {
    	System.out.println("Fruits....");
    	for(Object fruit:fruits)
    		System.out.println(fruit);
    	System.out.println("Cricketers....");
    	for(Object cricketer:cricketers)
    		System.out.println(cricketer);
    	System.out.println("Countries and Capitals....");
    	Set keys=cc.keySet();
    	for(Object key:keys)
    		System.out.println("Country= "+key+": Capital= "+cc.get(key)); 	
    	
    }
}
