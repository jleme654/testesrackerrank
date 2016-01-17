package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution25 {
	
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
		HashSet<Integer> list2 = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[i] == arr[j]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					list.add(z);
					list2.add(Math.abs(arr[i]));
					list2.add(Math.abs(arr[j]));
				}
			}
		}

		// looking for the minor diference
		Object[] arrFinal = list.toArray();
		Arrays.sort(arrFinal);
		int minor = (int) arrFinal[0];
		
		Object[] arrFinal2 = list2.toArray();
		Arrays.sort(arrFinal2);
		
//		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arrFinal2.length - 1; i++) {
//			System.out.print(arrFinal2[i] + " ");
			int dif = (int)arrFinal2[i + 1] - (int)arrFinal2[i];
			if (dif == minor) {
				System.out.print((int)arrFinal2[i] + " " +  (int)arrFinal2[i + 1] + " ");
			}
			
			
//			for (int j = 1; j < arrFinal2.length-1; j++) {
//				if ((int)arrFinal2[i] - (int)arrFinal2[j] == minor) {
//					System.out.print(arrFinal2[i] + " " + arrFinal2[j] + " ");
//				}
			
//			System.out.print(arrFinal2[i] + " ");
//			sb.append(arrFinal2[i]);
//			sb.append(" ");
//			sb.append(arrFinal2[i++]);
//			sb.append(" ");
//			System.out.print(sb.toString());
//			if (i == arrFinal2.length - 1) {
//				break;
//			}
//			if (i == 0) {
//				System.out.print(arrFinal2[i] + " " + arrFinal2[i + 1] + " ");
//			}else{
//				System.out.print(arrFinal2[i - 1] + " " + arrFinal2[i]);
//			}
		}

//		// adding in a list the nummber pairs with minor diference
//		for (int j = arrFinal2.length - 1; j > 0; j--) {
//			for (int i = 0; i < arrFinal2.length; i++) {
//				if (arrFinal2[j] == arrFinal2[i]) {
//					break;
//				} else {
//					z = (int)arrFinal2[i] - (int)arrFinal2[j];
//					z = Math.abs(z);
//					if (z == minor) {
//						System.out.print(arrFinal2[i] + " ");
//					}
//				}
//			}
//		}

//	    // sort in ascending order with API Java Arrays.sort
//		Object[] arrFinal2 = listResult2.toArray();
//		Arrays.sort(arrFinal2);
//		for (int i = 0; i < arrFinal2.length; i++) {
//			System.out.print(arrFinal2[i] + " ");
//		}
	}

}
