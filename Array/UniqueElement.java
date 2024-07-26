package Array;

import java.util.Scanner;

public class UniqueElement {
	
//	public static int uniqueEle(int arr[]) {
//		int ans=0;
//		for(int i=0; i<arr.length-1;i++) {
//			for(int j=1; j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr[i]=-1;
//				}
//			}
//		}
//		for(int i=1; i<arr.length;i++) {
//			if(arr[i]>1) {
//				ans = arr[i];
//			}
//		}
//		return ans;
//	}
	
	//for boolean output
	 public static boolean uniqueEle(int arr[]) {
	        boolean[] isDuplicate = new boolean[arr.length];
	        boolean hasUnique = false;

	        // Mark duplicates in the array
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    isDuplicate[i] = true;
	                    isDuplicate[j] = true;
	                }
	            }
	        }

	        // Check for non-duplicate elements
	        for (int i = 0; i < arr.length; i++) {
	            if (!isDuplicate[i]) {
	                hasUnique = true;
	                break;  // Once we find a unique element, we can stop
	            }
	        }

	        return hasUnique;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n= sc.nextInt();
		System.out.println("Enter the ArrayElements");
	     int arr []= new int [n];
	     for(int i=0; i<n;i++) {
	    	 arr[i] = sc.nextInt();
	    	 
	     }
	     
	     System.out.println(uniqueEle(arr));
	     
		
	}

}
