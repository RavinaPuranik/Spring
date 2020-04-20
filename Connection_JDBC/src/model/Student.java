package model;

public class Student {
  
	private int id;
	private String name,email,address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String email, String address) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail() {
		return email;
	}
}


