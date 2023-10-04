package Sort;

public class Shell {

	public static void main(String[] args) {
		
		int arr[] = {1,6,3,4,8,0,2,3,5,2,5,7,2};
//		int arr[] = {5,7,4,9,8,5,6,3};
		printArray(arr);
		shellSort(arr);
		System.out.print("Final Sorted Array: ");
		printArray(arr);
		
	}
	
	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void shellSort(int arr[]) {
		
		int n = arr.length;
		  
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            
            for (int i = gap; i < n; i++)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
            printArray(arr);
        }
		
	}

}
