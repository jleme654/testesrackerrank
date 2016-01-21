package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution37_byDharanG {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b[] = new int[a];
			for (int i = 0; i < a; i++) {
				b[i] = in.nextInt();
			}
			int min = 100000;
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					if (i == j)
						break;
					int m = Math.abs(b[i] - b[j]);
					if (min > m) {
						min = m;
					}

				}
			}
			ArrayList<Integer> ls = new ArrayList<Integer>();
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					int m = Math.abs(b[i] - b[j]);
					if (m == min) {
						ls.add(b[i]);
						// ls.add(b[j]);
					}
				}
			}
			Collections.sort(ls);
			for (int i : ls)
				System.out.printf("%d ", i);
		}

		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}