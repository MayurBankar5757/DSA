package Array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallandLarge {
			
		public static int [] findKthLargest(int[] array, int k) {
		        Arrays.sort(array);
		        int arr[] = { array[0],array[array.length - k]} ; // k th smallest and largest
		        return   arr ; 
		    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the k th  of element");

		int k = sc.nextInt();
		System.out.println("Enter the Element of Array");

	
		int arr []= new int [n];
		for(int i=0; i<n ;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(findKthLargest(arr, k))); 
	}
}
