package Array;

import java.util.Scanner;

public class ArrSumInRange {

    public static int[] prefixSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
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
        int prefix[] = prefixSum(arr);
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the range");
            int l = sc.nextInt() - 1;  // Convert to 0-based index
            int r = sc.nextInt() - 1;  // Convert to 0-based index
            int ans;

            if (l == 0) {
                ans = prefix[r];
            } else {
                ans = prefix[r] - prefix[l - 1];
            }

            System.out.println("Ans: " + ans);
        }
        sc.close();
    }
}
