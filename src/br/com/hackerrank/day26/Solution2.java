package br.com.hackerrank.day26;

import java.util.Scanner;

public class Solution2 {

	static int getFine(int[] arr) {
		int d = arr[0], d2 = arr[3], m = arr[1], m2 = arr[4], y = arr[2], y2 = arr[5];
		if (d <= d2 && m == m2 && y == y2) {
			return 0;
		}
		if (d > d2 && m == m2 && y == y2) {
			int d3 = Math.abs(d - d2);
			return 15 * d3;
		}
		if (m != m2 && y == y2) {
			return 500 * Math.abs(m - m2);
		}
		if (y != y2) {
			return 10000;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getFine(arr));
	}

}
