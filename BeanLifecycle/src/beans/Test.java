package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean,DisposableBean{
    
	private String driver,url,username,password;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Connection established...");
		System.out.println("driver "+driver);
		System.out.println("username "+username);
		System.out.println("password "+password);
		System.out.println("url "+url);
		
	}
	
	@Override
	public void destroy() throws Exception {
		 System.out.println("Connection closed...");
		
	}
}
