package Array;

import java.util.Arrays;

public class ArrClone {
	

	private static void printArray(int[] arr) {
	
		for (int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	   
		
	}
	public static void changVal(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=0;
		}
	}

	public static void main(String[] args) {
		int arr [] = {1,2,5,3,5};
		
	//	int arr_2 []= arr; // when we change something changes in all its references
		
		
		
		// By using clone method ,Its make copy
		
	//	int arr_2 [] = arr.clone(); 
		
		// int arr_2[] = Arrays.copyOf(arr, arr.length);
		
		int arr_2[] = Arrays.copyOfRange(arr, 0,3);

		
		
//		System.out.println("Original Array");
//		printArray(arr);
//		System.out.println();
//		System.out.println("duplicate Array");
//
//		printArray(arr_2);
		
		// by using changVal;
		
		//changVal(arr_2);
		
		System.out.println("Original Array"); 
		printArray(arr);
		System.out.println();
		System.out.println("duplicate Array");
		printArray(arr_2);
		
		
		
	
		

	}

}
