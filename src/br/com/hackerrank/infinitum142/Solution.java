package br.com.hackerrank.infinitum142;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int n2 = sc.nextInt();
		double a = 2;
		double b = 1;
		double c = a/b;
		double d = 2*c;
		double result = Math.tan(c);
		double result2 = Math.tan(d);
//		result = Math.abs(result);
//		result2 = Math.abs(result2);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(2*(result+result2));
	}

}
