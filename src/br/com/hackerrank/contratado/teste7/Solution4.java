package br.com.hackerrank.contratado.teste7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution4 {

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
			
			
			for (int j = 0; j < qtde2; j++) {
				
			}
			
			if (num == 0 && str.equals("")) {			
				num = sc.nextInt();
				str = sc.nextLine();
			}
			
			
			
			
			
			int qtdeTests = sc.nextInt();
			String[] arr2 = new String[qtdeTests];
			for (int j2 = 0; j2 < qtdeTests; j2++) {
				String pal = sc.next();
				arr2[j2] = pal;
			}

			for (int x = 0; x < qtde1; x++) {
				List listNovas = Arrays.asList(arr2);
				if (listNovas.contains(arr1[x].toString())) {
					System.out.print("YES ");
				} else {
					System.out.print("NO ");
				}
			}
            System.out.println();
		}
	}

}
