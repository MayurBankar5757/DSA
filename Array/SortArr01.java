package Array;

import java.util.Scanner;
// sort the array using zeros frequency

public class SortArr01 {

	public static void SortArray(int arr[]) {
		
		int  n = arr.length;
		int zeros =0;
		for(int i=0; i<n;i++ ) {
		 if(	arr[i]==0) {
			 zeros++;
		 }
		}
		
		for(int i=0; i<n; i++) {
			if(i<zeros) {
				arr[i]=0;
			}
			else {
				arr[i]=1;
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
		
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the Elements of array");
		int arr[] = new int [n];
		for(int i=0; i<n;i++) {
			
			 arr[i] = sc.nextInt();
		}
		
		SortArray(arr);
		
	}

}
