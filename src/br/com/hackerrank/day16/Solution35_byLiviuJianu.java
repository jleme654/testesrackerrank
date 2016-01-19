package br.com.hackerrank.day16;

import java.util.Arrays;

public class Solution35_byLiviuJianu {

	public static void main(String[] args) {
		//int[] list = { 5, 4, 3, 2 };
		int[] list = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 };

		// abs min
		int minDifference = Math.abs(list[1] - list[0]);
		StringBuilder sb = new StringBuilder();
		Arrays.sort(list);

		for (int i = 1; i < list.length; i++) {
			int currentDifference = Math.abs(list[i] - list[i - 1]);
			if (currentDifference < minDifference) {
				sb = new StringBuilder();
				sb.append(list[i - 1] + " " + list[i] + " ");
				minDifference = Math.min(currentDifference, minDifference);
			} else if (currentDifference == minDifference) {
				sb.append(list[i - 1] + " " + list[i] + " ");
			}
		}
		System.out.println(sb.toString());

	}

}
