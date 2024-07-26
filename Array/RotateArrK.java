package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrK {
	
//	public static void rotateK(int arr[], int  k) {
//		
//		int n= arr.length;
//		 k = n%k;
//		int j =0;
//		int arr1[] = new int [n];
//		
//		for(int i =n-k; i<n; i++) {
//			arr1[j++] = arr[i];
//		}
//		
//		for(int i=0; i<n-k; i++) {
//			arr1[j++]= arr[i];
//		}
//		
//		System.out.println(Arrays.toString(arr1));
//		
//	}
	
	// Another approach i.e. inplace 
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	public static void reverseArr(int arr[],int i, int j) {
		
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	
public static void rotateK(int arr[], int  k) {
		
		int n= arr.length;
		 k = k%n;
		
		reverseArr(arr,0,n-k-1);
		reverseArr(arr,n-k,n-1);
		reverseArr(arr,0,n-1);

		
		
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the size of k");
		int k = sc.nextInt();
		
		System.out.println("Enter the Element of the array");
		
		int arr [] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		rotateK(arr, k);
	}

}
