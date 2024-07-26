package Array;

import java.util.Scanner;

public class FirstReapiting {
	
	public static int fistReapeat(int arr[]) {
		
		for(int i=0; i<arr.length -1 ; i++) {
			
			for(int j=i+1 ; j<arr.length; j++)
			if(arr[i]==arr[j]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of Elements");
		int arr[]= new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
			
		}
		System.out.println("Reapiting Elements : "+ fistReapeat(arr));
	}

}
