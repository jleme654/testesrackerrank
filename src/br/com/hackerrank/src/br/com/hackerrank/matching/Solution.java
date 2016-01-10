package br.com.hackerrank.matching;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	static void checker(String Regex_Pattern) {

		Scanner Input = new Scanner(System.in);
		String Test_String = Input.nextLine();
		String test = Test_String.substring(40, 45);
		String test2 = "";
		if (test.contains(" ")) {
			test2 = test.replaceAll(test, "__________");
		}
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(test2);
		System.out.println(m.find());
	}

	public static void main(String[] args) {
		checker("__________"); // Use \\ instead of using \
	}

}
