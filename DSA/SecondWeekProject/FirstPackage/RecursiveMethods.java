/** 
 * Author: Rishabh Banerjee
 * Date: Sep 13 2023
 * Class to demonstrate recursion */

package FirstPackage;

public class RecursiveMethods {

	public static void main(String[] args) {
		
//		countDown(10);
//		countUp(10);
//		System.out.println(sumOf(6));
		
		System.out.println(product(4,7));
		
		displayRowOfCharacters('&', 7);
		
	}
	
	
	//method to display from n to 1 in descending order
	public static void countDown(int n) {
		if (n == 1)							//condition to stop iteration
			System.out.println(n);
		else {
			System.out.println(n);
			countDown(n-1);
		}
		//at this point the control is returned
	}
	
	
	//method to display from 1 to n in ascending order
	public static void countUp(int n) {
		if (n == 1)							//condition to stop iteration
			System.out.println(n);
		else {
			countUp(n-1);
			System.out.println(n);
		}
		//at this point the control is returned
	}
		
	//method to return the sum of the digits from n to 1
	public static int sumOf(int n) {
		return (n > 0 ? n + sumOf(n-1) : 0);
	}
	
	//method to multiply n times
	public static int product(int n, int times) {
		return (times > 0 ? n + product(n, times - 1): 0);
	}
	
	//method to display n number of character c 
	public static void displayRowOfCharacters(char c, int n) {
		if (n == 1)
			System.out.print(c);
		else {
			displayRowOfCharacters(c, n-1);
			System.out.print(c);
		}
		
	}
	
	
	
	

}
