package model;

public class Person {
	
	private String name;
	private String email;
	private String location;
	
	public Person(String name,
			String email, 
			String location) {
		this.name = name;
		this.email = email;
		this.location = location;
	}
	
	@Override
	public String toString() {
		
		return "Name: " + this.name
				+ "Email: " + this.email
				+ "Location: " + this.location;
	}
	
	

}
