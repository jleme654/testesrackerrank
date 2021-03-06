package br.com.hackerrank.day11;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();

			}
		}

		int c = 0, d = Integer.MIN_VALUE, e = 1;
		for (e = 1; e < 5; e++) {
			for (int j = 1; j < 5; j++) {
				int line1 = arr[e - 1][j - 1] + arr[e - 1][j] + arr[e - 1][j + 1];
				int line2 = arr[e][j];
				int line3 = arr[e + 1][j - 1] + arr[e + 1][j] + arr[e + 1][j + 1];
				c = line1 + line2 + line3;
				if (d <= c) {
					d = c;
				}
			}

		}
		System.out.println(d);
	}

}
