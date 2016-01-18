package br.com.hackerrank.day16;

import java.util.Arrays;
import java.util.Scanner;

public class Solution34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);
		int minor = Integer.MAX_VALUE, i = 0, diff = 0;
		for (i = 0; i < (n - 1); i++) {
			diff = Math.abs(arr[i] - arr[i + 1]);
			if (diff < minor)
				minor = diff;
		}
		for (i = 0; i < (n - 1); i++) {
			if (diff == minor)
				System.out.print(arr[i] + " " + arr[i + 1] + " ");
		}
	}
}
