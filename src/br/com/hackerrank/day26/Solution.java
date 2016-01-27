package br.com.hackerrank.day26;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int fine = 0;
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();

		int d2 = sc.nextInt();
		int m2 = sc.nextInt();
		int y2 = sc.nextInt();

		if (y > y2) {
			fine = 10000;
			System.out.println(fine);
		} else if (m > m2) {
			int numlatemonths = Math.abs(m - m2);
			fine = numlatemonths * 500;
			System.out.println(fine);
		} else if (m == m2) {
			int numlatedays = Math.abs(d - d2);
			fine = 15 * numlatedays;
			System.out.println(fine);
		} else if (y == y2 && m <= m2 && d <= d2) {
			fine = 0;
			System.out.println(fine);
		}

	}
}
