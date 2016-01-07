package br.com.bold;

import java.util.HashSet;
import java.util.Set;

public class SolutionImpl implements Solution {

	@Override
	public boolean isUnique(String str) {
		Set<String> listaSet = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			listaSet.add(String.valueOf(str.charAt(i)));			
		}
		
		if (listaSet.size() == str.length()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(new SolutionImpl().isUnique("abcde"));
		System.out.println(new SolutionImpl().isUnique("abcbe"));
		System.out.println(new SolutionImpl().isUnique("aaaad"));
		System.out.println(new SolutionImpl().isUnique("kljqwe"));
		
	}

}
