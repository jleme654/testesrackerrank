package br.com.hackerrank.day16;

import java.io.*;
import java.util.*;

public class Solution29 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 for (int i = 0; i < arr.length; i++) {
		    arr[i] = sc.nextInt();
		 }

		int z = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> list2 = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[i] == arr[j]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					list.add(z);
					list2.add(arr[i]);
					list2.add(arr[j]);
				}
			}
		}

		Object[] arrFinal = list.toArray();
		Arrays.sort(arrFinal);
		int minor = (int) arrFinal[0];

		Object[] arrFinal2 = list2.toArray();
		Arrays.sort(arrFinal2);

		for (int i = 0; i < arrFinal2.length - 1; i++) {
			int dif = (int) arrFinal2[i + 1] - (int) arrFinal2[i];
			if (dif == minor) {
				System.out.print((int) arrFinal2[i] + " " + (int) arrFinal2[i + 1] + " ");
			}
		}
	}

}
