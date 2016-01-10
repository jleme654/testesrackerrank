import java.util.Locale;
import java.util.Scanner;import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Person2 {

	static int age = 0;
    int thirteen = 13;
	int eighteen = 18;

	public Person2(int initial_Age) {
		if (initial_Age < 0) {
			initial_Age = 0;
			age = initial_Age;
			System.out.println("This person is not valid, setting age to 0.");
			yearPasses();
		}
	}

	public void amIOld() {
		yearPasses();
		if (age >= 0 && age < thirteen) {
			System.out.println("You are young.");
		} else if (age >= thirteen && age < eighteen) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
		yearPasses();
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
				Person2 p = new Person2(age);
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

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		int[] arr = new int[T];
//		for (int i = 0; i < T; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			age = arr[i];
//			Person p = new Person(age);
//			p.amIOld();
//			for (int j = 0; j < 3; j++) {
//				p.yearPasses();
//			}
//			p.amIOld();
//			System.out.println();
//		}
//
//	}

}
