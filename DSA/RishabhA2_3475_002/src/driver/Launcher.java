package driver;

import java.util.Scanner;

public class Launcher {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("Assignment II" + "\n1. Kth Order Statistic" + "\n2. Assignment Prioritiser" + "\n3. Exit"
					+ "\nChoose(1-3): ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				new KthOrder();
				break;
			case 2:
				new Scheduler();
				break;
			case 3:
				System.out.println("Exiting Assignment II. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please choose a number between 1 and 3.");
			}
		} while (choice != 3);

		scanner.close();
	}

}
