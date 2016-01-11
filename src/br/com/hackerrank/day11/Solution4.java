package br.com.hackerrank.day11;

import java.util.Scanner;

public class Solution4 {

	static int numAmp = 3;
	static int numZero = 0, numOne = 1, numTwo = 2;
	

	static int getSum(int[][] arr, int linha, int coluna) {
		int sum = 0;
		for (int i = linha; i < numAmp; i++) {
			for (int j = coluna; j < numAmp; j++) {
				sum += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		sum -= arr[1][0];
		sum -= arr[1][2];
		numAmp++;
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[n][n];
		int i = 0, j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int total = n - (numAmp - 1);
		for (i = 0; i < total; i++) {
			System.out.println(getSum(arr, i, i) + " ");
			System.out.println();
		}

	}
}
