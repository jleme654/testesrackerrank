package br.com.hackerrank.contratado.teste7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int qtde1 = sc.nextInt();
			int qtde2 = sc.nextInt();

			String[] arr1 = new String[qtde1];
			for (int j = 0; j < qtde1; j++) {
				String pal = sc.next();
				arr1[j] = pal;
			}
			List<String> listFinal = new ArrayList<String>();
			for (int j = 0; j < qtde2; j++) {
				int num2 = sc.nextInt();
				for (int k = 0; k < num2; k++) {
					String pal = sc.next();
					listFinal.add(pal);
				}
			}
			for (int x = 0; x < qtde1; x++) {
				System.out.println(listFinal.contains(arr1[x].toString()) == true ? "YES " : " NO");
			}
			System.out.println();
		}
	}

}
