package br.com.hackerrank.day18;

public class Palindrome4 {

	Object[] pilha;
	int posicaoPilha;
	
	public Palindrome4() {
		this.posicaoPilha = -1;
		this.pilha = new Object[100];
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
		}
	}

	public void enqueueCharacter(char c) {
		if (pilhaVazia()) {
			return;
		}
		this.posicaoPilha--;
	}

	public Object popCharacter() {
		return this.pilha[++this.posicaoPilha];
	}

	public Object dequeueCharacter() {
		return this.pilha[this.posicaoPilha--];
	}

}
