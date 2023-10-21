/**
 * author: Rishabh Banerjee
 * date: Oct 19 2023
 */

package list;

import java.util.Scanner;

import model.Person;

/**
 * SocialMediaApp class
 * SocialMediaApp that utilizes a linked list class to store
 * a person's information, including their name, email, location, and a list of
 * their friends (list).
 */

public class SocialMediaApp {

	static LList<Person> persons;
	static Scanner input;

	public static void main(String[] args) {

		persons = new LList<Person>();

		input = new Scanner(System.in);
		int choice = 0;

		while (choice != 10) {

			System.out.println("\n-----------------------------------" +
					" \n 1. Add a person to the list. Prompt user for the person's details including name, email, location and a list of friends."
					+ "\n 2. Add a person at a particular position to the list. Prompt user for the person’s details including name, email, location and a list of friends."
					+ "\n 3. Remove a person."
					+ "\n 4. Remove all the persons from the list/clear the list."
					+ "\n 5. Retrieve and display the information of everyone in the list."
					+ "\n 6. Search a person by name or by email and display the person's details including a friend list."
					+ "\n 7. Add a friend to the friend list or remove a friend from the friend list after searching for a particular person."
					+ "\n 8. Count the number of people on the list."
					+ "\n 9. Check if the list is empty."
					+ "\n 10.Exit"
					+ "\n Choose(1-10): ");
			choice = input.nextInt();

			/**
			 * switch case to perform operations based on user input
			 */
			try {
				switch (choice) {
					case 1 -> persons.add(initPerson(false));
					case 2 -> {
						System.out.println("Enter position to Enter User: ");
						int pos = input.nextInt();
						persons.add(pos, initPerson(false));
					}

					/**
					 * case to remove a person from the list
					 */
					case 3 -> {
						System.out.println("Enter position to Remove User: ");
						int pos = input.nextInt();
						persons.remove(pos);
					}
					case 4 -> persons.clear();

					/**
					 * case to display all the persons in the list
					 */
					case 5 -> {
						if (persons.getLength() == 0) {
							System.out.println("Person List is Empty");
						} else {
							for (int i = 1; i <= persons.getLength(); i++)
								System.out.println(persons.getEntry(i).toString());
						}
					}

					/**
					 * case to search for a person by name or email
					 */
					case 6 -> System.out.println(search(persons).toString());

					/**
					 * case to add or remove a friend from a person's friend list
					 */
					case 7 -> {

						Person found = search(persons);

						// Person person = initPerson();
						System.out.println("\n\n1. Add Person"
								+ "\n2. Remove Person");
						int option = input.nextInt();
						if (option == 1) {
							Person newFriend = initPerson(true);
							found.addFriend(newFriend);
						} else if (option == 2) {
							System.out.println("Enter Friend to Remove: ");
							Person unFriend = search(found.getFriends());
							found.getFriends().remove(unFriend);
							System.out.println(
									"Removed " + unFriend.getName() + " from " + found.getName() + "'s Friend List");
						}

					}

					/**
					 * case to count the number of persons in the list
					 */
					case 8 -> System.out.println("Number of people: " + persons.getLength());

					/**
					 * case to check if the list is empty
					 */
					case 9 -> {
						if (persons.getLength() == 0)
							System.out.println("Persons List is Empty");
						else
							System.out.println("List has " + persons.getLength() + "elements");
					}

					case 10 -> System.out.println("Thank you");
					default -> System.out.println("Invalid Input");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

	/**
	 * method to search for a person by name or email
	 * 
	 * @return
	 */
	private static Person search(LList<Person> persons) {
		Person found = new Person();
		System.out.println("Person Search\n"
				+ "Enter Person Name/Email: ");
		String filter = input.next();
		filter = filter.trim();
		if (persons.getLength() == 0) {
			System.out.println("Person List is Empty");
		} else
			for (int i = 1; i <= persons.getLength(); i++) {

				if (persons.getEntry(i).getEmail().equals(filter)
						|| persons.getEntry(i).getName().equals(filter)) {
					found = persons.getEntry(i);
				}
			}
		if (found.getName().equals("")) {
			System.out.println("Person not Found");
		}
		return found;

	}

	/**
	 * method to get name email and location of a person
	 * from the user and instantiate a new Person which is returned
	 * 
	 * @return Person
	 */
	private static Person initPerson(boolean isFriend) {

		// data declarations
		String name, email, location;
		LList<Person> friends = new LList<Person>();

		System.out.print("\nEnter Following Details for Person - "
				+ "\nName: ");
		name = input.next();
		System.out.print("Email: ");
		email = input.next();
		System.out.print("Location: ");
		location = input.next();

		boolean stop = false;
		if (!isFriend)
			while (!stop) {
				String friendName, friendLocation, friendEmail;
				System.out.print("\nEnter Friends for Person(" + name + ")- "
						+ "\nName: ");
				friendName = input.next();
				System.out.print("Email: ");
				friendEmail = input.next();
				System.out.print("Location: ");
				friendLocation = input.next();
				Person friend = new Person(friendName, friendEmail, friendLocation);
				friends.add(friend);
				System.out.print("Add another Friend? (Y/N)");
				String choice = input.next();
				if (choice.equals("N") || choice.equals("n")) {
					stop = true;
				}
			}
		return new Person(name, email, location, friends);
	}

}
