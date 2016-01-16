package br.com.hackerrank.infinitum141;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> listFinalZero = new ArrayList<String>();
		ArrayList<String> listInitialZero = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append(String.valueOf(x));
			sb.append(String.valueOf(y));
			list.add(sb.toString());
		}
		
		for (String s : list) {
			if (s.startsWith("0")) {
				listInitialZero.add(s);
			} else {
				listFinalZero.add(s);
			}
		}

		float[] arr = new float[2];
		float result = 0, result2 = 0;
		for (String s : listInitialZero) {
			String s2 = s.replaceAll("-", "");
			String s4 = s2.substring(1, s2.length());
			float y = Float.parseFloat(s4);
			result += y;
			arr[0] = result;
		}

		for (String s : listFinalZero) {
			String s2 = s.replaceAll("-", "");
			String s4 = s2.substring(0, 1);
			float x = Float.parseFloat(s4);
			result2 += x;
			arr[1] = result2;
		}

		float major = 0;
		for (int i = 0; i < arr.length; i++) {
			major = arr[0];
			if (arr[i] > major) {
				major = arr[i];
			}
		}		
		System.out.println(String.valueOf(major).concat("00000000000"));

	}
}
