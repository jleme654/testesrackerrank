package br.com.hackerrank.day4;

import java.util.Locale;
import java.util.Scanner;

public class Person4 {

	static int age2 = 0;

	public Person4(int initial_Age) {
		if (initial_Age < 0) {
			initial_Age = 0;
			age2 = initial_Age;
			System.out.println("This person is not valid, setting age to 0.");
		}
	}
	
	public void amIOld() {
		yearPasses();
		if (age2 >= 0 && age2 < 13) {
			System.out.println("You are young.");
		}
		else if (age2 >= 13 && age2 < 18) {
			System.out.println("You are teenager.");
			} 
		else if (age2 >= 18){
			System.out.println("You are old.");
		}
		else{};
	}

	public void yearPasses() {
		age2++;
	}

	public static void main(String[] args) {
    	try {
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				age2 = sc.nextInt();
				Person4 p = new Person4(age2);
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
