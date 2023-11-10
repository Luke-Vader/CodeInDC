/**		
 * Author: Rishabh Banerjee
 * Date: Sep 21 2023*/

package Sort;

public class Insertion {

	public static void main(String[] args) {
		
//		int arr[] = {1,6,3,4,8,0,2,3,5,2,5,7,2};
		int arr[] = {100, 2, 9, 101, 16, 27, 15};
		
		printArray(arr);
		insertionSort(arr);
		System.out.print("Final Sorted Array: ");
		printArray(arr);
	}
	
	
	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int arr[]) {
		System.out.println("Sorting");
		for (int i = 1; i < arr.length; ++i) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			printArray(arr);
		}
	}
}
