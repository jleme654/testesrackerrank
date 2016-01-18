package br.com.hackerrank.contratado.teste7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int N = 1;//sc.nextInt();
		int qtdeAcesso = 0;
		for (int i = 0; i < N; i++) {
			int qtdePalavrasVelhas = 3;//sc.nextInt();
			int qtdePalavrasNovas = 2;//sc.nextInt();
			// int qtdePalavrasNovas = qtdePalavrasVelhas * qtdeAcesso;
			
//			if (qtdeAcesso == 0) {
//				qtdeAcesso = sc.nextInt();
//			}

			String[] arrVelhas = {"piygu", "ezyfo", "rzotm"};//new String[qtdePalavrasVelhas];
//			for (int j = 0; j < qtdePalavrasVelhas; j++) {
//				String pal = sc.next();
//				arrVelhas[j] = pal;
//			}

			
			String[] arrNovas = {"tefwz", "tefwz" ,"piygu", "ezyfo", "tefwz", "piygu"};//new String[qtdePalavrasNovas];
//			for (int j2 = 0; j2 < qtdePalavrasNovas; j2++) {
//				String pal = sc.next();
//				arrNovas[j2] = pal;
//			}

			for (int x = 0; x < qtdePalavrasVelhas; x++) {
				List listNovas = Arrays.asList(arrNovas);
				if (listNovas.contains(arrVelhas[x].toString())) {
					System.out.print("YES ");
				} else {
					System.out.print("NO ");
				}
			}
            System.out.println();
		}
	}

}
