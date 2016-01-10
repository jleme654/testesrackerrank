package br.com.hackerrank.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < num; i++) {
			String name = in.next();
			int phone = in.nextInt();
			map.put(name.toLowerCase().toString(), phone);
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			int phone = entry.getValue();
			String phoneStr = String.valueOf(phone);
			String name = entry.getKey();
			if (phoneStr.length() != 8 || phoneStr.startsWith("0")) {
				return;
			}
			Pattern p = Pattern.compile("[a-zA-Z]+");
			Matcher m = p.matcher(name);
			System.out.println(m.matches());
			if (name.matches("[a-zA-Z]")){
				return;
			}
		}

		ArrayList<String> nomes = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			String nome = in.next();
			nomes.add(nome.toLowerCase().toString());
		}

		List<String> nomesComp = new ArrayList<String>();

		for (Entry<String, Integer> entry : map.entrySet()) {
			nomesComp.add(entry.getKey());
		}

		for (String st : nomes) {
			if (nomesComp.contains(st)) {
				for (Entry<String, Integer> entry : map.entrySet()) {
					if (st.equals(entry.getKey())) {
						System.out.println(entry);
					}
				}
			} else {
				System.out.println("Not found");
			}
		}
	}
}
