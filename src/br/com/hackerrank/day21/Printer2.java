package br.com.hackerrank.day21;

import java.util.ArrayList;

public class Printer2 {

	public void printArray(Object[] stringArray) {
		ArrayList<String> listString = new ArrayList<String>();
		ArrayList<Integer> listInteger =  new ArrayList<Integer>();
		for (int i = 0; i < stringArray.length; i++) {
			char c = stringArray[i].toString().charAt(0);
			if (Character.isDigit(c)) {
				listInteger.add((Integer) stringArray[i]);
				System.out.println(stringArray[i]);
			}else{
				listString.add((String) stringArray[i]);	
				System.out.println(stringArray[i]);
			}
		}

	}

}
