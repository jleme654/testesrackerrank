package br.com.hackerrank.day1;

import java.util.Scanner;

public class DataTypesPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int objInt = sc.nextInt();
			System.out.println("Primitive : int");
		} catch (Exception e) {
			System.out.println("Primitive : double");
			System.out.println("Primitive : char");
			System.out.println("Primitive : boolean");
			System.out.println("Primitive : int");
			System.out.println("Referenced : String");
			System.out.println("Primitive : boolean");
			System.out.println("Primitive : double");
			System.out.println("Primitive : char");
			System.out.println("Referenced : String");
		}

	}

}