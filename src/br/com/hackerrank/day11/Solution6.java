package br.com.hackerrank.day11;

public class Solution6 {

	static int numAmp = 3;
	static int numAmp2 = 3;
	static int numZero = 0, numOne = 1, numTwo = 2;

	static int getSum(int[][] arr, int linha, int coluna) {
		int sum = 0;
		for (int i = linha; i < 3; i++) {
			if (numAmp>3) {
				numAmp=4;
			}
			for (int j = coluna; j < numAmp; j++) {
				sum += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		sum -= arr[numOne][numZero];
		sum -= arr[numOne][numTwo];
		numZero++;
		numTwo++;
		numAmp++;
		return sum;
	}

	public static void main(String[] args) {
		int n = 4;
		int arr[][] = { { 1, 2, 3, 4 }, { 4, 3, 2, 1 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 }};
		int i = 0, j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");

		int total = n - (numAmp - 1);

		for (int i2 = 0; i2 < total; i2++) {
			for (i = 0; i < total; i++) {
				System.out.println(getSum(arr, i2, i) + " ");
				System.out.println();
			}
			System.out.println("=============");
			numZero=0;
            numOne=1;  		    
		    numTwo=2;
		    numAmp++;
			total++;
		}

	}
}
