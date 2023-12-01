package driver;

import model.MaxHeap;

/**
 * The KthOrder class provides functionality to find the k-th largest element in a collection of integers.
 * It uses the MaxHeap class to store and manage the numbers.
 */
public class KthOrder {
	
	static MaxHeap<Integer> numbersHeap;

	/**
     * Constructor that initiates the process of finding the k-th largest element.
     */
	public KthOrder() {
			getValues();
			numbersHeap.display();
			System.out.println("Enter K: ");
			findValue(Launcher.scanner.nextInt());
			Launcher.scanner.nextLine();
	}
	
	/**
     * Prompts the user to enter values to populate the max heap.
     * Continues to accept values until the user enters -1.
     */
	public static void getValues() {
		numbersHeap = new MaxHeap<>();
		
		int userInput;
		do {
            System.out.print("Enter a value (-1 to exit): ");
            userInput = Launcher.scanner.nextInt();
            Launcher.scanner.nextLine();

            if (userInput != -1) {
                numbersHeap.add(userInput);
            }

        } while (userInput != -1);
	}
	
	/**
     * Finds and prints the k-th largest value in the max heap.
     * 
     * @param n The order of the largest element to find (k-th largest).
     */
	private void findValue(int n) {
		int ctr = 1;
		int largest = 0;
		while(!numbersHeap.isEmpty() && ctr <= n) {
			largest = numbersHeap.removeMax();
			ctr++;
		}
		System.out.println(largest + " is the K(" + n + ")th largest element");
		return;
	}
			
}
