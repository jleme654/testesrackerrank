package br.com.hackerrank.day29;

import java.io.*;
import java.util.*;

public class Solution3 {
	public static void main(String[] args) {
		String output = new String("Funny");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int testCases = Integer.parseInt(sc.nextLine());
		while (testCases > 0) {
			String s = sc.nextLine();
			StringBuffer r = new StringBuffer(s);
			r.reverse();
			for (int i = 0; i < s.length() - 1; i++) {
				count = 0;
				int x = Math.abs((int) s.charAt(i + 1) - (int) s.charAt(i));
				int y = Math.abs((int) r.charAt(i + 1) - (int) r.charAt(i));

				if (x != y) {
					System.out.println("Not Funny");
					break;
				} else
					count++;
			}
			// System.out.print(count);
			if (count > 0)
				System.out.println("Funny");
			testCases--;
		}
	}
}