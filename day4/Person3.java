package br.com.hackerrank.day4;

import java.util.Locale;
import java.util.Scanner;

public class Person3 {

	int age = 0;

	public Person3(int initial_Age) {
		if (initial_Age < 0) {
			initial_Age = 0;
			age = initial_Age;
			System.out.println("This person is not valid, setting age to 0.");
		}
	}

	public void amIOld() {
		yearPasses();
		if (age >= 0 && age < 13) {
			System.out.println("You are young.");
			yearPasses();
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
			yearPasses();
		} else if (age >= 18) {
			System.out.println("You are old.");
		} else {
		}
		;
	}

	public void yearPasses() {
		age = age + 1;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				Person3 p = new Person3(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

