package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		// double a = 5;
		// double b = 3;
		// double max = Math.max(a, b);
		// System.out.println(max);

		int[] arr = { 1, 2, 3, 4, 5 };
		int z = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				z = arr[i] - arr[j];
				z = Math.abs(z);
				System.out.print(arr[i] + " " + arr[j] + " = " + z);
				list.add(z);
				System.out.println();
			}
			System.out.println("-----------");
		}
		
		Object[] arrComp = null;
		arrComp = list.toArray();
		
		System.out.println(arrComp.length);
		int minor = (int) arrComp[0];
		System.out.println(minor);
		for (int i = 0; i < arrComp.length; i++) {
			System.out.print(arrComp[i]+ " ");
			if ((int)arrComp[i] < minor && (int)arrComp[i] != 0) {
				minor = (int)arrComp[i];
			}
		}	
		System.out.println("menor: "+minor);
	}
}
