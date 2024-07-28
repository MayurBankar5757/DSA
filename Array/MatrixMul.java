package Array;

import java.util.Scanner;

public class MatrixMul {
    
    public static void printArray(int[][] a, int r1, int c2) {
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if(c1 != r2) {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
            return;
        } 
        
        int[][] mul = new int[r1][c2];  
        
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printArray(mul, r1, c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for the first matrix:");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int c1 = sc.nextInt();
        
        int[][] a = new int[r1][c1];
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
        
        int[][] b = new int[r2][c2];
        System.out.println("Enter the elements of the second matrix:");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        multiplication(a, r1, c1, b, r2, c2);
    }
}
