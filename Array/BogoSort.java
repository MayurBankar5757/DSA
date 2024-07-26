package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BogoSort {
	
	static boolean isSort(ArrayList<Integer> a) {
		
		for (int i = 0; i < a.size()-1; i++) {
			if(a.get(i) > a.get(i+1)) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(7);
		arr.add(9);
		arr.add(6); 
		arr.add(3);
		arr.add(4);
		arr.add(6);
		arr.add(5);
		arr.add(24);
		arr.add(14);
		
		
		 int count=0;
		    while (!isSort(arr)) {
		       
				System.out.println("Not Sorted");
				
				count++;
				Collections.shuffle(arr);
				
				
			}
		    System.out.println("Sorted");
		    System.out.println("Count ==> "+count);
	}
}
