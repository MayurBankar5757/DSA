package Array;

import java.util.Scanner;

public class PrefixSumArr {
	
	// prefix sum using new array
	
	public static int [] prefixSum(int arr[]) {
		
		int prefix[] = new int [arr.length];
		prefix[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			prefix[i] = prefix[i-1]+arr[i];
			
		}
		
		return prefix;
	}
	
	// prefix sum using existing array
	
	public static void prifixSum1(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			arr[i] = arr[i-1] + arr[i];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		System.out.println("Enter the elements of array");
		int arr [] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//int prefix[]= prefixSum(arr);
		
		prifixSum1(arr);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
