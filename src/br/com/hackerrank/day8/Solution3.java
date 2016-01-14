package br.com.hackerrank.day8;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

class Solution3 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String name = "";
		int phone = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			name = in.nextLine();
			phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		
		String[] arr = new String[n];
		int count = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
			arr[count] = entry.toString();
//			String nameComp = in.nextLine();
//			if (map.containsKey(nameComp)) {
////				if (String.valueOf(entry.getValue()).length()==7) {
//				    System.out.println(entry);
//					arr[count] = entry.toString();
////				}
//			}
//			else{
//				System.out.println(entry);
//				arr[count] = "Not found";
//			}
//			count++;
		}
		
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	
	}
}