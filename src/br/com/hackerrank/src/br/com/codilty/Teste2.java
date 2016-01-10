package br.com.codilty;

public class Teste2 {
	
	int solution(int A[], int N) {
		int P=0;
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < N-1; i++) {
			/**
			 * TODO
			 * importante: se o primeiro elemento é 
			 *             igual a zero, a soma deste primeiro bloco
			 *             é exatamente igual ao primeiro elemento.
			 *             se não
			 *             ele soma o que tem antes com o elemento posterior
			 */
			sum1 = (i==0) ?  A[i] : (sum1 + A[i]);
			sum2 = (i==(N-1)) ? A[N-1] : (sum2 + A[N-1]);
			if (sum1==sum2) {
				P = A[i];
				System.out.println("sum1="+sum1 + " : sum2="+sum2+" : P="+ P+" : N="+N);
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		//int A[] = {3,7, 4 , 9,1,6,3};
		int A[] = {-1,3,-4,5,1,-6,2,1};
		int N = A.length;
		new Teste2().solution(A, N);
	}

}
