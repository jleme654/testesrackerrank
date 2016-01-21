package br.com.hackerrank.day20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String in = sc.nextLine();
		String in = "He is a very very good boy, isn't he?";
		
		String str = in.replaceAll(" ", "\n");
		str.replaceAll("'", "");
		str.replaceAll(",", "UUU");
//		in.replaceAll("?", "");
		System.out.println(str);
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < in.length(); i++) {
//			char c = in.charAt(i);
//			String regex = "![,?.\\_'@+]";
//			if (String.valueOf(c).matches(regex)) {
//				sb.append(c);
//			}
//		}
//		System.out.println(sb.toString());
	}
}
