package Array;

import java.util.Scanner;


public class ReverseArr {
//
//	public static void reverseArr(int arr[]) {
//		
//		int i=arr.length-1, j=0 , t=0;
//		int arr2[]   = new int [arr.length];
// 		while(i>=0) {
//			arr2[j++]=arr[i--];
//		}
// 		System.out.println("Reverse Array : ");
// 		
// 		while(t < arr2.length) {
// 			System.out.println(arr2[t]);
// 			t++;
// 		}
//		
//	}
	
	
	// reverse array without using the new array
	
	public static void swapArr(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
	}
	public static void reverseArr(int arr[]) {
		
		int i=0, j=arr.length-1 , t=0;
		
		while(i<j) {
			swapArr(arr,i,j);
			i++;
			j--;
		}
		
		// to print array
		while(t < arr.length) {
 			System.out.println(arr[t]);
 			t++;
 		}
	} 
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of Array:");
	        int n = sc.nextInt();

	        System.out.println("Enter the elements of the Array:");
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        sc.close(); // Close the scanner to avoid resource leak

	        reverseArr(arr);
	    }
}
