package br.com.hackerrank.day11;

import java.util.Scanner;

public class Solution9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		int c, d=0, i;
		boolean f = true;
		for (i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();

			}
		}
		for (i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				c = arr[i][j] + 
						arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] +
						arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
				if (d <= c) {
					d = c;
				}
			}

		}
		System.out.println(d);
	}

}
