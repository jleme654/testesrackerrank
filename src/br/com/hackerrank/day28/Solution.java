package br.com.hackerrank.day28;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < testCases; i++) {
			String word = in.nextLine();
			try {
				Pattern p = Pattern.compile(word);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
	}

}
