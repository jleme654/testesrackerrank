package br.com.hackerrank.day17;

class Calculator {

	public int power(int n, int p) throws Exception {
		int result = 0;
		if (n < 0 || p < 0) {
			throw new Exception(showMessage());
		}
		result = (int) Math.pow(n, p);
		return result;
	}

	public String showMessage() {
		return "n and p should be non-negative";
	}

}
