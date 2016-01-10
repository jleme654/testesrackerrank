package br.com.hackerrank.day8;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) throws ParseException {
		System.out.println(isCampoValido("9a"));
		System.out.println(isCampoValido("9A"));
		System.out.println(isCampoValido("a9a"));
		System.out.println(isCampoValido("9a0"));
		System.out.println(isCampoValido("9a+"));
	}
	public static boolean isCampoValido(String texto){   
	    Pattern p = Pattern.compile("[a-zA-Z0-9]+");   
	    Matcher m = p.matcher(texto);   
	    return m.matches();   
	}  

}
