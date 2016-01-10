package br.com.hackerrank.day10;

import java.util.Scanner;

public class Solution {
	static String converteDecimalParaBinario(int valor) {
		int resto = -1;
		StringBuilder sb = new StringBuilder();

		if (valor == 0) {
			return "0";
		}

		// enquanto o resultado da divisão por 2 for maior que 0 adiciona o
		// resto ao início da String de retorno
		while (valor > 0) {
			resto = valor % 2;
			valor = valor / 2;
			sb.insert(0, resto);
		}

		return sb.toString();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	    for (int i = 0; i < arr.length; i++) {
			System.out.println(converteDecimalParaBinario(arr[i]));
		}
	    
	}

}