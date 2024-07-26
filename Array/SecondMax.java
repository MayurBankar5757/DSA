package Array;

import java.util.Scanner;


public class SecondMax {
	
//	public static int firstMax(int arr[]) {
//		int max=Integer.MIN_VALUE;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		return max;
//	}
//	public static int secondMax(int arr[]) {
//		int max = firstMax(arr);
//		System.out.println(max);
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == max) {
//				arr[i]=Integer.MIN_VALUE;
//			}
//		}
//		
//		int a = firstMax(arr);
//		return a;
//	}

	public static int secondMax(int arr[]) {
	    int max = Integer.MIN_VALUE;
	    int secondMax = Integer.MIN_VALUE;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > max) {
	            secondMax = max;  // Update secondMax before updating max
	            max = arr[i];
	        } else if (arr[i] > secondMax && arr[i] != max) {
	            secondMax = arr[i];
	        }
	    }

	    return secondMax;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the Elements of Array");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(secondMax(arr));
	}
}
