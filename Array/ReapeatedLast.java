package Array;

import java.util.Scanner;

public class ReapeatedLast {
	
	public static int lastRepeat(int arr[]) {
	    int lastRepeating = -1; 
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                lastRepeating = arr[i];
	            }
	        }
	    }
	    return lastRepeating;
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
		System.out.println("Reapiting Elements : "+ lastRepeat(arr));

	}
	
}
