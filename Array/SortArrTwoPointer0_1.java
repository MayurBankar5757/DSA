package Array;

import java.util.Scanner;

public class SortArrTwoPointer0_1 {
	
	
	public  void  swap(int arr[] , int i , int j) {
		int temp = arr[i] ;
		arr[i] = arr[j];
		arr[j] = temp;	
	}
	
	
	public  void sort_0_1(int arr[]) {
		int n = arr.length;
		int  i=0;
		int j = n-1;
		SortArrTwoPointer0_1 s = new SortArrTwoPointer0_1();


		while(i<j) {
			
			if(arr[i] ==1 && arr[j]== 0) {
				s.swap(arr,i,j);
				i++;
				j--;
			}
			if(arr[i]==0) {
				i++;
			}
			if(arr[j]==1) {
				j--;
			}
		}
		for(int t =0; t< n; t++) {
			System.out.print(arr[t]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of Array");
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		SortArrTwoPointer0_1 s = new SortArrTwoPointer0_1();
		s.sort_0_1(arr);
	}

}
