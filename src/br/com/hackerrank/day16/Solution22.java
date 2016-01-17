package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// adding the all diferences between the number pairs
		int z = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[i] == arr[j]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					list.add(z);
				}
			}
		}

		// looking for the minor diference
		Object[] arrComp = null;
		arrComp = list.toArray();
		int minor = (int) arrComp[0];
		for (int i = 0; i < arrComp.length; i++) {
			if ((int) arrComp[i] < minor && (int) arrComp[i] != 0) {
				minor = (int) arrComp[i];
			}
		}

		// adding in a list the nummber pairs with minor diference
		ArrayList<Integer> listResult2 = new ArrayList<Integer>();
		for (int j = arr.length - 1; j > 0; j--) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[j] == arr[i]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					if (z == minor) {
						listResult2.add(arr[j]);
						listResult2.add(arr[i]);
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
