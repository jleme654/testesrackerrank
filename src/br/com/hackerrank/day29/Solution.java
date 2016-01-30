package br.com.hackerrank.day29;

import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = Integer.parseInt(sc.nextLine());
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int count = 0, count2 = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			StringBuffer r = new StringBuffer(s);
			r.reverse();
			for (int j = 0; j < s.length() - 1; j++) {
				int x = Math.abs((int) s.charAt(j + 1) - (int) s.charAt(j));
				int y = Math.abs((int) r.charAt(j + 1) - (int) r.charAt(j));

				if (x != y) {
					count2++;
					list2.add(count2++);
				} else {
					count++;
					list.add(count++);
				}
			}
			if (list2.size() >= list.size())
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
			list = new ArrayList<Integer>();
			list2 = new ArrayList<Integer>();
		}
	}
}
