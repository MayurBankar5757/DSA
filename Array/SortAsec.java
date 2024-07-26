package Array;

import java.util.Arrays;

public class SortAsec{
	public static void main(String[] args) {
		//System.out.println("Hello Mayur");
		int arr [] = {7,8,3,2,-1,0,-1,-1,-1,-1};
		
		for(int i=0; i<= arr.length-1;i++) {
			for(int j=0; j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
					
				}
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
