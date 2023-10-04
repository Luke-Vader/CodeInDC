package Sort;

public class Quick {

	/**
	 * For the implementation, we’ll write a mergeSort function that takes in the input array and its length as the parameters. This will be a recursive function, so we need the base and the recursive conditions.
	 * The base condition checks if the array length is 1 and it will just return. For the rest of the cases, the recursive call will be executed.
	 * For the recursive case, we get the middle index and create two temporary arrays, l[] and r[]. Then we call the mergeSort function recursively for both the sub-arrays:
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {1,6,3,4,8,0,2,3,5,2,5,7,2};
//		int arr[] = {5,7,4,9,8,5,6,3};
		printArray(arr);
		
		//sort
		
		System.out.print("Final Sorted Array: ");
		printArray(arr);
		
	}
	
	
	/**
	 * method to display the current contents of the array
	 * @param arr
	 */
	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
