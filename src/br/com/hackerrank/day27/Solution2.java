package br.com.hackerrank.day27;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		int t = 5, n = 6, k = 5, a = -2, b = -1, c = 0, d = 1, e = 2, f = 3;
		List list = Arrays.asList(a, b, c, d, e, f);
		System.out.println(t);
		for (int i = 0; i < t; i++) {
			System.out.println(n + " " + k);
			Collections.shuffle(list);
			int ok = 0;
			for (int j = 0; j < n; j++) {
				int actual = (int) list.get(j);
				System.out.print(actual + " ");
				if (actual <= 0)
					ok++;
				
			}
			System.out.println();
			if (ok >= k) 
				System.out.println("NO");
			else
                System.out.println("YES");
			n--;
			k--;
		}
	}

}
