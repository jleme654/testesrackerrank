package br.com.hackerrank.day16;

import java.util.Arrays;

public class Solution36_byWensheng {

	public static void main(String[] args) {
		//int[] list = { 5, 4, 3, 2 };
		int[] arr = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 };

//		arr = Arrays.stream(arr).distinct().sorted().toArray();
		Arrays.sort(arr);
	    int mind = 100000000;
	    StringBuilder ans = new StringBuilder();
	    for (int i=0; i<arr.length-1; i++) {
	        int diff = (int) Math.abs(arr[i]-arr[i+1]);
	        if ( diff < mind ) { 
	            mind = diff;
	            ans.setLength(0);
	            ans.append(arr[i]+" "+arr[i+1]+" ");
	        }
	        else if ( diff == mind ) {
	            ans.append(arr[i]+" "+arr[i+1]+" ");
	        }
	    }
	    System.out.print(ans);
	}

}
