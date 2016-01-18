package br.com.hackerrank.day16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Solution33 {

	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// int n = sc.nextInt();
	// int[] arr = new int[n];
	// for (int i = 0; i < arr.length; i++) {
	// arr[i] = sc.nextInt();
	// }

	 int[] arr = { -20, -3916237, -357920, -3620601, 7374819, -7330761,
	 30, 6246457, -6461594, 266854 };
//	int[] arr = { 5, 4, 3, 2 };

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < n; i++)
//			arr[i] = sc.nextInt();
//		int[] arr = { 5, 4, 3, 2 };
		int[] arr = { -20, -3916237, -357920, -3620601, 7374819, -7330761,
				 30, 6246457, -6461594, 266854 };
		int n = arr.length;
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < (n - 1); i++) {
			int ab = Math.abs(arr[i] - arr[i + 1]);
			if (ab < min)
				min = ab;
		}
		for (int i = 0; i < (n - 1); i++) {
			int ab = Math.abs(arr[i] - arr[i + 1]);
			if (ab == min) {
				System.out.print(arr[i] + " " + arr[i + 1] + " ");
			}
		}
	}
}
