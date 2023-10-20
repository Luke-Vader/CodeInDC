/**
 * author: Rishabh Banerjee
 * date: Oct 19 2023
 */

package list;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import model.Person;

public class SocialMediaApp {
	
	static LList<Person> friends;
	static Scanner input;
	
	public static void main(String[] args) {
		
		friends = new LList<Person>();
		
		input = new Scanner(System.in);
		
		System.out.println("1. Add a person to the list. Prompt user for the person’s details including name, email, location and a list of friends. "
				+ "\n 2. Add a person at a particular position to the list. Prompt user for the person’s details including name, email, location and a list of friends. "
				+ "\n 3. Remove a person. "
				+ "\n 4. Remove all the persons from the list/clear the list. "
				+ "\n 5. Retrieve and display the information of everyone in the list. "
				+ "\n 6. Search a person by name or by email and display the person’s details including a friend list. "
				+ "\n 7. Add a friend to the friend list or remove a friend from the friend list after searching for a particular person. "
				+ "\n 8. Count the number of people on the list. "
				+ "\n 9. Check if the list is empty. "
				+ "\n 10. Exit"
				+ "\n Choose(1-10): ");
		switch (input.nextInt()) {
		case 1 -> 
		
		
		
		default -> System.out.println("Invalid Input");
		}
		

	}
	
	/**
	 * method to get name email and location of a person 
	 * from the user and instantiate a new Person which is returned
	 * @return Person
	 */
	private Person initPerson() {
	
		//data declarations
		String name, email, location;
		
		System.out.print("\nEnter Following Details for Person - "
				+ "\n Name: ");
		name = input.next();
		System.out.println("Email: ");
		email = input.next();
		System.out.println("Location: ");
		location = input.next();
	
		return new Person(name, email, location);
		
	}

}
