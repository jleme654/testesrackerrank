package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution26 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		// int[] arr = { 5, 4, 3, 2 };
//        int[] arr = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 };
        int[] arr = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};


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
