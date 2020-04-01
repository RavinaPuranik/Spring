package beans;
import java.util.*;
public class Test {
    private Vector<String> fruits;
    private TreeSet<String> cricketers;
    private Hashtable<String,String> cc;
    
    public void setCc(Hashtable<String, String> cc) {
		this.cc = cc;
	}
    public void setCricketers(TreeSet<String> cricketers) {
		this.cricketers = cricketers;
	}
    
    public void setFruits(Vector<String> fruits) {
		this.fruits = fruits;
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
