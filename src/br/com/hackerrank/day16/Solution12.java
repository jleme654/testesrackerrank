package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution12 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
		int[] arr = { 5, 4, 3, 2 };
//			int[] arr = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 };
		
		int z = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[i] == arr[j]) {
					break;
				}else{
					z = arr[i] - arr[j];
					z = Math.abs(z);
					list.add(z);
				}
			}
		}
		
        //looking for the minor diference
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
				}else{
					z = arr[i] - arr[j];
					z = Math.abs(z);
					if (z == minor) {
						listResult2.add(arr[j]);
						listResult2.add(arr[i]);
					}
				}
			}
		}
			
		//sort in ascending order
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
		
		//printing the result
		for (int i = 0; i < arrFinal.length; i++) {
			System.out.print(arrFinal[i] + " ");
		}
	}
}
