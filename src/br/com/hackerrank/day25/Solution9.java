package br.com.hackerrank.day25;

import java.util.Scanner;

public class Solution9 {
		
	static boolean isPrime(long n) {
		boolean result = true;
	    if(n == 1 || n == 0)
	        result = false;
	    if(n == 2)
	        result = true;
	    if(n == 3)
	        result = true;
	    int sqrt = (int) Math.sqrt(n) + 1;
	    for(int j = 2; j < sqrt;j++){
	       if(n % j == 0)
	           result = false;
	    }
	    return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long N;
		while (T-- > 0) {
			N = sc.nextLong();
			if (isPrime(N))
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
	}

}