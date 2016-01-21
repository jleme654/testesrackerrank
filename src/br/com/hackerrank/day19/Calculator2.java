package br.com.hackerrank.day19;

public class Calculator2 implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
		      if (n % i == 0){
		    	  System.out.println(">"+i);
				sum += i;
			  }
		}
		return sum;
	}

}
