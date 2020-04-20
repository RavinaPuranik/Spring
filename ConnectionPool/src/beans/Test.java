package beans;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;


public class Test {
 
	public static void main(String[] args) {
		BasicDataSource bds=new BasicDataSource();
		/*bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/mad");
		bds.setUsername("root");
		bds.setPassword("root");
		bds.setMaxActive(15);
		bds.setMinIdle(5);
		bds.setMaxWait(5000);*/
		
		//using spring.xml
		
		
		
		for(int i=0;i<20;i++) {
			try {
				Connection con=bds.getConnection();
				System.out.println(con+": "+i);
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
