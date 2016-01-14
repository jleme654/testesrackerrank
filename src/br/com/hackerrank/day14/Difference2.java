package br.com.hackerrank.day14;

public class Difference2 {

	private int[] elements;
	public int maximumDifference;

	public Difference2(int[] a) {
		elements = a;
	}

	public void computeDifference() {
		int[] arrSum = new int[elements.length + 1];
		int i = 0;
		for (i = 0; i < elements.length -1; i++) {
			for (int j = elements.length - 1; j > 0; j--) {
				if (elements[i] != elements[j]) {
					int num = elements[i] - elements[j];
					arrSum[i] = num;
					System.out.println("|" + elements[i] + " " + elements[j] + "|" + num);
				}
			}
		}

		System.out.println("-------------------");
		int major = 0;
		for (i = 0; i < arrSum.length; i++) {
			System.out.println(arrSum[i]);
			if (major > arrSum[i]) {
				major = arrSum[i];
			}
		}
		maximumDifference = Math.abs(major);

	}

}
