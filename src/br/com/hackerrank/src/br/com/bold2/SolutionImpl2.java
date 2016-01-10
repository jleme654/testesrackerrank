package br.com.bold2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.IRObject;

public class SolutionImpl2 implements Solution2{

	@Override
	public int candy(int[] ratings) {
		//converte o array de inteiros em lista (Collections)
	    List<Integer> lista = new ArrayList<Integer>();
	    for (int i = 0; i < ratings.length; i++) {
			lista.add(ratings[i]);
		}
	    //System.out.println(lista);
	  
	    //compara os elementos e os ordena em ordem crescente
	    Collections.sort (lista, new Comparator() {  
            public int compare(Object p1, Object p2) { 
            	Integer o1 = (int)p1;
            	Integer o2 = (int)p2;
                return o1.intValue() < o2.intValue() ? -1 : (o1.intValue() > o2.intValue() ? +1 : 0);  
            }  
        }); 
	    //System.out.println(lista+" .Tamanho: "+lista.size());
	    
	    int total = 0;
	    
	    Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
	    Map<Integer, Integer> mapaNao = new HashMap<Integer, Integer>();
	    
	    int parcialRepetido = 1;
    	int parcialNaoRepetido = 2;
	    
	    
	    for (int i = 1; i < lista.size(); i++) {
	    	
	    	if (lista.get(i-1) == lista.get(i)) {
				
				mapa.put(i, lista.get(i));
				//System.out.println("mapa: "+mapa);
				
				
				//parcialRepetido = lista.get(i);
				
				parcialRepetido = mapa.get(i)+1;
				//System.out.println("tamanho mapa: "+parcialRepetido);
				//System.out.println("parcial repetido: "+parcialRepetido);
				
			}else{
		
				mapaNao.put(i, lista.get(i));
				parcialNaoRepetido = mapaNao.get(i)+1;
				
				
				parcialNaoRepetido = parcialNaoRepetido + (parcialNaoRepetido--);
				parcialNaoRepetido--;
			}
		}
	    System.out.println("numeros repetidos: "+parcialRepetido);
	    System.out.println("numeros nao repedtidos: "+ parcialNaoRepetido);
	    total = parcialRepetido + (parcialNaoRepetido);
	   
		return total;
	}
	
	public static void main(String[] args) {
		int[] ratings = {6,6,9,8};
		System.out.println(new SolutionImpl2().candy(ratings));
	}

}
