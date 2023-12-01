/**
 * Author: Rishabh Banerjee
 * Date: Nov 29 2023
 */

package driver;

import model.Assignment;
import model.MaxHeap;

public class Scheduler {
	
	
	MaxHeap<Assignment> assignments;

	public Scheduler() {

		this.assignments = new MaxHeap<>();		
		int choice = 0;

		do {
			
			if (this.assignments.getSize() != 0) {
				System.out.println("\n\n<-- Current List -->\n");
				this.assignments.display();
			}
			System.out.println("\nAssignment Prioritiser" + "\n1. Add" + "\n2. Remove" + "\n3. Help" + "\n4. Exit" + "\nChoose(1-4): ");

			choice = Launcher.scanner.nextInt();
			Launcher.scanner.nextLine();

			switch (choice) {
			case 1:
				this.assignments.add(new Assignment());
				System.out.println("\n\nAssignment Added to list...");
				break;
			case 2:
				this.assignments.removeMax();
				System.out.println("Removing latest assignment...");
				break;
			case 3:
				displayHelp();
				break;
			case 4:
				System.out.println("Exiting the prioritizer. Goodbye!");
				return;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 4);

	}
	
	private static void displayHelp() {
		System.out.println("Help:");
        System.out.println("1. Add - Allows you to add a new assignment.");
        System.out.println("2. Remove - Allows you to remove an assignment from the top.");
        System.out.println("3. Exit - Exits the Assignment Prioritiser.");
        System.out.println("4. Help - Displays this help information.");
        System.out.println("Note: Assignments are already prioritized based on date.");

        // ASCII art for extra flair
        System.out.println("	 ______     ______ ");
        System.out.println("	(  __  )   (  __  )");
        System.out.println("	| (  ) |   | |  | |");
        System.out.println("	( (__)_)   | |  | |");
        System.out.println("	| |        ( (__)_)");
        System.out.println("	|_|        /_/	   ");
        System.out.println("****************************");
	}
		
}
