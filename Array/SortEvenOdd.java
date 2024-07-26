package Array;

import java.util.Scanner;

public class SortEvenOdd {
    
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void sortEvenOdd(int arr[]) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (arr[i] % 2 ==0) {
                i++;
            } else if (arr[j] % 2 == 1) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        
        for (int t = 0; t < n; t++) {
            System.out.print(arr[t] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortEvenOdd(arr);
    }
}
