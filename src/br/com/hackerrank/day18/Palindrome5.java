package br.com.hackerrank.day18;

import java.util.LinkedList;

public class Palindrome5 {

	Object[] pilha;
	int posicaoPilha;
	LinkedList<Character> list;
	LinkedList<Character> list2;

	public Palindrome5() {
		this.posicaoPilha = -1;
		this.pilha = new Object[100];
		list = new LinkedList<Character>();
		list2 = new LinkedList<Character>();
	}

	public boolean pilhaVazia() {
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	public void pushCharacter(char c) {
		if (this.posicaoPilha < this.pilha.length - 1) {
			this.pilha[++posicaoPilha] = c;
			list.add(c);
		}
	}

	public void enqueueCharacter(char c) {
		if (pilhaVazia()) {
			return;
		}
		list2.add(c);
		this.posicaoPilha--;
	}

	public Object popCharacter() {
		return this.pilha[++this.posicaoPilha];
	}

	public Object dequeueCharacter() {
		this.posicaoPilha = list2.size() - 1;
		return this.pilha[this.posicaoPilha--];
	}

}
