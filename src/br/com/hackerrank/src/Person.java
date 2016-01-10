import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Person {

	static int age;

	public Person(int initial_Age) {
		if (initial_Age < 0 && initial_Age >= -5) {
			initial_Age = 0;
			age = initial_Age;
			System.out.println("This person is not valid, setting age to 0.");
		} else {
			yearPasses();
		}
	}

	public void amIOld() {
		while (true) {
			yearPasses();
			if (age < 13) {
				yearPasses();
				System.out.println("You are young.");
				break;
			} else if (age >= 13 && age < 18) {
				yearPasses();
				System.out.println("You are a teenager.");
				break;
			} else {
				yearPasses();
				System.out.println("You are old.");
				break;
			}
		}
	}

	public void yearPasses() {
		age = age + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			age = sc.nextInt();
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
