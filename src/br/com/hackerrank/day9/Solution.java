package br.com.hackerrank.day9;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = find_gcd(a, b);
		System.out.println(gcd);
	}

	static int find_gcd(int a, int b) {
		if(a == b){
            return a;
        }
        else if( b > a ){
            return find_gcd( a, b-a );
        }
        else if( a > b ){
            return find_gcd( a - b, b );
        }
        return 0;
	}
}