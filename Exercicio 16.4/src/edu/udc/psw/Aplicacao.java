package edu.udc.psw;

public class Aplicacao {

	public static void main (String [] args) {
		Fila fila = new Fila();

		fila.queue(new Ponto2D(1, 2));
		fila.queue(new Ponto2D(3, 4));
		fila.queue(new Ponto2D(5, 6));
		fila.queue(new Ponto2D(7, 8));
		fila.queue(new Ponto2D(9, 10));
		fila.queue(new Ponto2D(11, 12));
		fila.queue(new Ponto2D(13, 14));
		fila.queue(new Ponto2D(15, 16));

		System.out.println("Tamanho Fila: " + fila.getTamanho());
		
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		
		System.out.println("Tamanho Fila: " + fila.getTamanho());
	}
}