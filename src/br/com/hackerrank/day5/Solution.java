package br.com.hackerrank.day5;

import java.util.Scanner;

public class Solution {

	static void printTestCases(int a,int b, int N){
		int total = 0;
		for (int i = 0; i < N; i++) {
			double result = Math.pow(2, i);
			total = total + (int)result*b; 
			System.out.print(a + total + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a, b, N;
		for (int i = 0; i < T; i++) {
		   a = sc.nextInt();
		   b = sc.nextInt();
		   N = sc.nextInt();
		   printTestCases(a,b,N);
		   System.out.println();
		}
	}

}
