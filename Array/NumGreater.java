package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NumGreater {
	
	public static void printArray(int arr[], int num) {
		int count =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>num) {
				count++;
			}
		}
		System.out.println("count Value : " +count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		
	    int arr[]= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		
		printArray( arr, num);
		
	}

}
