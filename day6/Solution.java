package br.com.hackerrank.day6;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		String full = "#", empty = " ";
		//int count = 1;
		int tam2 = tam;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < tam; i++) {
			for (int i2 = 0; i2 < tam2; i2++) {
				if (i2 == tam2 - 1) {
					//for (int j = 0; j < count; j++) {
						sb.append(full);
						System.out.print(sb.toString());
					//}
				} else {
					System.out.print(empty);
				}
			}
			tam2--;
			System.out.println();
		}

	}

}
