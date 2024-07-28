package Array;

import java.util.Scanner;

public class MatrixAddition {
    
    public static void printArray(int a[][], int r1, int c1) {
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void addition(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if(r1 != r2 || c1 != c2) {
            System.out.println("You entered different rows and columns for the two matrices.");
            return;
        } 
        
        int arr[][] = new int[r1][c1];  
        
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                arr[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(arr, r1, c1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for the first matrix:");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int c1 = sc.nextInt();
        
        int a[][] = new int[r1][c1];
        System.out.println("Enter the elements of the first matrix:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the number of rows for the second matrix:");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int c2 = sc.nextInt();
        
        int b[][] = new int[r2][c2];
        System.out.println("Enter the elements of the second matrix:");
        for(int i = 0; i < r2; i++) {  // Corrected to use r2
            for(int j = 0; j < c2; j++) {  // Corrected to use c2
                b[i][j] = sc.nextInt();
            }
        }
        
        addition(a, r1, c1, b, r2, c2);
    }
}
