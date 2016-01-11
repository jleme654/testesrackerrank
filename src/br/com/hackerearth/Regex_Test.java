package br.com.hackerearth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex_Test {

	public void checker(String Regex_Pattern) {

		Scanner Input = new Scanner(System.in);
		String Test_String = Input.nextLine();
		String test = Test_String.substring(40, 45);
		String test2 = "";
		if (test.contains(" ")) {
			System.out.println("entrou");
			test2 = test.replaceAll(test, "__________");
		}
		System.out.println(test2);
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(test2);
		System.out.println(m.find());
	}

}
