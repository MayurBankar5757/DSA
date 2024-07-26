package Array;

import java.util.Scanner;

public class PairSum {
	
	public static int pairSum(int arr[],int target) {
		int ans = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					
					ans++;
				}
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the target sum");
		int target = sc.nextInt();
		System.out.println("Enter the Element of Array");
		int arr [] = new int [n];
		
				for(int i=0; i<n;i++) {
					arr[i] = sc.nextInt();
				}
		System.out.println(pairSum(arr, target));
	}
}
