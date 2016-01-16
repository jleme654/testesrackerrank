package br.com.hackerrank.day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution7 {

	public static void main(String[] args) {
		// double a = 5;
		// double b = 3;
		// double max = Math.max(a, b);
		// System.out.println(max);

		//int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr = { 5, 4, 3, 2 };
//		int[] arr = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470}; 
		int z = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				z = arr[i] - arr[j];
				z = Math.abs(z);
//				System.out.print(arr[i] + " " + arr[j] + " = " + z);
				list.add(z);
//				System.out.println();
			}
//			System.out.println("-----------");
		}
		
		Object[] arrComp = null;
		arrComp = list.toArray();
		
//		System.out.println(arrComp.length);
		int minor = (int) arrComp[0];
		for (int i = 0; i < arrComp.length; i++) {
//			System.out.print(arrComp[i]+ " ");
			if ((int)arrComp[i] < minor && (int)arrComp[i] != 0) {
				minor = (int)arrComp[i];
			}
		}	
//		System.out.println("menor: "+minor);
//		System.out.println("==============");
		
		HashSet<Integer> setFinal = new HashSet<Integer>();
		ArrayList<String> listResult = new ArrayList<String>();
		for (int j = arr.length - 1; j > 0; j--) {
			for (int i = 0; i < arr.length; i++) {
				z = arr[i] - arr[j];
				z = Math.abs(z);
				if (z==minor && arr[j] < arr[i]) {
					System.out.print(arr[j]+ " " + arr[i] + " ");
					setFinal.add(arr[j]);
					setFinal.add(arr[i]);
					
					StringBuilder sb = new StringBuilder();
					sb.append(String.valueOf(arr[j]));
					sb.append(" ");
					sb.append(String.valueOf(arr[i]));
					listResult.add(sb.toString());
				}
				System.out.println();
			}
			System.out.println("-----------");
		}
		
		for (String string : listResult) {
			System.out.print(string + " ");
		}
		
		Object[] arrFinal = setFinal.toArray();
//		for (int i = 0; i < arrFinal.length; i++) {
//			System.out.print(arrFinal[i]+" ");
//		}
		for (Integer integer : setFinal) {
			System.out.print(integer+" ");
			System.out.println();
		}
		
		int cont1, cont2,aux;
        for(cont1 =0; cont1< arrFinal.length; cont1++){
            for(cont2 =0; cont2 < arrFinal.length - 1; cont2++){
               if((int)arrFinal[cont2]> (int)arrFinal[cont2+1]){
                    aux = (int)arrFinal[cont2];
                    arrFinal[cont2] = arrFinal[cont2+1];
                    arrFinal[cont2+1] = aux;
                }
            }
        }      
        
        for (int i = 0; i < arrFinal.length; i++) {
			System.out.print(arrFinal[i]+" ");
		}
		
	}
}
 