package br.com.hackerrank.day14;

import java.util.ArrayList;

public class Difference3 {

	private int[] elements;
	public int maximumDifference;

	public Difference3(int[] a) {
		elements = a;
	}

	public void computeDifference() {
		int[] arrSum = new int[elements.length];
		System.out.println(arrSum.length);
		int i = 0, major = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (i = 0; i < elements.length -1; i++) {
			for (int j = elements.length - 1; j > 0; j--) {
				if (elements[i] != elements[j]) {
					int num = elements[i] - elements[j];
					num = Math.abs(num);
					arrSum[i] = num;
					list.add(num);
					System.out.println("|" + elements[i] + " " + elements[j] + "|" + num);
				}
			}
		}

		System.out.println("-------------------");
//		for (i = 0; i < arrSum.length; i++) {
//			System.out.println(arrSum[i]);
//			if (major > arrSum[i]) {
//				major = arrSum[i];
//			}
//		}
		
		for (Integer integer : list) {
			if (integer > major) {
				major = integer;
			}
			//System.out.println(integer);
		}
		maximumDifference = major;

	}

}
