package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Small_LargeArray {
	
	private static int [] small_Large_Ele(int [] arr) {
		int arr_1[] = new int [2];
		for(int i=1; i<arr.length;i++) {
			
			if(arr[i-1] > arr[i]) {
				
				int temp = arr[i-1];
				arr [i-1] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		arr_1[0]= arr[0];
		arr_1[1]= arr[arr.length-1];
	
		return arr_1 ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter size of array");
		int n = sc.nextInt();
	
		int arr[] = new int[n];
	    System.out.println("Enter Elements of array");
	    
	    for(int i=0; i<n; i++) {
	    	arr[i]= sc.nextInt();
	    	
	    }
//	    for(int i=0; i<n; i++) {
//	    	arr[i]= sc.nextInt();
//	    	
//	    }
	    
	 int arr_3[]= small_Large_Ele(arr);
	 System.out.println(Arrays.toString(arr_3));
	}
}
