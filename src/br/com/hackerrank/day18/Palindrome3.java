package br.com.hackerrank.day18;

import java.util.ArrayList;

class Palindrome3 {

	Object[] pilha;
	int posicaoPilha;
	ArrayList<Character> list;
	ArrayList<Character> list2;

	public Palindrome3() {
		this.posicaoPilha = -1;
		this.pilha = new Object[100];
		list = new ArrayList<Character>();
		list2 = new ArrayList<Character>();
	}

	public void pushCharacter(char c) {
		if (this.posicaoPilha < this.pilha.length - 1) {
			this.pilha[++posicaoPilha] = c;
			list.add(c);
		}
	}
	
	public boolean pilhaVazia() { 
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	public void enqueueCharacter(char c) {
		if (pilhaVazia()) {
			return;
		}
		list2.add(c);
		this.posicaoPilha--;
	}

	public Object popCharacter() {
		return this.pilha[list2.get(0)];
	}

	public Object dequeueCharacter() {
		return this.pilha[1];
	}

}