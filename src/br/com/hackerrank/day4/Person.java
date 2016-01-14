package br.com.hackerrank.day4;

import java.util.Scanner;

public class Person {

	int age;

	public Person(int initial_Age) {
		verifyInitial(initial_Age);
	}

	private int verifyInitial(int initial_Age) {
		if (initial_Age < 0) {
			System.out.println("This person is not valid, setting age to 0.");
			age = 0;
			return age;
		} else {
			age = initial_Age;
			return initial_Age;
		}
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
			return;
		}
		if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
			return;
		} else {
			System.out.println("You are old.");
			return;
		}
	}

	public void yearPasses() {
		age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
	}

}
