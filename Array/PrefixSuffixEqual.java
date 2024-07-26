package Array;

import java.util.Scanner;

public class PrefixSuffixEqual {
	public static int findTotalSum(int arr[]) {
		
		int totalSum =0;
		for(int i=0; i<arr.length; i++) {
			totalSum+= arr[i];
		}
		return totalSum;
	}
	
	public static boolean checkPrefixSuffix(int arr[]) {
		
		int totalSum = findTotalSum(arr);
		int prefixSum =0;
		int suffixSum =0;
		for(int i=0; i<arr.length; i++) {
			prefixSum += arr[i];
			suffixSum = totalSum - prefixSum;
			
			if(suffixSum == prefixSum) {
				return true;
			}
			
		}
		return false;
	}
	
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the Array");
	        int n = sc.nextInt();
	        System.out.println("Enter the elements of the array");
	        int arr[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	         System.out.println(checkPrefixSuffix(arr));
	        sc.close();
	    }
}
