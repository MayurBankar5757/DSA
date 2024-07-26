package Array;

import java.util.Scanner;

public class FindFrquencyOfNum {

	private static int[] makeFrequencyNum(int[] arr) {
		int frquency[] = new int[10005];

		for (int i = 0; i < arr.length; i++) {
			frquency[arr[i]]++;
		}
		return frquency;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");

		int n = sc.nextInt();

		System.out.println("Enter the Element of the array");

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int frequency[] = makeFrequencyNum(arr);

		System.out.println("enter the number of Queries");

		int q = sc.nextInt();

		while (q > 0) {
			System.out.println("Enter number to be searched");
			int x = sc.nextInt();
			if (frequency[x] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			q--;
		}

	}

}
