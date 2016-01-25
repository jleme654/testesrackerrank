package br.com.hackerrank.day25;

import java.util.Scanner;

public class Solution7 {

	static boolean isPrime(long N) {
		long S = (int) (Math.sqrt(N)), T = (int) (Math.sqrt(S)), divisors = 2, j = 2;
		for (j = 2; j < T; j++) {
			if (S % j == 0){
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
