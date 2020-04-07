package beans;


public class Test {
    
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
//user defined method names
	public void conInit() throws Exception {
		System.out.println("Connection established...");
		System.out.println("driver "+driver);
		System.out.println("username "+username);
		System.out.println("password "+password);
		System.out.println("url "+url);
		
	}
	
	public void conCleanUp() throws Exception {
		 System.out.println("Connection closed...");
		
	}
}
