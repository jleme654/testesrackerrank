package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int z = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				z = arr[i] - arr[j];
				z = Math.abs(z);
				list.add(z);
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

		ArrayList<Integer> listResult2 = new ArrayList<Integer>();
		for (int j = arr.length - 1; j > 0; j--) {
			for (int i = 0; i < arr.length; i++) {
				z = arr[i] - arr[j];
				z = Math.abs(z);
					if (z == minor) {
						listResult2.add(arr[j]);
						listResult2.add(arr[i]);
					}
			}
		}
				
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
		}
		
		for (int i = 0; i < arrFinal.length; i++) {
			if ((i + 3) < arrFinal.length) {
				int a = Math.abs((int) arrFinal[i]);
				int b = Math.abs((int) arrFinal[i + 1]);
				int c = Math.abs((int) arrFinal[i + 2]);
				int d = Math.abs((int) arrFinal[i + 3]);
				if (a == b	&& c == d) {
					System.out.print(arrFinal[i + 1] + " ");
			    }
			} else{
				System.out.print(arrFinal[i]+ " ");
			}
		}
	}
}
