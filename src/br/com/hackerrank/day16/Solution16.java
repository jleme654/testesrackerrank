package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Solution16 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		int[] arr = { 5, 4, 3, 2 };
		
		int z = 0;
		HashSet<Integer> list = new HashSet<Integer>();
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
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[j] == arr[i]) {
					break;
				} else {
					z = arr[i] - arr[j];
					z = Math.abs(z);
					if (z == minor) {
//						listResult2.add(arr[j]);
//						listResult2.add(arr[i]);
						map.put(arr[j], arr[i]);
					}
				}
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			System.out.print(entry.getKey() + " " + entry.getValue() + " ");
		}
		

		// sort in ascending order
		Object[] arrFinal = listResult2.toArray();
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < arrFinal.length; cont1++) {
			for (cont2 = 0; cont2 < arrFinal.length - 1; cont2++) {
				if ((int) arrFinal[cont2] > (int) arrFinal[cont2 + 1]) {
					aux = (int) arrFinal[cont2];
					arrFinal[cont2] = arrFinal[cont2 + 1];
					arrFinal[cont2 + 1] = aux;
				}
			}
			System.out.print(arrFinal[cont1] + " ");
		}
	}

}
