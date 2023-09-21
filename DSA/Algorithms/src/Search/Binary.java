/**		
 * Author: Rishabh Banerjee
 * Date: Sep 21 2023*/

package Search;

import java.util.*;

public class Binary {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7,8,9};
		System.out.println("Enter the Element to search: ");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		
		if(binarySearch(arr, search) < 0)
			System.out.println(search + " was not found in the array.");
		else
			System.out.println("Element found at index " + binarySearch(arr, search));
		
	}
	
	//returns index of the element which is found
	public static int binarySearch(int arr[], int x) {
		
		int l = 0;
		int length = arr.length - 1;
		while(l <= length) {
			int mid = l + (length - 1) / 2;
			
			if (arr[mid] == x) 
				return mid;

			if (arr[mid] < x)
				l = mid + 1;
			else
				length = mid - 1;
				
		}
		
		//return -1 when element is not found
		return -1;
	}
	

}
