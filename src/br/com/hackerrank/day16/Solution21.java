package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution21 {

	static int getMinorValue(HashSet setList) {
		Object[] arrComp = null;
		if (setList.isEmpty()) {
			return -1;
		} else {
			arrComp = setList.toArray();
			int minor = (int) arrComp[0];
			for (int i = 0; i < arrComp.length; i++) {
				if ((int) arrComp[i] < minor && (int) arrComp[i] != 0) {
					minor = (int) arrComp[i];
				}
			}
			return minor;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// int[] arr = { 5, 4, 3, 2 };
		// int[] arr = { -20, -3916237, -357920, -3620601, 7374819, -7330761,
		// 30, 6246457, -6461594, 266854, -520, -470 };

		int z = 0;
		HashSet<Integer> listNegative = new HashSet<Integer>();
		HashSet<Integer> listPositive = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				listNegative.add(Math.abs(arr[i]));
			} else {
				listPositive.add(Math.abs(arr[i]));
			}
		}

		int minorNegative = getMinorValue(listNegative);
		int minorPositive = getMinorValue(listPositive);
		int minor = minorNegative + minorPositive;

		// adding in a list the nummber pairs with minor diference
		ArrayList<Integer> listResult2 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[j] == arr[i]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					if (z == minor) {
						listResult2.add(arr[i]);
						listResult2.add(arr[j]);
					}
				}
			}
		}

		// sort in ascending order with API Java Arrays.sort
		Object[] arrFinal = listResult2.toArray();
		Arrays.sort(arrFinal, 0, arrFinal.length);

		for (int i = 0; i < arrFinal.length; i++) {
			System.out.print(arrFinal[i] + " ");
		}
	}
}
