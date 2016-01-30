package worldcodesprint.two;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			list.add(s);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("-----------------------");
			String str = list.get(i);
			System.out.println(str);
			for (int j = 0; j < str.length() - 1; j++) {
				char c = str.charAt(j);
				for (int k = list.size() - 1; k > 1; k--) {
					String str2 = list.get(k);
					if (str2.contains(String.valueOf(c))) {
						System.out.println("repet " + c);
						list2.add(c);
					}
				}
			}
		}

		for (Character c : list2) {
			System.out.print(c + " ");
		}
		
		System.out.println();

		int tam = list2.size();
		for (int i = 0; i < tam; i++) {
			char c = list2.get(i);
			int count = 0;
			for (int j = tam - 1; j > -1 ; j--) {
				if (i == j) {
					break;
				}
				char c2 = list2.get(j);
				if (c == c2) {
					count++;
					System.out.println("\n"+ c + "-"+count);
				}
			}
			System.out.println(count);
		}
	}

}
