package br.com.hackerrank.day18;

public class Pilha {
	public Object[] pilha;
	public int posicaoPilha;

	public Pilha() {
		this.posicaoPilha = -1;
		// indica que esta nula, vazia, pois posição um indica que contém
		// informação
		this.pilha = new Object[1000];
		// criando uma pilha com 1000 posições
	}

	public int tamanho() {
		// is
		if (this.pilhaVazia()) {
			return 0;
		}
		return this.posicaoPilha + 1;
	}

	public Object exibeUltimoValor() {
		// top
		if (this.pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha];
	}

	public Object desempilhar() {
		// pop
		if (pilhaVazia()) {
			return null;
		}
		System.out.println(this.posicaoPilha + ": " + this.pilha[this.posicaoPilha]);
		return this.pilha[this.posicaoPilha--];
	}

	public void empilhar(Object valor) {
		// push
		if (this.posicaoPilha < this.pilha.length - 1) {
			this.pilha[++posicaoPilha] = valor;
			System.out.println(posicaoPilha + ": "+valor);
		}
	}

	public boolean pilhaVazia() { 
		// isEmpty
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Pilha p = new Pilha();
		p.empilhar("Portuguesa ");
		p.empilhar("Frango com catupiry ");
		p.empilhar("Calabresa ");
		p.empilhar("Quatro queijos ");
		p.empilhar(10);
		while (p.pilhaVazia() == false) {
			p.desempilhar();
		}

	}


}
