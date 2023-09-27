package Sort;

public class Selection {

	public static void main(String[] args) {
		
//		int arr[] = {1,6,3,4,8,0,2,3,5,2,5,7,2};
		int arr[] = {5,7,4,9,8,5,6,3};
		selectionSort(arr);
		System.out.print("Final Sorted Array: ");
		printArray(arr);
		
	}
	
	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++)
				if (arr[j] < arr[min])
					min = j;
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			printArray(arr);
		}
		
	}

}
