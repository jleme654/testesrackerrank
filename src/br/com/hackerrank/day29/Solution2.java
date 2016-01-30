package br.com.hackerrank.day29;

import java.util.Scanner;

public class Solution2 {


	static int getSeqNormal(String s, char[] arr) {
		int dif = 0;
		int[] arr2 = new int[2];
		for (int j = 1; j < s.length() - 1; j++) {
			for (int k = 0; k < arr.length; k++) {
				char c = s.charAt(j - 1);
				char c2 = s.charAt(j);
				if (arr2[0] != 0 && arr2[1] != 0) {
					break;
				}
				if (c == arr[k]) {
					arr2[1] = k + 1;
				}
				if (c2 == arr[k]) {
					arr2[0] = k + 1;
				}
			}
			return dif = Math.abs(arr2[1] - arr2[0]);
		}
		return dif;
	}

	static int getSeqReverse(String s, char[] arr) {
		int dif = 0;
		int[] arr2 = new int[2];
		for (int j = s.length(); j > 0 - 1; j--) {
			for (int k = 0; k < arr.length; k++) {
				char c = s.charAt(j - 1);
				char c2 = s.charAt(j - 2);
				if (arr2[0] != 0 && arr2[1] != 0) {
					break;
				}
				if (c == arr[k]) {
					arr2[1] = k + 1;
				}
				if (c2 == arr[k]) {
					arr2[0] = k + 1;
				}
			}
			return dif = Math.abs(arr2[1] - arr2[0]);
		}
		return dif;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < n; i++) {
			String s = in.nextLine();
			int difNormal = getSeqNormal(s, arr);
			int difReverse = getSeqReverse(s, arr);
			if (difNormal == difReverse) 
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
	}

}
