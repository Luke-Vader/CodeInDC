/**
 * Date: Sep 27 2023
 * Recursive Search Application
 */
package Recursive;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rishabh Banerjee
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int arr[] = {1,5,6,8,9,7,3,0,2};
		ArrayList<Integer> sampleData = new ArrayList<>();
		boolean nextFlag = true;
		boolean minFlag = true;
		
		
		//user input for the data
		while (minFlag) {
			sampleData = new ArrayList<>();
			nextFlag = true;
			
			//taking in each element
			while (nextFlag) {
				System.out.println("Enter Sample Data Elements: (-99 to exit) ");
				int n = sc.nextInt();
				if(n == -99)
					nextFlag = false;
				else
					sampleData.add(n); 
			}
			
			//checking size of the array
			if (sampleData.size() >= 7)
				minFlag = false;
			else {
				System.out.println("Minimum 7 elements required");
			}
		}
		
		//converting from ArrayList to array
		int arr[] = new int[sampleData.size()];
		for (int i = 0; i < sampleData.size(); ++i) {
			arr[i] = sampleData.get(i);
		}
		
		//displaying sample data set
		System.out.println("Sample Data Set: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		//search query
		System.out.print("\n\nEnter Element to Search: ");
		int x = sc.nextInt();
		System.out.println(x + " was found at index " + recursiveSearch(arr, x));
		sc.close();
	}
	
	/**
	 * @param arr the array which needs to be queried
	 * @param x the element which is to be searched	
	 * */
	public static int recursiveSearch(int arr[], int x) {
		
		
		/**	
		 * decrease the size of the array by one element at each iteration
		 * check if last element is queried element
		 * pass new smaller array to recursive function
		 **/
		int lastElement = arr.length-1;
		if(arr.length == 0)
			return -1;
		else if(arr[lastElement] == x)
			return lastElement;
		else { 
			int newArr[] = new int[lastElement];
			for (int i = 0; i < lastElement; i++) {
				newArr[i] = arr[i];
			}
			return recursiveSearch(newArr, x);
		}
	}

}
