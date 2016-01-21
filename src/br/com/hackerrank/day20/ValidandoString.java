package br.com.hackerrank.day20;

import java.util.StringTokenizer;

class ValidandoString {
	public static void main(String[] args) {
		//String texto = "Texto a ser Corrigido.";
		String texto = "He is a very very good boy, isn't he?";
		StringBuffer textoCorrigido = new StringBuffer();
		StringTokenizer token = new StringTokenizer(texto, "![ ,?.\\_'@+]");
		int count = 0;
		while (token.hasMoreTokens()) {
			textoCorrigido.append(token.nextToken() + "\n");
			count++;
		}
		System.out.println(count);
		System.out.println(textoCorrigido);
	}
}