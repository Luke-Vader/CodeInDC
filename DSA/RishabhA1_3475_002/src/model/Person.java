package model;

import list.LList;

/**
 * Person class
 * Model class for a person that will be a part of the social media app
 */
public class Person {

	private String name;
	private String email;
	private String location;
	private LList<Person> friends;

	/**
	 * Default constructor
	 */
	public Person() {
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param email
	 * @param location
	 */
	public Person(String name,
			String email,
			String location) {
		this.name = name;
		this.email = email;
		this.location = location;
		this.friends = new LList<Person>();
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param email
	 * @param location
	 * @param friends
	 */
	public Person(String name,
			String email,
			String location,
			LList<Person> friends) {
		this.name = name;
		this.email = email;
		this.location = location;
		this.friends = friends;
	}

	public void setFriends(LList<Person> friends) {
		this.friends = friends;
	}

	public LList<Person> getFriends() {
		return friends;
	}

	public void addFriend(Person friend) {
		this.friends.add(friend);
	}

	public void removeFriend(Person friend) {
		this.friends.remove(friend);
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {

		if (this.friends.getLength() > 1) {
			String display = "\n\nName: " + this.name
					+ "\nEmail: " + this.email
					+ "\nLocation: " + this.location
					+ "\n\nFriend List(" + this.name + "): ";
			for (int i = 1; i <= this.friends.getLength(); i++) {
				display += this.friends.getEntry(i).toString();
				display += "\n";
			}
			return display;
		} else {

			return "\nName: " + this.name
					+ "\nEmail: " + this.email
					+ "\nLocation: " + this.location;
		}
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
