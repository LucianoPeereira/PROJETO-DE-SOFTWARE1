package edu.udc.psw7_2;

public class Aplicação {
	
	public static void main(String[] args) {

		Retangulo ret = new Retangulo();
		System.out.printf("Retangulo \nArea: %.2f, Perimetro: %.2f", ret.area(), ret.perimetro());
		
		ret.setComprimento(0);
		ret.setLargura(0);
		System.out.printf("\nRetangulo \nArea: %.2f, Perimetro: %.2f", ret.area(), ret.perimetro());
		
	
	}
}
