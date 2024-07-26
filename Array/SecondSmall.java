package Array;

import java.util.Scanner;

public class SecondSmall {
	
	
	
	public static int secondSmall(int arr[]) {
	    int min = Integer.MAX_VALUE;
	    int secondMin = Integer.MAX_VALUE;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < min) {
	        	
	            secondMin = min;  
	            min = arr[i];
	        } else if (arr[i] < secondMin && arr[i] != min) {
	            secondMin = arr[i];
	        }
	    }

	    return secondMin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int n = sc.nextInt();

		System.out.println("Enter the number of Elements");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Second Minimum : " + secondSmall(arr));

	}
}
