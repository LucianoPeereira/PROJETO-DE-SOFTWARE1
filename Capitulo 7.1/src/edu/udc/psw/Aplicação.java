package edu.udc.psw;

import edu.udc.psw.Linha;

public class Aplicação {

	public static void main(String[] args) {

		Ponto2D p1 = new Ponto2D(2, 4);
		Ponto2D p2 = new Ponto2D(3, 9);

		System.out.print("Pontos:\n");
		System.out.println(p1);
		System.out.println(p2);
		System.out.printf("Distancia = %.2f\n", p1.distancia(p2));

		Linha l = new Linha(p1, p2); 
		System.out.printf("\nLinha %s\n", l.toString());
		
		Ponto2D p3 = new Ponto2D(1,3);
		System.out.printf("Novo ponto %s\n", p3.toString());
		l.setA(p3);
	
		System.out.printf("Nova linha %s\n", l.toString());
		
		Retangulo ret = new Retangulo(p1,p3);
		System.out.printf("\nRetangulo %s\n", ret.toString());
		
		System.out.print("\nPoligono\n");
		Poligono pol = new Poligono(10);
		for(int i=0; i<10; i++) {
			System.out.println(pol.getPontos(i));
		}
	}
}