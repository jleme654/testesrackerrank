package br.com.codilty;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Teste1 {
	
	int solution(int A[], int N) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.length; i++) {
			map.put(i, A[i]);
		}

//		System.out.println(map);
//		for (Entry<Integer, Integer> entry : map.entrySet()) {
//		    System.out.println(entry.getKey() + "/" + entry.getValue());
//		}

		System.out.println(map.values());
		
		Collection<Integer> lista = map.values();
		int somaAntes = 0;
		int somaDepois = 0;
		int P = 0;
		for (int i = 0; i < lista.size()-1; i++) {
			
			if (i==0) {
				//soma total
				//somaAntes = map.get(i) + map.get(i+1);
				somaAntes = map.get(i);
				P = map.get(i+1);
				somaDepois = map.get(i+2);
			}
			else{
				//soma total
				//somaAntes = somaAntes + map.get(i+1);
				//somaAntes = somaAntes + map.get(i+1);
				//P = map.get(i+1);
				//somaDepois = map.get(i+1) + map.get(i+2);
			}
		}
		System.out.println("Soma antes :"+ somaAntes);
		System.out.println("Ponto de equilibrio: "+P);
		System.out.println("Soma depois: "+somaDepois);
		
		//if no equilibrium index exists retun -1
		System.out.println("No equilibrium index exists");
		return -1;
	}
	
	public static void main(String[] args) {
		//int A[] = {3,7, 4 , 9,1,6,3};
		int A[] = {-1,3,-4,5,1,-6,2,1};
		int N = 4;
		new Teste1().solution(A, N);
	}

}
