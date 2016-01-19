package br.com.hackerrank.contratado.teste7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		String str = "";
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
				String[] arr2 = new String[num2];
				for (int k = 0; k < num2; k++) {
					String pal = sc.next();
					listFinal.add(pal);
				}
			}
	
			for (int x = 0; x < qtde1; x++) {
				if (listFinal.contains(arr1[x].toString())) {
					System.out.print("YES ");
				} else {
					System.out.print("NO ");
				}
			}
            System.out.println();
		}
	}

}
