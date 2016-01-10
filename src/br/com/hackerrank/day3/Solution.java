package br.com.hackerrank.day3;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			// indica se eh impar
			ans = "Weird";
		} else {
			// indica se eh par
			if (n > 2 && n <= 5)
				ans = "Not Weird";
			else if (n > 5 && n <= 20)
				ans = "Weird";
			else if (n > 20)
				ans = "Not Weird";
		}
		System.out.println(ans);
	}

}
