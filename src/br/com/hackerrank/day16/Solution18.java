package br.com.hackerrank.day16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Solution18 {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int[] arr = new int[n];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = sc.nextInt();
		// }

		// int[] arr = { 5, 4, 3, 2 };
		int[] arr = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 };

		int z = 0;
		HashSet<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[i] == arr[j]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					list.add(z);
				}
			}
		}

		Object[] arrComp = null;
		arrComp = list.toArray();
		int minor = (int) arrComp[0];
		for (int i = 0; i < arrComp.length; i++) {
			if ((int) arrComp[i] < minor && (int) arrComp[i] != 0) {
				minor = (int) arrComp[i];
			}
		}

		for (int j = arr.length - 1; j > 0; j--) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[j] == arr[i]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					if (z == minor) {
						System.out.print(arr[i] + " " + arr[j] + " ");
					}
				}
			}
		}
	}
}
