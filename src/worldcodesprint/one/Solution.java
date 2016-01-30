package worldcodesprint.one;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		int count = 0;
		LinkedList<String> lista = new LinkedList<String>();
		if (S.length() % 3 == 0) {
			for (int i = 0; i < S.length() - 2; i++) {
				char c = S.charAt(i);
				char c2 = S.charAt(i + 1);
				char c3 = S.charAt(i + 2);
				StringBuilder sb = new StringBuilder();
				sb.append(c).append(c2).append(c3);
				lista.add(sb.toString());
				i = i + 2;
			}
		}
		for (String s : lista) {
			if (!s.equals("SOS")) {
				count++;
			}
			System.out.println(s);
		}
		System.out.println(count);
	}

}
