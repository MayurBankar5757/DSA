package Array;

import java.util.Scanner;

public class ArrNumPre {
	
	public static void NumPresent(int arr[],int num) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.print("present");
				break;
			}
			
		}
	}
	
   public static void main(String[] args) {
	
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Value for size of arr");

      int n = sc.nextInt();
      System.out.println("Enter Value for num");
      int num = sc.nextInt();
      
	   int  arr [] = new int[n];
	      System.out.println("Enter Value for arr");

	   for(int i=0; i<n; i++) {
		   arr[i] = sc.nextInt();
	   }
	   NumPresent(arr, num);
	  
   }	
	
	
	

}
