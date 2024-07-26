package Array;

import java.util.Scanner;

public class SquareArr {
	public static void  sort(int arr[]) {
		
	//1 3 43 4 5 5
		
		for(int i=0; i<= arr.length-1;i++) {
			for(int j=0; j<=arr.length-1;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
					
				}
			}
			
			
		}
		
	}
    
	public static int[] findSquareOfArr(int arr[]) {
	    int n = arr.length;
	    int left = 0;
	    int right = n - 1;
	    int[] result = new int[n];
	    int k = n - 1;

	    while (left <= right) {
	        if (Math.abs(arr[left]) > Math.abs(arr[right])) {
	            result[k--] = arr[left] * arr[left];
	            left++;
	        } else {
	            result[k--] = arr[right] * arr[right];
	            right--;
	        }
	    }
	    return result;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of Array");
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int arr1[] = findSquareOfArr(arr);
//        sort(arr1);
        System.out.println("Squares of array elements in non-decreasing order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }
}
