package br.com.bold2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.IRObject;

public class SolutionImpl3 implements Solution2{

	@Override
	public int candy(int[] ratings) {
		for (int i = 0; i < ratings.length; i++) {
			int j = ratings[i];
			if (ratings[i] == ratings[i-1]) {
				
			}
			
		}
		
		return 2;
		
	}
	
	public static void main(String[] args) {
		int[] ratings = {8,6,9,6};
		System.out.println(new SolutionImpl3().candy(ratings));
	}

}
