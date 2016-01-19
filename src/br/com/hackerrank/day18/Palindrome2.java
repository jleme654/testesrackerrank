package br.com.hackerrank.day18;

public class Palindrome2 {
	
	Object[] pilha;
	int posicaoPilha;

	public Palindrome2() {
		//pilha vazia ou nula
		this.posicaoPilha = -1;
		//pilha com 1000 elementos de posicao
		this.pilha = new Object[1000];
		
	}

	public void pushCharacter(char c) {
		if (this.posicaoPilha < this.pilha.length - 1) {
			this.pilha[++posicaoPilha] = c;
			System.out.println(posicaoPilha + ": "+c);
		}
	}
	
	public boolean pilhaVazia() { 
		//se a pilha esta vazia o valor da primeira posicao eh -1
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	public void enqueueCharacter(char c) {
		if (pilhaVazia()) {
			return;
		}
		System.out.println(this.posicaoPilha + ": " + this.pilha[this.posicaoPilha]);
		this.posicaoPilha--;
	}

	public Object popCharacter() {
		return this.pilha[++this.posicaoPilha];
	}

	public Object dequeueCharacter() {
		return this.pilha[this.posicaoPilha--];
	}

}
