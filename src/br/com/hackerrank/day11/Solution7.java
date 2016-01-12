package br.com.hackerrank.day11;

public class Solution7 {

	public static void main(String[] args) {
		int n = 5;
		int arr[][] = { { 1, 2, 3, 4 ,5}, 
				        { 5, 4, 3, 2, 1 }, 
				        { 1, 2, 3, 4, 5 }, 
				        { 5, 4, 3, 2, 1 },
				        { 1, 2, 3, 4, 5 }};
		int i = 0, j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");

		int count = 3, k = 0, k2 = 0, x = 0, sum = 0, linha = 0, coluna = 0, zero = 0, um = 1, dois = 2, total = n -2;
		for (x = 0; x < total; x++) {
			for (k = linha; k < 3; k++) {
				for (k2 = coluna; k2 < count; k2++) {
					System.out.print(arr[k][k2] + " ");
					sum += arr[k][k2];
				}
				System.out.println();
			}
			System.out.println("---------------");
			sum -= arr[um][zero];
			sum -= arr[um][dois];
			System.out.println(sum + "\n");
			coluna++;
			count++;
			zero++;
			dois++;
			sum = 0;
		}

	}
}
