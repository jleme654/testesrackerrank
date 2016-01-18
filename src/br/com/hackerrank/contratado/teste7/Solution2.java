package br.com.hackerrank.contratado.teste7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 1; // sc.nextInt();
		for (int i = 0; i < N; i++) {
			int qtdePalavrasVelhas = 2;// sc.nextInt();
			int qtdeAcesso = 2;// ;sc.nextInt();
			int qtdePalavrasNovas = qtdePalavrasVelhas * qtdeAcesso;

			String[] arrVelhas = new String[qtdePalavrasVelhas];
			for (int j = 0; j < qtdePalavrasVelhas; j++) {
				String pal = sc.next();
				arrVelhas[j] = pal;
			}

			for (int j = 0; j < arrVelhas.length; j++) {
				System.out.print(arrVelhas[j] + " ");
			}

			String[] arrNovas = new String[qtdePalavrasNovas];
			for (int j2 = 0; j2 < qtdePalavrasNovas; j2++) {
				String pal = sc.next();
				arrNovas[j2] = pal;
			}

			for (int x = 0; x < arrVelhas.length; x++) {
				List listNovas = Arrays.asList(arrNovas);
				if (listNovas.contains(arrVelhas[x].toString())) {
					System.out.print("YES ");
				} else {
					System.out.print("NO ");
				}
			}

		}
	}

}
