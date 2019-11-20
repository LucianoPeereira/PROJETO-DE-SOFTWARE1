package edu.udc.psw;

public class Aplicacao {

	public static void main (String [] args) {
		Pilha<Ponto2D> pilha = new Pilha<Ponto2D>();

		pilha.push(new Ponto2D(1, 2));
		pilha.push(new Ponto2D(3, 4));
		pilha.push(new Ponto2D(5, 6));
		pilha.push(new Ponto2D(7, 8));
		pilha.push(new Ponto2D(9, 10));
		pilha.push(new Ponto2D(11, 12));
		pilha.push(new Ponto2D(13, 14));
		pilha.push(new Ponto2D(15, 16));

		System.out.println("Tamanho Pilha: " + pilha.getTamanho());
		
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
		System.out.println("Tamanho Pilha: " + pilha.getTamanho());
	}
}