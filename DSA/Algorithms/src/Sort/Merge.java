package Sort;

public class Merge {

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
		mergeSort(arr, arr.length);
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
	
	/**
	 * 
	 * @param arr		the array itself
	 * @param n			length of the array
	 */
	public static void mergeSort(int[] arr, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = arr[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = arr[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    merge(arr, l, r, mid, n - mid);
	}
	
	/**
	 * method which actually does the switching for us
	 * @param arr
	 * @param l
	 * @param r
	 * @param left
	 * @param right
	 */
	public static void merge(int[] arr, int[] l, int[] r, int left, int right) {
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            arr[k++] = l[i++];
	        }
	        else {
	            arr[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	        arr[k++] = l[i++];
	    }
	    while (j < right) {
	        arr[k++] = r[j++];
	    }
	    printArray(arr);
	}

}
