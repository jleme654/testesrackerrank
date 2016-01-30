package worldcodesprint.one;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		int c = 0;
		if (S.length() % 3 == 0) {
			StringTokenizer z = new StringTokenizer(S, "SOS");
//			while (z.hasMoreTokens()) {
//    			//z.countTokens();
//				System.out.println(z.countTokens());
//				c++;
//
//			}
			System.out.println(z.countTokens());
		}
	}

}
