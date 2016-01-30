package worldcodesprint.one;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution6 {

	public static void main(String[] args) {
		int c = 0;
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		int count = 0;
		if (S.length() % 3 == 0) {
			StringTokenizer z = new StringTokenizer(S, "SOS");
			while (z.hasMoreElements()) {
				System.out.println(z.nextToken());
				count++;
			}
		}
		System.out.println(count);
	}

}
