package br.com.hackerrank.day21;

public class Printer {

	public void printArray(Object[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			char c = stringArray[i].toString().charAt(0);
			if (Character.isDigit(c)) {
				System.out.println(stringArray[i]);
			} else {
				System.out.println(stringArray[i]);
			}
		}

	}

}
