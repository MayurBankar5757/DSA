package Array;

import java.util.Scanner;

public class TripletSum {
	
	public static int TripletSum1 (int arr[],int  target) {
		int ans=0;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length; j++) {
			   for (int k = j+1; k< arr.length; k++) {
				   if(arr[i]+arr[j]+arr[k] == target) {
					   ans++;
				   }
				
			}
			}
			
		}
		return ans;
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the Target Sum");
		int target = sc.nextInt();
		int arr [] = new int [n];
		
		System.out.println("Enter the Elements of Array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(TripletSum1(arr,target));
		
	}
}
