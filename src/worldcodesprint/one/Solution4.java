package worldcodesprint.one;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count = 0;
		if (s.length() % 3 == 0) {
			s = s.toLowerCase();
			for (int i = 0; i < s.length() - 2; i++) {
				char c = s.charAt(i);
				char c2 = s.charAt(i + 1);
				char c3 = s.charAt(i + 2);
				if (c != 's' || c2 != 'o' || c3 != 's') {
					count++;
				}
				i = i + 2;
			}
		}
		System.out.println(count);
	}
}
