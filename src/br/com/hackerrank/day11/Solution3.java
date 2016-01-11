package br.com.hackerrank.day11;

import java.util.Scanner;

public class Solution3 {
	
	static int numAmp = 3;

	
	static int getSum(int[][] arr){
		int sum = 0;
		for (int i = 0; i < numAmp; i++) {
			for (int j = 0; j < numAmp; j++) {
				sum += arr[i][j];
			}
		}
		sum -= arr[1][0];
		sum -= arr[1][2];
		return sum;
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[n][n];	
		for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
		System.out.println(getSum(arr)+" ");
		
	}
}
