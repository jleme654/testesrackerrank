package br.com.hackerrank.day25;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			int divisors = 2;
			for (int j = 2; j < num; j++) {
				if (num % j == 0){
					divisors++;
					break;
				}
			}
			if (divisors > 2) 
				System.out.println("Not Prime");
			else
				System.out.println("Prime");
		}
	}

}
