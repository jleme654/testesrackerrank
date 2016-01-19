package br.com.hackerrank.day18;

import java.util.Scanner;

public class Palindrome_byJulioLeme {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		String word = "racracracracecarcarcarcar";// sc.nextLine();
		int indexLast = (word.length() - 1);
		for (int i = 0; i < word.length(); i++) {
//			System.out.print(word.charAt(i) + " ");
//			System.out.print(word.charAt(indexLast) + "\n");
			if (i==indexLast) {
				break;
			}
			char c = word.charAt(i);
			char c2 = word.charAt(indexLast);
			if (c != c2) {
				System.out.print("The word, " + word + ", is not a palindrome.");
				System.exit(0);
			}
			indexLast--;
		}
		System.out.print("The word, " + word + ", is a palindrome.");
	}
}
