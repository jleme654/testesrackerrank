package br.com.hackerrank.day25;

import java.util.Scanner;

public class Solution6 {

	static boolean isPrime(long N) {
		long S = (int) (Math.sqrt(N));
		if (N <= 1)
			return true;
		else if (N % 2 == 0)
			return false;
		else {
			for (long i = 3; i < N; i += 2) {
				if (N % i == 0)
					return false;
			}
		}
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
