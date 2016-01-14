package br.com.hackerrank.day8;

import java.util.ArrayList;
import java.util.Scanner;

class Solution4 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String name = "";
		int phone = 0;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			name = in.nextLine();
			phone = in.nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append(name.toLowerCase());
			sb.append("=");
			String ph = String.valueOf(phone);
			if (ph.toString().length() == 8 && !ph.toString().startsWith("0")) {
				sb.append(ph);
			} 
			list.add(sb.toString());
			in.nextLine();
		}

		for (String string : list) {
			name = in.nextLine();
			if (string.contains(name)) {
				System.out.println(string);
			} else {
				System.out.println("Not found");
			}
		}

	}

}