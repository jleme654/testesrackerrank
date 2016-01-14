package br.com.hackerrank.day8;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Integer n = Integer.parseInt(in.nextLine());
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			phoneBook.put(name, String.valueOf(phone));
		}
		while (in.hasNext()) {
			String queryKey = in.nextLine();
			String queryValue = phoneBook.get(queryKey.toString());
			if (queryValue != null) {
				System.out.println(queryKey + "=" + queryValue);
			} else {
				System.out.println("Not found");
			}
		}
	}

}