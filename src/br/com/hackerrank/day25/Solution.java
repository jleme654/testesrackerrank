package br.com.hackerrank.day25;

import java.util.Scanner;

public class Solution {

	static boolean isPrime(long N) {
		int divisors = 2;
		for (long j = 2; j < N; j++) {
			if (N % j == 0){
				if (divisors == 3) {
					break;
				}
				divisors++;
				break;
			}
		}
		if (divisors > 2) 
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long N;
		boolean prime = true;
		while (T-- > 0) {
			N = sc.nextLong();
			if (isPrime(N))
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
	}

}
