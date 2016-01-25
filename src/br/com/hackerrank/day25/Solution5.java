package br.com.hackerrank.day25;

import java.util.Scanner;

public class Solution5 {

	public static int isPrime(long N) {
		long S = (int) (Math.sqrt(N));
		if (N <= 1)
			return 0;
		else if (N % 2 == 0)
			return 0;
		else {
			for (long i = 3; i <= S; i += 2) {
				if (N % i == 0)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long N;
		while (T-- > 0) {
			N = sc.nextLong();
			if (isPrime(N) == 0)
				System.out.println("Not prime");
			else
				System.out.println("Prime");
		}
	}

}
