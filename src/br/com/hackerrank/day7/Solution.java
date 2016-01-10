package br.com.hackerrank.day7;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
