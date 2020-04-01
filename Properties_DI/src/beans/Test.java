package beans;
import java.util.*;
public class Test {
    private Properties driver;
    
    public void setDriver(Properties driver) {
		this.driver = driver;
	}
    
    public void printData() {
    	Set keysSet=driver.keySet();
    	for(Object key:keysSet)
    		System.out.println("key: "+key+" value: "+driver.getProperty(key.toString()));
    }
    }

