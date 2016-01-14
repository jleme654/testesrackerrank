package br.com.hackerrank.day14;

import java.util.ArrayList;

public class Difference {

	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		elements = a;
	}

	public void computeDifference() {
		int i = 0, major = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (i = 0; i < elements.length -1; i++) {
			for (int j = elements.length - 1; j > 0; j--) {
				if (elements[i] != elements[j]) {
					int num = elements[i] - elements[j];
					num = Math.abs(num);
					list.add(num);
				}
			}
		}
		
		for (Integer integer : list) {
			if (integer > major) {
				major = integer;
			}
		}
		maximumDifference = major;

	}

}
