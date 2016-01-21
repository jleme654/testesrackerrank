package br.com.hackerrank.day20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		StringTokenizer token = new StringTokenizer(in, "![ ,?.\\_'@+]");
		int count = 0;
		while (token.hasMoreTokens()) {
			sb.append(token.nextToken() + "\n");
			count++;
		}
		System.out.println(count);
		System.out.println(sb);
	}
}
