package br.com.hackerrank.day4;

import java.util.Scanner;

public class Person2 {

	static int age;

	public Person2(int initial_Age) {
		// Add some more code to run some checks on initial_Age
		if (initial_Age < 0) {
			initial_Age = 0;
			age = initial_Age;
			System.out.println("This person is not valid, setting age to 0.");
		}
	}

	public void amIOld() {
		// Do some computations in here and print out the correct statement to
		// the console
		// using System.out.println()...
		if (age >= 0 && age <= 13) {
			System.out.println("You are young.");
			yearPasses();
		}
		else if (age > 13 && age < 18) {
			System.out.println("You are teenager.");
			yearPasses();
		} 
		else if (age >= 18){
			System.out.println("You are old.");
		}
		else{};
	}

	public void yearPasses() {
		// Increment the age of the person in here
		age++;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			age = arr[i];
			Person2 p = new Person2(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}

	}
}
